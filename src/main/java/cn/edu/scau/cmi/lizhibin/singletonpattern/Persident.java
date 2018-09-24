package cn.edu.scau.cmi.lizhibin.singletonpattern;

public class Persident {
	private String name;
	private static Persident instance;
	
	private Persident(String name) {
		this.name = name;
	}
	
	public static Persident getInstance(String _name) {
		if (instance == null && _name != null && !_name.equals("")) {
			instance = new Persident(_name);
		}
		return instance;
	}
	
	public String getName(){
		
		return this.name;
	}
}