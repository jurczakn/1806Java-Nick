package com.revature.driver;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojos.Bear;
import com.revature.pojos.HoneyPot;
import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		System.out.println("Connection Made");
		HoneyPot hp = new HoneyPot(1, 5.0, 4.0);
		Transaction tx = s.beginTransaction();
/*		s.save(hp);
		//s.persist(hp);
		hp.setHoneyVolume(100);
		//hp = (HoneyPot) s.get(HoneyPot.class, 600);
		System.out.println(hp);
		tx.commit();
		s.disconnect();
		s.close();
		s = ConnectionUtil.getSession();
		tx = s.beginTransaction();
		hp = (HoneyPot) s.load(HoneyPot.class, 1350);
		hp.setHoneyAmount(200);
		s.merge(hp);
		hp.setHoneyAmount(500);*/
		Bear panda = (Bear) s.get(Bear.class, 150);
		System.out.println(panda.getBearHome());
		System.out.println("done");
		Query query = s.getNamedQuery("@HQL_GET_ALL_BEARS");
		List<Bear> bears = query.list();
		query = s.getNamedQuery("@SQL_GET_ALL_BEARS");
		bears = query.list();
		tx.commit();
		ConnectionUtil.closeFactory();
		

	}

}
