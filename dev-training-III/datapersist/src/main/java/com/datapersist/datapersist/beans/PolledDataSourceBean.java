package com.datapersist.datapersist.beans;

import org.apache.commons.dbcp.BasicDataSource;

public class PolledDataSourceBean extends BasicDataSource {
    private PropertiesBean dbConnProperties;

    public PolledDataSourceBean(PropertiesBean propertiesBean) {
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
