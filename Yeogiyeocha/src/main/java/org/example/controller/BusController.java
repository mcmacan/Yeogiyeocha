package org.example.controller;

import org.apache.ibatis.session.SqlSession;
import org.example.domain.Bus;
import org.example.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/cityBus", method = RequestMethod.GET)
public class BusController {
    @Autowired
    private final BusService busService;
    //private org.apache.ibatis.session.SqlSession SqlSession;
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String Busmenu() {
        return "CityBusMenu";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String UserInfo(@PathVariable("id") Long id, Model model) {
        List Busstop = busService.getBusinfo(id);
        Long count = busService.getBusnumber(id);
        String a = "";
        for(int i = 0; i<count; i++){
            a = a + Busstop.get(i).toString()+",";
        }
        model.addAttribute("Busid",id);
        model.addAttribute("Busstop",a);
        model.addAttribute("Buscount",count);
        return "BusView";
    }
}
