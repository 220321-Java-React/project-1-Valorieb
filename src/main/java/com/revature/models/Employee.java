package com.revature.models;

//This Class models the employees table in our database
public class Employee {
	
	private String pass;
	private String firstname;
	private String lastname;
	//Every Employee in this application will have a role associated with it
	private String email;
	private Role role; //in other words, every EMPLOYEE has a ROLE
	private int roles_fk;
	private String username;
	
	
	@Override
	public String toString() {
		return "Employee [username=" + username + ", pass=" + pass + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", role=" + role + ", roles_fk=" + roles_fk + ", employees_id="
				+ employees_id + "]";
	}

	

	//variables for the employee class - must match the employees table in the database
	//note the private variables, private coupled with getters and setters (see below) are how we achieve ENCAPSULATION
	private int employees_id;
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}


	
	
	public int getEmployees_id() {
		return employees_id;
	}

	public Employee(int employees_id, String username, String pass, String firstname, String lastname, String email, int roles_fk) {
		super();
		this.employees_id = employees_id;
		this.username = username;
		this.pass = pass;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.roles_fk = roles_fk;
	}
	
	public Employee(int employees_id, String username, String pass, String firstname, String lastname, String email) {
		super();
		this.employees_id = employees_id;
		this.username = username;
		this.pass = pass;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}


	public void setEmployees_id(int employees_id) {
		this.employees_id = employees_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoles_fk() {
		return roles_fk;
	}

	public void setRoles_fk(int roles_fk) {
		this.roles_fk = roles_fk;
	}

	
	/*
	//this class won't have any methods, we just need it to represent (aka MODEL) some data
	
	//boilerplate code below------------------------------
	//boilerplate code is any code that you'll probably write over and over again
	//most classes that we make objects of will have constructors, getters/setters, toString
	//so java makes this easy for us with the source tab 
	
	//remember all of this can be generated with the source tab
	
	//no args constuctor (source -> constructor from superclass)
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//all args constructor (source -> constructor from fields)
	public Employee(int employee_id, String firstname, String lastname, Role role) {
		super();
		this.employees_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
	}

	//We need an "all args minus id" constructor because the id is handled on the database side
	//when inserting data into a database, we should give objects with no id since the database gives each record an id
	public Employee(String firstname, String lastname, Role role) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
	}
	
	public Employee(int int1, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	
	

	public Employee(int employees_id, String firstname, String lastname, int roles_fk) {
		super();
		this.employees_id = employees_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.roles_fk = roles_fk;
	}

	//the toString() method lets us actually print out our objects, since it would print a memory address otherwise
	//(source -> generate toString)
	@Override
	public String toString() {
		return "Employee [employee_id=" + employees_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", role=" + role + "]";
	}


	//getters and setters allow you to access and change your private variables... ENCAPSULATION
	//(source -> generate getters and setters, make sure to check all the boxes)
	public int getEmployee_id() {
		return employees_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employees_id = employee_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirst_name(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLast_name(String lastname) {
		this.lastname = lastname;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	} */
	
}
