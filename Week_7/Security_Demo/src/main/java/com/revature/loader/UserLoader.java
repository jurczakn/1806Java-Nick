package com.revature.loader;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.revature.dao.ApplicationUserRepository;
import com.revature.dao.PriviledgeRepository;
import com.revature.dao.RoleRepository;
import com.revature.pojo.ApplicatonUser;
import com.revature.pojo.Privilege;
import com.revature.pojo.Role;

@Component
public class UserLoader implements ApplicationListener<ContextRefreshedEvent> {
	   private boolean isSetup;

	    private ApplicationUserRepository userRepository;
	    private RoleRepository roleRepository;
	    private PriviledgeRepository privilegeRepository;
	    private BCryptPasswordEncoder encoder;

	    public UserLoader(ApplicationUserRepository userRepository,
	            RoleRepository roleRepository,
	            PriviledgeRepository privilegeRepository,
	            BCryptPasswordEncoder encoder) {
	        this.encoder = encoder;
	        this.privilegeRepository = privilegeRepository;
	        this.roleRepository = roleRepository;
	        this.userRepository = userRepository;
	    }

	    @Override
	    public void onApplicationEvent(ContextRefreshedEvent event) {
	        if(isSetup) return;

	        Privilege readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
	        Privilege writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");
	        List<Privilege> userPriv = Arrays.asList(readPrivilege);
	        List<Privilege> adminPriv = Arrays.asList(readPrivilege, writePrivilege);
	        Role adminRole = createRoleIfNotFound("ROLE_ADMIN", adminPriv);
	        Role userRole = createRoleIfNotFound("ROLE_USER", userPriv);
	        ApplicatonUser user = createUserIfNotFound("admin", "password", Arrays.asList(adminRole));
	        user = createUserIfNotFound("user", "password", Arrays.asList(userRole));
	        
	        isSetup = true;
	    }

	    protected Privilege createPrivilegeIfNotFound(String name) {
	        Privilege privilege = privilegeRepository.findByName(name);
	        if(privilege == null) {
	            privilege = new Privilege(name);
	            privilegeRepository.save(privilege);
	        }
	        return privilege;
	    }

	    protected Role createRoleIfNotFound(String name, List<Privilege>privileges) {
	        Role role = roleRepository.findByName(name);
	        if(role == null) {
	            role = new Role(name);
	            role.setPrivileges(privileges);
	            roleRepository.save(role);
	        }
	        return role;
	    }

	    protected ApplicatonUser createUserIfNotFound(String username, String password, List<Role> roles) {
	    	ApplicatonUser user = userRepository.findByName(username);
	        if(user == null) {
	            user = new ApplicatonUser(username, encoder.encode(password));
	            user.setRoles(roles);
	            userRepository.save(user);
	        }
	        return user;
	    }}
