package com.spring.security.mysql.SpringSecurityBootJpaMysql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.security.mysql.SpringSecurityBootJpaMysql.model.MyUserDetails;
import com.spring.security.mysql.SpringSecurityBootJpaMysql.model.User;

@Service
public class MyUserdetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return new MyUserDetails(username);
		Optional<User> user =  userRepo.findByUsername(username);
		user.orElseThrow(() -> new UsernameNotFoundException("User not found : "+username));
		return user.map(MyUserDetails::new).get();
	}

}
