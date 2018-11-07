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
public class Role {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	
	
	@ManyToMany(mappedBy="roles")

	private Collection<ApplicatonUser> users;

	
	@ManyToMany
	@JoinTable(
			
			name="roles_privledges",
			joinColumns=@JoinColumn(
					name="role_id",
					referencedColumnName="id"
					),
			inverseJoinColumns=@JoinColumn(
					name="privilege_id",
					referencedColumnName="id"
					)
			)
	private Collection<Privilege> privileges;


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





	public Collection<Privilege> getPrivileges() {
		return privileges;
	}


	public void setPrivileges(Collection<Privilege> privileges) {
		this.privileges = privileges;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", users=" + users + ", privileges=" + privileges + "]";
	}


	public Collection<ApplicatonUser> getUsers() {
		return users;
	}


	public void setUsers(Collection<ApplicatonUser> users) {
		this.users = users;
	}

	public Role(String name) {
		super();
		this.name = name;
	}
	
	public Role(Integer id, String name, Collection<ApplicatonUser> users, Collection<Privilege> privileges) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
		this.privileges = privileges;
	}


	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
}
