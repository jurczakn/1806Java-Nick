package com.revature.controllers;

import java.util.List;

import com.revature.pojos.Friend;

public interface FriendController {
	
	public Friend getFriend(String name);
	
	public List<Friend> getAllFriends();
	
	public void saveFriend(Friend friend);
	
	public void updateFriend(Friend friend, String name);
	
	public void deleteFriend(String name);

}
