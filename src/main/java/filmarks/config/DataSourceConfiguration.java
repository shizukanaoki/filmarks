package filmarks.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mysql")
    public DataSource dataSource() {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl(System.getenv("FILMARKS_DATABASE_URL"));
        datasource.setUsername(System.getenv("FILMARKS_DATABASE_USERNAME"));
        datasource.setPassword(System.getenv("FILMARKS_DATABASE_PASSWORD"));
        return datasource;
    }
}
