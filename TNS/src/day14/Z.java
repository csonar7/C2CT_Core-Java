package day14;

class X 
{
	public void m1()
	{
		System.out.println("this is thex class");
	}
}

class Y extends X
{
	//m1();
	public void m2()
	{
		System.out.println("this is Y class which extends X");
	}
}

public class Z {
	
	public static void main(String[] args) {
		
		Y a ;
		a= new Y();
		a.m1();
		a.m2();
		
	}

}
