
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
CREATE TABLE user_roles(
	user_roles_id serial PRIMARY KEY,
	u_role varchar(20),
	salary int
	);

INSERT INTO user_roles (u_role, salary)
VALUES ('Associate', 50000),
	('Administrator', 100000);
	
SELECT * FROM user_roles

-- USERS TABLE	
CREATE TABLE users (
	users_id serial PRIMARY KEY,
	username varchar (50) UNIQUE,
	psword varchar (50),
	fname varchar (100),
	lname varchar (100),
	email varchar (150) UNIQUE,
	user_roles_id_fk int REFERENCES user_roles
);

INSERT INTO users (username, psword, fname, lname, email, user_roles_id_fk)
VALUES ('MarioBro1', 'PeachySchmoo','Mario', 'Starryman', 'lasagnalover@yahoo.com', 2);
		
SELECT * FROM users

--REIMBURSE TABLE
CREATE TABLE reimburse (
	reimburse_id serial PRIMARY KEY,
	amount int,
	submitted text,
	resolved text,
	description varchar (250),
	
	author_fk int REFERENCES users(users_id),
	resolver_fk int REFERENCES users(users_id),
	status_id_fk int REFERENCES reimbursement_statuses(reimbursement_statuses_id),
	reimb_type_id_fk int REFERENCES reimbursement_types(reimbursement_types_id)
	
);

INSERT INTO reimburse (amount, description, author_fk, resolver_fk, status_id_fk, reimb_type_id_fk)
VALUES (20, 'Lasagna lunch meeting to discuss team project', 1, 1, 2, 1);

SELECT * FROM reimburse

--END