package com.homs.demo.dbutil;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.homs.demo.model.Ambulance;
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

    public Ambulance getByPlate(String plateNum){
        Ambulance ambulance = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `ambulance` WHERE `ambulancePlate` = ?";
        try{
            ambulance = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Ambulance>(Ambulance.class), plateNum);
            return ambulance;
        }
        catch (Exception e) {
            return null;
        }

    }

    public Ambulance getByName(String name){
        Ambulance ambulance = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `ambulance` WHERE `name` = ?";
        try{
            ambulance = jbdct.queryForObject(sql,new BeanPropertyRowMapper<Ambulance>(Ambulance.class),name);
            
            return ambulance;
        }
        catch (Exception e) {
            return null;
        }
        
    }

    public int getNewRespond(String name, String contact, String location, String status, String dates, String times ){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "UPDATE ambulance SET location= ?,status= ?,dates= ?, times= ? WHERE name= ? AND contact= ?";
        //Object args[] = {location,status,dates,times,name,contact};
        int rowAffected = jbdct.update(sql, location,status,dates,times,name,contact);

        return rowAffected;
    }

    public int getNewProfile(String name,String contact,String location, String status, String ambulancePlate){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "UPDATE ambulance SET contact= ?, location= ?,status= ?,ambulancePlate= ? WHERE name= ?";
        int rowAffected = jbdct.update(sql,contact,location,status,ambulancePlate,name);
        
        return rowAffected;
    }
    
    public Ambulance getByName(String name){
        Ambulance ambulance = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `ambulance` WHERE `name` = ?";
        try{
            ambulance = jbdct.queryForObject(sql,new BeanPropertyRowMapper<Ambulance>(Ambulance.class),name);
            
            return ambulance;
        }
        catch (Exception e) {
            return null;
        }
        
    }

    public int getNewRespond(String name, String contact, String location, String status, String dates, String times ){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "UPDATE ambulance SET location= ?,status= ?,dates= ?, times= ? WHERE name= ? AND contact= ?";
        //Object args[] = {location,status,dates,times,name,contact};
        int rowAffected = jbdct.update(sql, location,status,dates,times,name,contact);

        return rowAffected;
    }

    public int getNewProfile(String name,String contact,String location, String status, String ambulancePlate){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "UPDATE ambulance SET contact= ?, location= ?,status= ?,ambulancePlate= ? WHERE name= ?";
        int rowAffected = jbdct.update(sql,contact,location,status,ambulancePlate,name);
        
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
