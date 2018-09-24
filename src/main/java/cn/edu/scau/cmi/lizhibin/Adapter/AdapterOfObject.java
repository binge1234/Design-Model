package cn.edu.scau.cmi.lizhibin.Adapter;

public class AdapterOfObject implements Target{
    Adaptee adaptee;
    public AdapterOfObject(Adaptee adaptee) {
    	this.adaptee = adaptee;
    	
    }
	public int Output_5() {
		// TODO Auto-generated method stub
		int V = adaptee.Output_220();
		System.out.println("适配器开始工作");
		int v = V / 44;
		System.out.println("将交流电压220V转变为5V");
		return v;
	}
}
