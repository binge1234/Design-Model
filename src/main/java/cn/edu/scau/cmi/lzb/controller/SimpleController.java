package cn.edu.scau.cmi.lzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.scau.cmi.lizhibin.singletonpattern.Marshal;
import cn.edu.scau.cmi.lizhibin.singletonpattern.Persident;

@Controller
@RequestMapping("/simple")
public class SimpleController {
	
	@ResponseBody
   @RequestMapping("/getPersident/{name}")
	public String getPersident(@PathVariable("name") String name) {
	   System.out.println("2312");
	   Persident persident=Persident.getInstance(name);
	   return persident.getName();
   }
	
	@ResponseBody
	@RequestMapping("/getMarshal/{name}")
	 public String[] getMarshals(@PathVariable("name")String name) {
		Marshal.getInstance(name);
		String[] marshals = Marshal.getMarshals();
		return marshals;
		
	}
	
}
