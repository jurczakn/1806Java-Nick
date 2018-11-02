package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FRIEND")
public class Friend {
	
	@Id
	@Column(name="NAME")
	String name;
	
	@Column(name="AGE")
	int age;
	
	@Column(name="HAS_JOB")
	boolean hasJob;
	
	@Column(name="GENDER")
	String gender;

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friend(String name, int age, boolean hasJob, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.hasJob = hasJob;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHasJob() {
		return hasJob;
	}

	public void setHasJob(boolean hasJob) {
		this.hasJob = hasJob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + ", hasJob=" + hasJob + ", gender=" + gender + "]";
	}

}
