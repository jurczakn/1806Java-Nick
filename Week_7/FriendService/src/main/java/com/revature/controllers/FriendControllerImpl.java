package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.Friend;
import com.revature.service.FriendService;

@RestController
public class FriendControllerImpl implements FriendController {

	@Autowired
	FriendService fs;
	
	@Override
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public Friend getFriend(@PathVariable(required=true) String name) {
		// TODO Auto-generated method stub
		return fs.findFriend(name);
	}

	@Override
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Friend> getAllFriends() {
		// TODO Auto-generated method stub
		return fs.findAllFriends();
	}

	@Override
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveFriend(@RequestBody Friend friend) {
		// TODO Auto-generated method stub
		fs.addFriend(friend);
	}

	@Override
	@RequestMapping(value = "/{name}", method = RequestMethod.PUT)
	public void updateFriend(@RequestBody Friend friend, @PathVariable(required=true)String name) {
		// TODO Auto-generated method stub
		fs.updateFriend(friend, name);
	}

	@Override
	@RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
	public void deleteFriend(@PathVariable(required=true) String name) {
		// TODO Auto-generated method stub
		fs.deleteFriend(name);
	}

}
