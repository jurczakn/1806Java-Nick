package com.revature.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.pojo.Privilege;
import com.revature.pojo.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByName(String name);
}
