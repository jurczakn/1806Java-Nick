package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojo.ApplicatonUser;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicatonUser, Integer>{
	ApplicatonUser findByName(String name);
}
