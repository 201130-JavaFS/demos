--CREATE DATABASE shield;

CREATE TABLE homes (
	home_name VARCHAR(30) PRIMARY KEY,
	hb_st_addr VARCHAR(60),
	hb_city VARCHAR(30),
	hb_state VARCHAR(2),
	hb_zip VARCHAR(5)
);

CREATE TABLE avengers (
	ave_id SERIAL PRIMARY KEY,
	ave_name VARCHAR(30),
	ave_power VARCHAR(60),
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	power_level INTEGER,
	home_fk VARCHAR(30) REFERENCES homes(home_name)
); 

INSERT INTO homes (home_name, hb_st_addr, hb_city, hb_state, hb_zip)
	VALUES ('Valhalla', '123 Rainbow Way', 'Valhalla', 'BH', '99999'),
	('Stark Tower', '1 Tony Stark Drive', 'New York', 'NY', '10005'),
	('Caps Appartment', '456 Prescott St. Apt 45', 'Brooklyn', 'NY', '11211');
	
INSERT INTO public.avengers (ave_name, ave_power, first_name, last_name, power_level, home_fk)
	VALUES ('Capt. America', 'Super Strong Frisbee', 'Steve', 'Rogers', 20, 'Caps Appartment'),
	('Iron Man', 'Money-Good looks-Intelligence', 'Tony', 'Stark', 13, 'Stark Tower'),
	('Hulk', 'Very in touch with his emotions', 'Bruce', 'Banner', 999, 'Stark Tower'),
	('Thor', 'Maybe hes born with it, mayber its Maybelline', 'Thor', 'Odinson', 33, 'Valhalla');