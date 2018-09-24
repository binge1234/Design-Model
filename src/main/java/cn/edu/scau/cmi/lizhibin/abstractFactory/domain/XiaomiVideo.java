package cn.edu.scau.cmi.lizhibin.abstractFactory.domain;

import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainInterface.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.factory.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domain.*;

public class XiaomiVideo extends Video implements Xiaomi{ 
       
	   public String getProduct() {
		   return brand + super.device;
		   
	   }
}
