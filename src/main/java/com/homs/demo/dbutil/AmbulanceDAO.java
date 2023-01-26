package com.homs.demo.dbutil;

import org.springframework.stereotype.Repository;

import com.homs.demo.model.Ambulance;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Repository
public class AmbulanceDAO {

    public int createAmbulance(Ambulance ambulance){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "INSERT INTO `ambulance` (`name`, `contact`, `location`, `status`,`ambulancePlate`,`department`) VALUES (?,?,?,?,?,?)";
        Object args[] = {ambulance.getName(),ambulance.getContact(),ambulance.getLocation(),ambulance.getStatus(),ambulance.getAmbulancePlate(),ambulance.getDepartment()};
        int rowAffected = jbdct.update(sql, args);
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
