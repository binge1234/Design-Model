package cn.edu.scau.cmi.lizhibin.Adapter;

public class AdapterOfClass extends Adaptee implements Target{//采用类适配器去适配适合客户的接口

	public int Output_5() {
		// TODO Auto-generated method stub
		int V = Output_220();
		System.out.println("适配器开始工作");
		int v = V /44;
		System.out.println("将交流220V转变为直流5V");
		return v;
	}
	
}
