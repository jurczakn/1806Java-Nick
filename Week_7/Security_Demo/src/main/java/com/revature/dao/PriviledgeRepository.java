package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojo.Privilege;
import com.revature.pojo.Role;

@Repository
public interface PriviledgeRepository extends JpaRepository<Privilege, Integer>{
	Privilege findByName(String name);
}
