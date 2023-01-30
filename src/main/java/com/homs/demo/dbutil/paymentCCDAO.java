package com.homs.demo.dbutil;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.homs.demo.model.paymentPageCC;

@Repository
public class paymentCCDAO {

    public int fillDetails(paymentPageCC p) {
        
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "insert into `paymentcc` (`cardNo`,`cvvNo`,`expiryDate`,`firstName`, `lastName`, `country`, `state`, `city`, `postalCode`, `email`, `phoneNo`) values (?,?,?,?,?,?,?,?,?,?,?)";
        Object paymentCC[] = {p.getCardNo(), p.getCvvNo(), p.getExpiryDate(), p.getFirstName(), p.getLastName(), p.getCountry(), p.getState(), p.getCity(), p.getPostalCode(), p.getEmail(), p.getPhoneNo()};

        int rowAffected = jbdct.update(sql, paymentCC);
        return rowAffected;
    }


    public static DataSource getDataSource() {
        DataSource dataSource = null;

        String url = "jdbc:mysql://localhost:3306/homs";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dataSource = new DriverManagerDataSource(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
    
}
