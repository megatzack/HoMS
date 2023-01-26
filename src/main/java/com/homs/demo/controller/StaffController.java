package com.homs.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @GetMapping("/StaffDB")
    public String opendb() {
    try {
        String dbURL = "jdbc:mysql://localhost:3306/homs";
            String username = "root";
            String password = "";
                
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection( dbURL,username,password);
            System.out.println("successfully open database connection  :" +connection.getMetaData());
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    return null;
    }
    
    @GetMapping("/create")
    public String staff_register() {
        return "registerStaff";
    }

    @PostMapping("/createStaff")
    public String register(HttpServletRequest request)
    {
        String staffName = request.getParameter("staffName");
        String staffEmail = request.getParameter("staffEmail");
        String staffPassword = request.getParameter("staffPassword");
        String staffDepartment = request.getParameter("staffDepartment");

        Staff staff = new Staff();
        staff.setStaffName(staffName);
        staff.setStaffEmail(staffEmail);
        staff.setStaffPassword(staffPassword);
        staff.setStaffDepartment(staffDepartment);

        StaffDAO staffDAO = new StaffDAO();
        int row = staffDAO.create(staff);
        System.out.println("row affected: " + row);
        return "loginStaff";

    }

   @GetMapping("/homepage")
    public ModelAndView viewhomepage(HttpSession session) {
        StaffDAO staffDAO = new StaffDAO();
        Staff staff = staffDAO.getHomepage(session.getAttribute("staffEmail").toString());
        session.getAttribute("staff");

        return new ModelAndView("staffHomepage", "staff", staff);
    }
}
