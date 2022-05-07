--All five of these tables have been run successfully. Don't try to run them again.

--STATUS TABLE
CREATE TABLE reimbursement_statuses (
	reimbursement_statuses_id serial PRIMARY KEY,
	statuses varchar(10)
	);

INSERT INTO reimbursement_statuses (statuses)
VALUES ('Pending'),
		('Approved'),
		('Denied');

SELECT * FROM reimbursement_statuses
		

--TYPES TABLE		
CREATE TABLE reimbursement_types (
	reimbursement_types_id serial PRIMARY KEY,
	r_types varchar(10)
	);

INSERT INTO reimbursement_types (r_types)
VALUES  ('Food'),
		('Lodging'),
		('Travel'),
		('Other');
	
SELECT * FROM reimbursement_types
	
--ROLES TABLE
CREATE TABLE roles(
	role_id serial PRIMARY KEY,
	role_title varchar(20),
	role_salary int
	);

INSERT INTO roles (role_title, role_salary)
VALUES ('Associate', 50000),
	('Administrator', 100000);
	
SELECT * FROM roles

-- EMPLOYEES TABLE	
CREATE TABLE employees (
	employees_id serial PRIMARY KEY,
	username varchar (50) UNIQUE,
	pass varchar (50),
	firstname varchar (100),
	lastname varchar (100),
	email varchar (150) UNIQUE,
	roles_id_fk int REFERENCES roles
);

INSERT INTO employees (username, pass, firstname, lastname, email, roles_id_fk)
VALUES ('MarioBro2', 'GhostsR2Scary','Luigi', 'Starryman', 'pistacchiogelato@yahoo.com', 2);
		
SELECT * FROM employees;

--REIMBURSE TABLE
CREATE TABLE reimburse (
	reimburse_id serial PRIMARY KEY,
	amount int,
	submitted text,
	resolved text,
	description varchar (250),
	
	author_fk int REFERENCES employees(employees_id),
	resolver_fk int REFERENCES employees(employees_id),
	status_id_fk int REFERENCES reimbursement_statuses(reimbursement_statuses_id),
	reimb_type_id_fk int REFERENCES reimbursement_types(reimbursement_types_id)
	
);

INSERT INTO reimburse (amount, description, author_fk, resolver_fk, status_id_fk, reimb_type_id_fk)
VALUES (20, 'Lasagna lunch meeting to discuss team project', 1, 1, 2, 1);

SELECT * FROM reimburse

DELETE FROM employees WHERE email = 'superlasagnalover@yahoo.com';

--END