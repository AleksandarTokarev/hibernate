# Hibernate Queries 
https://stackoverflow.com/questions/17431312/what-is-the-difference-between-join-and-join-fetch-when-using-jpa-and-hibernate/72238549#72238549  
https://stackoverflow.com/questions/9720452/duplicates-using-left-join-fetch   
https://forum.hibernate.org/viewtopic.php?p=2490231  
https://www.baeldung.com/jpql-hql-criteria-query#jpql  
https://stackoverflow.com/questions/16088949/how-to-paginate-a-jpa-query  
https://stackoverflow.com/questions/30549489/what-is-this-spring-jpa-open-in-view-true-property-in-spring-boot  
https://www.baeldung.com/spring-open-session-in-view  
https://www.baeldung.com/jpa-join-types  
https://www.baeldung.com/spring-data-jpa-named-entity-graphs

#### Prerequisites to test app
Have a PostgreSQL and create the two tables  
- User table
```
create table if not exists hibernate_user
(
	id serial not null
		constraint hibernate_user_pk
			primary key,
	first_name text,
	last_name text
);

```
- User Attributes table
```
create table if not exists hibernate_user_attributes
(
	id serial not null
		constraint hibernate_user_attributes_pk
			primary key,
	attr_key text,
	attr_value text,
	user_id integer
		constraint hibernate_user_attributes_hibernate_user_id_fk
			references hibernate_user
);

```
#### Swagger to test endpoints 
http://localhost:8080/swagger-ui/index.html

