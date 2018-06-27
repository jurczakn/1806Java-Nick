INSERT INTO CUSTOMER (FIRSTNAME, LASTNAME, EMAIL) VALUES
('JACK', 'GABE', 'NULL@MAIL.COM');
CREATE SEQUENCE CUST_ID_SEQ MINVALUE 61 INCREMENT BY 1 CACHE 50;

SELECT CUST_ID_SEQ.NEXTVAL FROM DUAL;

INSERT INTO CUSTOMER (CUSTOMERID, FIRSTNAME, LASTNAME, EMAIL) 
VALUES((CUST_ID_SEQ.NEXTVAL), 'MATTHEW', 'WAYNE', 'NULL@MAIL.COM');

--TRIGGERS ARE EVENT LISTENERS FOR YOUR DB
--CAN TRIGGER ON INSERT, DELETE, AND UPDATE
--CAN RUN BEFORE, AFTER, OR INSTEAD OF (USED ONLY WITH A VIEW)
CREATE OR REPLACE TRIGGER CUST_TRIGG
BEFORE INSERT ON CUSTOMER
FOR EACH ROW
BEGIN
  SELECT CUST_ID_SEQ.NEXTVAL INTO :new.CUSTOMERID FROM DUAL;
END;
/

CREATE OR REPLACE FUNCTION CALC_TAX(T_ID NUMBER, TAX NUMBER)
  RETURN NUMBER AS
  TOTAL_PRICE NUMBER(10, 2);
  BEGIN
    SELECT UNITPRICE INTO TOTAL_PRICE FROM TRACK WHERE TRACKID = T_ID;
    TOTAL_PRICE := TOTAL_PRICE + (TAX * TOTAL_PRICE);
    RETURN TOTAL_PRICE;
  END;
/

INSERT INTO INVOICELINE 
VALUES(100000, 188, (SELECT TRACKID FROM TRACK WHERE NAME LIKE 'For Those About To Rock%'),
CALC_TAX((SELECT TRACKID FROM TRACK WHERE NAME LIKE 'For Those About To Rock%'), .25),
7);

CREATE OR REPLACE PROCEDURE INSERT_INVOICELINE
  (
    TRACKNAME IN VARCHAR2,
    TAX IN NUMBER,
    INVOICELINEID IN NUMBER,
    INVOICEID IN NUMBER,
    QUANTITY NUMBER,
    UPDATED_ROW OUT SYS_REFCURSOR
  ) AS
  BEGIN
    INSERT INTO INVOICELINE 
      VALUES(
        INVOICELINEID, INVOICEID, (SELECT TRACKID FROM TRACK WHERE NAME = TRACKNAME),
        CALC_TAX((SELECT TRACKID FROM TRACK WHERE NAME LIKE TRACKNAME), TAX),
        QUANTITY);
    OPEN UPDATED_ROW FOR SELECT * FROM INVOICELINE 
    WHERE INVOICELINEID = (SELECT MAX(INVOICELINEID) FROM INVOICELINE);
  END;
  /
  
  SET SERVEROUTPUT ON;
  
  DECLARE
    TRACK VARCHAR(255);
    TAX NUMBER;
    INVOICELINEID NUMBER;
    INVOICEID NUMBER;
    QUANTITY NUMBER;
    TRACKID NUMBER;
    UPDATED_ROW SYS_REFCURSOR;
    BEGIN
      TRACK := 'Dandelion';
      TAX := -0.05;
      INVOICELINEID := 111000;
      INVOICEID := 188;
      QUANTITY := 100000000;
      INSERT_INVOICELINE(TAX => TAX, TRACKNAME => TRACK, INVOICELINEID => INVOICELINEID, INVOICEID => INVOICEID, QUANTITY => QUANTITY, UPDATED_ROW => UPDATED_ROW);
      LOOP
        FETCH UPDATED_ROW INTO INVOICELINEID, INVOICEID, TRACKID, TAX, QUANTITY;
      EXIT WHEN UPDATED_ROW%NOTFOUND;
      
      DBMS_OUTPUT.PUT_LINE('TRACKID: ' || TRACKID || ' TOTAL COST: ' || TAX);
      
      END LOOP;
      
      CLOSE UPDATED_ROW;
      
    END;
  /




