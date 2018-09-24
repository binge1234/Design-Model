package cn.edu.scau.cmi.lizhibin.abstractFactory.domain;

import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainInterface.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.factory.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domain.*;
public class HuaweiVideo extends Video implements Huawei{
	   public String getProduct() {
		   return brand + super.device;
		   
	   }
}
