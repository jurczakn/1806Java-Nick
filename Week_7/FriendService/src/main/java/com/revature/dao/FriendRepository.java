package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojos.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, String>{

}
