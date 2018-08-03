package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dao.TaskRepository;
import com.revature.pojo.Task;

@Service
public class TaskService {

	public TaskRepository taskRepository;
	
	@Autowired
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	@Transactional(readOnly = true)
	public Iterable<Task> getAllTasks(){
		return taskRepository.findAll();
	}
	
	
	@Transactional
	public Task saveNew(Task t) {
		return taskRepository.save(t);
	}
}


