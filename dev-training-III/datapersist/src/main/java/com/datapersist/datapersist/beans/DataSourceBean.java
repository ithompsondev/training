package com.datapersist.datapersist.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// This bean extends the jdbc DataSource class, we do constructor injection and manual setter injection within the constructor on the super class.
public class DataSourceBean extends DriverManagerDataSource {
    private PropertiesBean dbConnProperties;

    public DataSourceBean(PropertiesBean propertiesBean) {
       dbConnProperties = propertiesBean;
       super.setUrl(dbConnProperties.getDbConnUrl());
       super.setUsername(dbConnProperties.getDbConnUsername());
       super.setPassword(dbConnProperties.getDbConnPassword());
       super.setDriverClassName("com.mysql.jdbc.Driver");
   }

   public String getConnUrl() {
        return dbConnProperties.getDbConnUrl();
   }

   public String getConnUsername() {
        return dbConnProperties.getDbConnUsername();
   }
}
