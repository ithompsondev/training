package com.datapersist.datapersist;

import com.datapersist.datapersist.beans.DataSourceBean;
import com.datapersist.datapersist.beans.PolledDataSourceBean;
import com.datapersist.datapersist.beans.PropertiesBean;
import com.datapersist.datapersist.data.repositories.CityRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class ApplicationConfig {

    @Bean
    public DataSourceBean dataSourceBean() throws IOException {
        return new DataSourceBean(propertiesBean());
    }

    @Bean
    public PolledDataSourceBean polledDataSourceBean() throws IOException {
        return new PolledDataSourceBean(propertiesBean());
    }

    @Bean
    public CityRepositoryImpl cityRepositoryImplBean() throws IOException {
        return new CityRepositoryImpl(dataSourceBean());
    }

    @Bean
    public PropertiesBean propertiesBean() throws IOException {
        return new PropertiesBean();
    }
}
