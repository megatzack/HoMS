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

@Controller
public class scheduleController {

    @GetMapping(value="/setSchedule")
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

        return "homePage";
    }

    @GetMapping(value="/seeSchedule")
    public String seeSchedule(Model model){
        Schedule schedule = null;
        ScheduleDAO scheduleDAO = new ScheduleDAO();
        schedule =  scheduleDAO.getByName("yusri");  //testing
        model.addAttribute("schedule", schedule);

        return "staff_view_schedule";
    }
}