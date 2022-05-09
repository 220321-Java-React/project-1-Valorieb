package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.revature.models.LoginDTO;

import com.revature.models.Employee;
import com.revature.utils.ConnectionUtil;


public class UserDAO {
	
	
	
	
	
	
	//This method will return true in the case of successful login, otherwise it will return false
	public boolean login(String username, String pass) {
		
		if(username.equals(username) && pass.equals(pass)) {
			return true;
		}
		
		return false;
		
	}
	
	//@Override
    public Employee LoginDTO (String username, String pass) {

        try(Connection conn = ConnectionUtil.getConnection()){

            String sql = "SELECT * FROM employees WHERE username = ? AND pass = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, pass);
            System.out.println("Username " + username.getUsername() + "Success!");
        }
        catch (SQLException e) {
			System.out.println("Login unsuccessful!");
			e.printStackTrace();
			return null;
	}
	/*
	
				
		//Instantiate a PreparedStatement to fill in the variables of our initial SQL String
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//fill in the values of our variables using ps.setXYZ()
		ps.setString(1, username.getUsername());
		ps.setString(2, username.getPassword());
	
		 
		//note how the DB role_id is an int, but in Java, Employees have a Role OBJECT
		//this is my workaround of choice... have the user input the id of the desired role when inserting the user data
		
		//Execute the Update!! (the method is called executeUpdate(), but it's for INSERTS, UPDATES, and DELETES)
		ps.executeUpdate();
		
		//Tell the user the insert was successful
		
			
		} catch (SQLException e) {
			System.out.println("Login unsuccessful!");
			e.printStackTrace();
		}
		
	}
	
	


	
	
	//Ok Ben hardcoded the credentials... thanks a lot...
	//How might I go about actually checking the DB for username/password?
	
	//You'll need a table of users that store usernames and passwords
	//This DAO method should use the inputted username and password in a select statement
	//Might I suggest select * from users where username = ? and password = ?;
	//If a record comes back, there IS a username and password matching what the user sent in
	//If "null" comes back, there is no username and password pair matching what the user sent in
	*/
	
    }
}
