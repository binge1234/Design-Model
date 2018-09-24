package cn.edu.scau.cmi.lzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.scau.cmi.lizhibin.Adapter.*;

@Controller
@RequestMapping("/adapter")
public class AdapterController {
	@ResponseBody
	@RequestMapping("/getAdapter1")
    public Integer getAdapter1() {
    	AdapterOfClass adapter = new AdapterOfClass();
    	int v_adapter = adapter.Output_5();
    	return v_adapter;
    	
    	
        
        
    }
	@ResponseBody
	@RequestMapping("/getAdapter2")
    public Integer getAdapter2() {
    	AdapterOfObject adapter = new AdapterOfObject(new Adaptee());
    	int v_adapter = adapter.Output_5();
     
    	return v_adapter;
        
        
    }
	
	
}