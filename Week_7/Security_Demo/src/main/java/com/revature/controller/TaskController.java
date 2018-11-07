package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Task;
import com.revature.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	private TaskService taskservice;
	
	@Autowired
	public TaskController(TaskService taskservice) {
		this.taskservice = taskservice;
	}
	
	@RequestMapping(method= RequestMethod.GET, produces="application/json")
	@PreAuthorize("hasAuthority('READ_PRIVILEGE')")
	public ResponseEntity<List<Task>> listAllTasks(){
		return new ResponseEntity<>((List<Task>)taskservice.getAllTasks(), HttpStatus.OK);
	}
	
	
	//@RequestMapping(value)
}
