package com.revature.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.FriendRepository;
import com.revature.pojos.Friend;

@Service
@Transactional
public class FriendServiceImpl implements FriendService {

	@Autowired
	FriendRepository fr;
	
	@Override
	public Friend findFriend(String name) {
		// TODO Auto-generated method stub
		return fr.findOne(name);
	}

	@Override
	public List<Friend> findAllFriends() {
		// TODO Auto-generated method stub
		return fr.findAll();
	}

	@Override
	public void addFriend(Friend friend) {
		// TODO Auto-generated method stub
		fr.save(friend);

	}

	@Override
	public void updateFriend(Friend friend, String name) {
		// TODO Auto-generated method stub
		Friend oldFriend = fr.findOne(name);
		oldFriend.setAge(friend.getAge());
		oldFriend.setName(friend.getName());
		oldFriend.setHasJob(friend.isHasJob());
		oldFriend.setGender(friend.getGender());

	}

	@Override
	public void deleteFriend(String name) {
		// TODO Auto-generated method stub
		fr.delete(name);
	}

}
