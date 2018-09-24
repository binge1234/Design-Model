package cn.edu.scau.cmi.lizhibin.abstractFactory.factory;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;

import cn.edu.scau.cmi.lizhibin.abstractFactory.domainInterface.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.factory.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domain.*;
public class HuaweiFactory extends AbstractFactory{
     
	public Phone createPhone() {
		return new HuaweiPhone();
	}
	
	public Computer createComputer() {
		return new HuaweiComputer();
		
	}
	
	public Video createVideo() {
		return new HuaweiVideo();
	}
	
}
