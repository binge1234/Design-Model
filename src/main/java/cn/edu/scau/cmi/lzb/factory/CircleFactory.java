package cn.edu.scau.cmi.lzb.factory;

import cn.edu.scau.cmi.lizhibin.domain.*;

public class CircleFactory implements Factory{

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return new Circle();
	}
        
}
