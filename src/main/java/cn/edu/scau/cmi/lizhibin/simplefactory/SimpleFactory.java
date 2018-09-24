package cn.edu.scau.cmi.lizhibin.simplefactory;

import cn.edu.scau.cmi.lizhibin.domain.Circle;
import cn.edu.scau.cmi.lizhibin.domain.Rectangle;
import cn.edu.scau.cmi.lizhibin.domain.Shape;

public class SimpleFactory {
   public static Shape getShape(String s) {
	   if(s.equals("Rectangle")) {
		   
		   return new Rectangle();
	   }
	   else {
		   return new Circle();
	   }
   }
}
