package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.inventoryDAO;

@Controller
public class inventoryController {
    @Autowired
    private inventoryDAO inventoryDAO;

    @GetMapping(value="inventoryController")
    public String getInventory() {
        System.out.println("Success");

        return "redirect:/";
    }

    @GetMapping(value = "/inventory")
    public String getInventoryPage() {
        return "inventory";
    }
}
