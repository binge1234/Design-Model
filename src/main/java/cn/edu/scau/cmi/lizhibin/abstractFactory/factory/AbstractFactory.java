package cn.edu.scau.cmi.lizhibin.abstractFactory.factory;

import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainInterface.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.factory.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domain.*;
public abstract class AbstractFactory {
   public static AbstractFactory getFactory(String name) {
	   switch(name) {
	   case "Apple"  :return new AppleFactory(); 
	   case "Huawei" :return new HuaweiFactory();
	   case "Xiaomi" :return new XiaomiFactory();
	   }
	   return null;
   }
   
   public abstract Phone createPhone() ;
   public abstract Computer createComputer();
   public abstract Video createVideo() ;
   
}
