package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.pojo.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

}
