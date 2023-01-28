package com.homs.demo.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homs.demo.dbutil.ScheduleDAO;
import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.model.Schedule;
import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpSession;

@Controller
public class scheduleController {

    @GetMapping(value="setSchedule")
    public String setSchedule(Model model) {
        Staff staff = null;
        StaffDAO staffDAO = new StaffDAO();
        model.addAttribute("staff", staff);
        model.addAttribute("staffList", staffDAO.getAllStaff());
        

        return "adminSetSchedule";
    }

    @PostMapping(value="/createSchedule")
    public String createSchedule(@RequestParam("name")String name,@RequestParam("ocInTime")String ocInTime,@RequestParam("ocOutTime")String ocOutTime,@RequestParam("tcInTime")String tcInTime,@RequestParam("tcOutTime")String tcOutTime,@RequestParam("notes")String notes){
        Schedule schedule = new Schedule(name,ocInTime,ocOutTime,tcInTime,tcOutTime,notes);
        ScheduleDAO scheduleDAO = new ScheduleDAO();

        int row = scheduleDAO.create(schedule);
        System.out.println("row affected: " + row);

        return "redirect:/staffpage#!/homepage";
    }

    @GetMapping(value="deleteSchedule")
    public String deleteSchedule(Model model) {
        Staff staff = null;
        StaffDAO staffDAO = new StaffDAO();
        model.addAttribute("staff", staff);
        model.addAttribute("staffList", staffDAO.getAllStaff());
        

        return "adminDeleteSchedule";
    }

    @PostMapping(value="/removeSchedule")
    public String removeSchedule(@RequestParam("name")String name){
        //Schedule schedule = new Schedule(name,ocInTime,ocOutTime,tcInTime,tcOutTime,notes);
        ScheduleDAO scheduleDAO = new ScheduleDAO();

        int row = scheduleDAO.delete(name);
        System.out.println("row affected: " + row);

        return "redirect:/staffpage#!/homepage";
    }

    @GetMapping(value="seeSchedule")
    public String seeSchedule(HttpSession session,Model model){
        Schedule schedule = null;
        ScheduleDAO scheduleDAO = new ScheduleDAO();
        Staff staff = (Staff)session.getAttribute("staff");
        //schedule =  scheduleDAO.getByName("yusri");  //testing
        schedule =  scheduleDAO.getByName(staff.getStaffName());
        model.addAttribute("schedule", schedule);

        return "staff_view_schedule";
    }
}

