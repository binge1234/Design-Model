package cn.edu.scau.cmi.lizhibin.componsite.transparent;

public class Person implements Member{
	

	@Deprecated
	public String add(Member member) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	

	@Deprecated
	public String delete(Member member) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	

}
