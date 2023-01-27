package com.homs.demo.dbutil;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import com.homs.demo.model.inventory;

public class inventoryDAO {
    @Autowired
    private DataSource DataSource;
    List<inventory> inventory = new ArrayList<inventory>();

    public List<inventory> getInventory() {
        try {
            Connection connection = DataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM product");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                inventory.add(new inventory(rs.getString("name"), rs.getString("description"), rs.getString("price"), rs.getString("picture"), rs.getString("type")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return inventory;
    }
}