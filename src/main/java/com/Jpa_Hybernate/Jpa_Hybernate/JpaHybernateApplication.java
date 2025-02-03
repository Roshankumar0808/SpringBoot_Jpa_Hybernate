package com.Jpa_Hybernate.Jpa_Hybernate;

import com.Jpa_Hybernate.Jpa_Hybernate.repositories.ProductRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHybernateApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpaHybernateApplication.class, args);
	}






	//	Final Summary
//	JPQL query is written in Spring Data JPA.
//	Hibernate converts JPQL into SQL.
//	SQL query executes in the database engine.
//	The database returns the result.
//	Hibernate maps the result to Java entities.
//	Saving an entity triggers an SQL INSERT statement.
//	Hibernate manages transactions and persists data.
}
