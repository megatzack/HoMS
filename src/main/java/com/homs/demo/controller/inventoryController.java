package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.inventoryDAO;

@Controller
public class inventoryController {
    @Autowired
    private inventoryDAO inventoryDAO;

    @RequestMapping(value="inventoryController")
    public String inventoryList(Model model) {
        //model.addAttribute("message", "Success Retrieve Model");
        //System.out.println(model.getAttribute("message"));
        model.addAttribute("inventory", inventoryDAO.getInventory());
        

        return "inventory";
    }
}
