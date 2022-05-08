package com.revature.services;
import com.revature.utils.*;
import com.revature.models.LoginDTO;



import com.revature.daos.UserDAO;
import com.revature.models.Employee;
import com.revature.models.Role;


public class AuthService {

	
		 
	//Typically, you'll want to validate username/password here in the service... 
	//by calling some DAO method that gets employees where username = ? and password = ?
	
	public Employee login(String username, String pass) {

		if(username.equals(username) && pass.equals(pass)) {
			
		
			Role role = new Role();
			
			return new Employee(null, firstname, lastname, role);
		} else {
			return null;
		}
		
	}

	
	
}
