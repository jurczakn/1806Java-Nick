package com.revature.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.revature.dao.TaskRepository;
import com.revature.pojo.Task;

@Component
public class TaskLoader implements ApplicationListener<ContextRefreshedEvent> {
	private boolean isSetup;
	
	TaskRepository taskRepository;
	
	Logger logger = LoggerFactory.getLogger(TaskLoader.class);
	
	@Autowired
	public TaskLoader (TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	@Override
	public void onApplicationEvent (ContextRefreshedEvent event) {
		if(isSetup)
			return;
		Task milk = new Task();
		milk.setDescription("Buy some milk");
		taskRepository.save(milk);
		
		logger.info("Task saved - id" + milk.getId());
		
		Task paint = new Task();
		milk.setDescription("Buy some paint");
		taskRepository.save(paint);
		
		logger.info("Task saved - id" + paint.getId());
	}
}
