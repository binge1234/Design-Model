package cn.edu.scau.cmi.lizhibin.abstractFactory.factory;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainAbstractClass.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domainInterface.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.factory.*;
import cn.edu.scau.cmi.lizhibin.abstractFactory.domain.*;
public class XiaomiFactory extends AbstractFactory{
      
	public Phone createPhone() {
		return new ApplePhone();
	}
	
	public Computer createComputer() {
		return new AppleComputer();
	}
	
	public Video createVideo() {
		return new AppleVideo();
	}
}
