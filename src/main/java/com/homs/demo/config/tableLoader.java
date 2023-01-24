package com.homs.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class tableLoader {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public tableLoader(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        createTable();
    }

    public void createTable() {
        List<String> tables = jdbcTemplate.queryForList("SHOW TABLES", String.class);
        if (!tables.contains("auth")) {
            jdbcTemplate.execute("CREATE TABLE auth ("
                    + "id_auth INT NOT NULL AUTO_INCREMENT,"
                    + "name MEDIUMTEXT NOT NULL,"
                    + "email VARCHAR(55) NOT NULL,"
                    + "password VARCHAR(55) NOT NULL,"
                    + "role VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (id_auth)"
                    + ")");
            System.out.println("Table 'auth' created");
        }
        if (!tables.contains("review")) {
            jdbcTemplate.execute("CREATE TABLE review ("
                    + "idreview INT NOT NULL AUTO_INCREMENT,"
                    + "name MEDIUMTEXT NOT NULL,"
                    + "email MEDIUMTEXT,"
                    + "review LONGTEXT NOT NULL,"
                    + "PRIMARY KEY (idreview)"
                    + ")");
            System.out.println("Table 'review' created");
        }
        if (!tables.contains("product")) {
            jdbcTemplate.execute("CREATE TABLE product ("
                    + "idproduct INT NOT NULL AUTO_INCREMENT,"
                    + "name VARCHAR(45) NOT NULL,"
                    + "description LONGTEXT NOT NULL,"
                    + "price DOUBLE NOT NULL,"
                    + "picture BLOB NOT NULL,"
                    + "type VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (idproduct)"
                    + ")");
            System.out.println("Table 'product' created");
        }

    }
    
}