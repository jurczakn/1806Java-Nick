package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HONEYPOT")
public class HoneyPot {
	
	@Id
	@Column(name = "HONEYPOT_ID")
	@SequenceGenerator(name="HONEYPOTID_SEQ", sequenceName="HONEYPOTID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HONEYPOTID_SEQ")
	private int honeyPotId;
	
	@Column(name = "HONEYPOT_AMOUNT")
	private double honeyAmount;
	
	@Column(name = "VOLUME")
	private double honeyVolume;

	public int getHoneyPotId() {
		return honeyPotId;
	}

	public void setHoneyPotId(int honeyPotId) {
		this.honeyPotId = honeyPotId;
	}

	public double getHoneyAmount() {
		return honeyAmount;
	}

	public void setHoneyAmount(double honeyAmount) {
		this.honeyAmount = honeyAmount;
	}

	public double getHoneyVolume() {
		return honeyVolume;
	}

	public void setHoneyVolume(double honeyVolume) {
		this.honeyVolume = honeyVolume;
	}

	@Override
	public String toString() {
		return "HoneyPot [honeyPotId=" + honeyPotId + ", honeyAmount=" + honeyAmount + ", honeyVolume=" + honeyVolume
				+ "]";
	}

	public HoneyPot(int honeyPotId, double honeyAmount, double honeyVolume) {
		super();
		this.honeyPotId = honeyPotId;
		this.honeyAmount = honeyAmount;
		this.honeyVolume = honeyVolume;
	}

	public HoneyPot() {
		super();
		// TODO Auto-generated constructor stub
	}

}
