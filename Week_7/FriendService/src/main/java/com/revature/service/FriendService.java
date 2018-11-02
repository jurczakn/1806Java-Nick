package com.revature.service;

import java.util.List;

import com.revature.pojos.Friend;

public interface FriendService {

	public Friend findFriend(String name);
	
	public List<Friend> findAllFriends();
	
	public void addFriend(Friend friend);
	
	public void updateFriend(Friend friend, String name);
	
	public void deleteFriend(String name);
	
}
