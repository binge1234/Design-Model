package cn.edu.scau.cmi.lzb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.scau.cmi.lizhibin.Adapter.*;
 
@Controller
@RequestMapping("/")
public class HelloController {
 
    @RequestMapping("/main")
    public String hello() {
    	
        return "main";
    }
    
    @RequestMapping("/simplefactory")
    public String simplefactory() {
    	
    	return "simplefactory";
    }
    @RequestMapping("/abstractfactory")
    public String abstractfactory() {
    	return "abstractfactory";
    }
    @RequestMapping("/ordinaryfactory")
    public String factory() {
    	return "ordinaryfactory";
    }
    
    @RequestMapping("/simple")
    public String simple() {
    	return "simple";
    }
    
    @RequestMapping("/simples")
    public String simples() {
    	return "simples";
    }
    
    @RequestMapping("/componsite1")
    public String componsite1() {
    	return "componsite1";
    }
    @RequestMapping("/componsite2")
    public String componsite2() {
    	return "componsite2";
    }
    
    @RequestMapping("/object_adapter")
    public String object_adapter(Model m) {
    	int v_target = Target.value;
    	int v_adaptee = Adaptee.value;
    	m.addAttribute("v_target",v_target);
    	m.addAttribute("v_adaptee",v_adaptee);
    	return "object_adapter";
    }
    
    @RequestMapping("/class_adapter")
    public String class_adapter(Model m) {
    	int v_target = Target.value;
    	int v_adaptee = Adaptee.value;
    	m.addAttribute("v_target",v_target);
    	m.addAttribute("v_adaptee",v_adaptee);
    	return "class_adapter";
    }
    
    
    
    
    
}