package cn.edu.scau.cmi.lizhibin.singletonpattern;
import java.util.*;
public class Marshal {
    private static Set<Marshal> marshals =new HashSet<Marshal>();
    private String name;
    private Marshal(String name) {
    	this.name = name;
    	
    }
    private String getName() {
    	return name;
    }
    public static void getInstance(String name) {
    	if(name != null && name.equals("") && marshals.size() < 3) {
    		marshals.add(new Marshal(name));
    	}
    }
    public static String[] getMarshals() {
    	String[] m1 = new String[3];
    	int i = 0;
        for(Marshal marshal:marshals) {
        	String s = marshal.getName();
        	m1[i] = s;
        	i++;
        }
        return m1;
    }
    
}
