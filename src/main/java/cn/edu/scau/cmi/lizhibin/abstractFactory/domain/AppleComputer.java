package cn.edu.scau.cmi.lizhibin.abstractFactory.domain;

import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainInterface.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.factory.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domain.*;


public class AppleComputer extends Computer implements Apple{
	
	   public String getProduct() {
		   return brand + super.device;
		   
	   }
}
