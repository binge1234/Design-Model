package cn.edu.scau.cmi.lzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.scau.cmi.lizhibin.componsite.safe.Member;
import cn.edu.scau.cmi.lizhibin.componsite.safe.Organization;
import cn.edu.scau.cmi.lizhibin.componsite.safe.Person;

@Controller
@ResponseBody
@RequestMapping("/componsite")
public class ComponsiteController {
	@RequestMapping("/getComponsite1/{name}")
      public String getComponsite1(@PathVariable("name") String name) {
		System.out.println("0000");
		Organization group1 = new Organization();
		if(name.equals("Person")) {
			System.out.println("11111");
    	Member people = new Person();
    	System.out.println("22222");
    	return group1.add(people);
		}
		else {
			Organization group2 = new Organization();
			return group2.add(group1);
		}
    	  
      }

	@RequestMapping("/getComponsite2/{name}")
    public String getComponsite2(@PathVariable("name") String name) {
		Organization group1 = new Organization();
		if(name.equals("Person")) {
    	
    	Member people = new Person();
    	return group1.add(people);
		}
		else {
			Organization group2 = new Organization();
			return group2.add(group1);
		}
  	  
    }
}
