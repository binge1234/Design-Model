package cn.edu.scau.cmi.lzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.scau.cmi.lizhibin.abstractFactory.domain.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.factory.*;
import cn.edu.scau.cmi.lizhibin.domain.*;
import cn.edu.scau.cmi.lizhibin.simplefactory.*;
import cn.edu.scau.cmi.lzb.factory.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Controller
@ResponseBody
@RequestMapping("/factory")
public class FactoryController {
	@RequestMapping("/simplefactory/{shape}")
	public String getShape1(@PathVariable("shape") String shape) {
		SimpleFactory factory = new SimpleFactory();
		if(shape.equals("Circle")||shape.equals("Rectangle")) {
			Shape shape1 = factory.getShape(shape);
			String s = shape1.getShape();
			return s;
		}
        return null;
		
	}
	
	@RequestMapping("/ordinaryfactory/{shape}")
	public String getShape2(@PathVariable("shape") String shape) {
		if(shape.equals("Circle")) {
			Factory factory = new CircleFactory();
			Shape shape1 = factory.getShape();
			String s = shape1.getShape();
			return s;
		}
		if(shape.equals("Rectangle")) {
			Factory factory = new RectangleFactory();
			Shape shape2 = factory.getShape();
			String s = shape2.getShape();
			return s;
		}
		return null;
		
	}
	
	@RequestMapping("/abstractfactory")
	public String getShape3(@RequestParam("product") String product,@RequestParam("brand") String brand) {
		 AbstractFactory factory;
		 switch(brand) {
		 case "Huawei":  factory = new HuaweiFactory();
		 FactoryDevice device1;
		 if(product.equals("Phone")) {
			  device1 = new HuaweiPhone();
		 }
		 else if(product.equals("Computer")) {
			  device1 = new HuaweiComputer();
		 }
		 else {
			  device1 = new HuaweiVideo();
		 }
		 return device1.getProduct(); 
		
		 case "Apple":  factory = new AppleFactory();
		 FactoryDevice device2;
		 if(product.equals("Phone")) {
			  device2= new ApplePhone();
			
		 }
		 else if(product.equals("Computer")) {
			  device2 = new AppleComputer();
		 }
		 else {
			  device2 = new AppleVideo();
		 }
		 return device2.getProduct();
		 
		 case "Xiaomi": factory = new XiaomiFactory();
		 FactoryDevice device3;
		 if(product.equals("Phone")) {
			  device3 = new XiaomiPhone();
			
		 }
		 else if(product.equals("Computer")) {
			  device3 = new XiaomiComputer();
		 }
		 else {
			  device3 = new XiaomiVideo();
		 }
		 return device3.getProduct();
		
		 
		 }

      
		return null;
		
	}
	
}
