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
		
		//we would call the DAO method here, and use its results in the if/else below
		//the DAO method would return whatever gets found in the DB (records with matching username/pass)
		
		//this is hardcoding - telling Java exactly what we want the username/password to be
		if(username.equals(username) && pass.equals(pass)) {
			
			//empty Role object (no args constructor) just for simplicity here
			Role role = new Role();
			
			return new Employee(null, firstname, lastname, role);
		} else {
			return null;
		}
		
	}
	
}
