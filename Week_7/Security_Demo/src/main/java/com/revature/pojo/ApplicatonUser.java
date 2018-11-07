package com.revature.pojo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ApplicatonUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String password;
	
	
	@ManyToMany
	@JoinTable(
			
			name="user_roles",
			joinColumns=@JoinColumn(
					name="user_id",
					referencedColumnName="id"
					),
			inverseJoinColumns=@JoinColumn(
					name="role_id",
					referencedColumnName="id"
					)
			)
	private Collection<Role> roles;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "ApplicatonUser [id=" + id + ", name=" + name + ", password=" + password + ", roles=" + roles + "]";
	}


	public ApplicatonUser(Integer id, String name, String password, Collection<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}

	public ApplicatonUser(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public ApplicatonUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
