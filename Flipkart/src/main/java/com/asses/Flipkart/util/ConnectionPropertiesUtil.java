package com.asses.Flipkart.util;

import java.util.Properties;

public class ConnectionPropertiesUtil 
{
	public static Properties getMySqlDbProperties()
	{
		Properties properties = new Properties();
		properties.setProperty("Connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/flipkart_db");
		properties.setProperty("hibernate.connection.user", "root");
		properties.setProperty("hibernate.connection.password", "password");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	
		properties.setProperty("hibernate.show_sql","true");
       
		return properties;
	}

}
