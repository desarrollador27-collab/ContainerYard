package com.projectest.sigcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SigconApplication {


	public static void main(String[] args) {

		String jdbcUrl = "jdbc:sqlserver://PF55K3FZ\\SQLEXPRESS;Database=SYGCON;trustServerCertificate=true;";
		String usarname = "sa";
		String password = "12345";

		try {
			//load JDBC Driver connection
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			//Establish the connection
			Connection connection = DriverManager.getConnection(jdbcUrl,usarname,password);

			if(connection != null) {
				System.out.println("Connected to SQL Server.");
				connection.close();
				System.out.println("Connection closed.");
			}else {
				System.out.println("Failed to connect to SQL Server.");
			}

		}catch(ClassNotFoundException e){
			System.err.println("JDBC driver not found:" + e.getMessage());
		}catch(SQLException e) {
			System.err.println("Database connection failed:" + e.getMessage());
		}

		SpringApplication.run(SigconApplication.class, args);

	}

}
