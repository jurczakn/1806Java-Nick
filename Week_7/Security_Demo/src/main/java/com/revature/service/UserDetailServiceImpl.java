package com.revature.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dao.ApplicationUserRepository;
import com.revature.pojo.ApplicatonUser;
import com.revature.pojo.Privilege;
import com.revature.pojo.Role;


@Service
public class UserDetailServiceImpl implements UserDetailsService{
	

	private ApplicationUserRepository AUR;
	
	@Autowired
	public UserDetailServiceImpl (ApplicationUserRepository aur) {
		this.AUR = aur;
	}
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		ApplicatonUser user = AUR.findByName(username);
		
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}
		Collection authorities = getAuthorities(user.getRoles());
		
		return new User(user.getName(), user.getPassword(), authorities);
			
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities(Collection<Role> roles){
		return getGrantedAuthorities(getPrivileges(roles));
	}
	
	public List<String> getPrivileges (Collection<Role> roles ) {
		List<String> privileges = new ArrayList<>();
		List<Privilege> collection = new ArrayList<>();
		for(Role role : roles) {
			collection.addAll(role.getPrivileges());
		}
		for(Privilege item : collection) {
			privileges.add(item.getName());
		}
		return privileges;
	}
	
	private List<GrantedAuthority> getGrantedAuthorities (List<String> privileges){
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		for(String privilege : privileges) {
			authorities.add(new SimpleGrantedAuthority(privilege));
		}
		return authorities;
	}
}
