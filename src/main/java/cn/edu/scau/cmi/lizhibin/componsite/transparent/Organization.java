package cn.edu.scau.cmi.lizhibin.componsite.transparent;

import java.util.ArrayList;
import java.util.List;



public class Organization implements Member{
	private List<Member> team = new ArrayList<Member>();
    public String add(Member member) {
   	 team.add(member);
   	 System.out.println("添加成功");
   	 return "添加成功";
    }
    
    public String delete(Member member) {
   	 
   	 team.remove(member);
   	 System.out.println("删除成功");
   	 return "删除成功";
    }
}
