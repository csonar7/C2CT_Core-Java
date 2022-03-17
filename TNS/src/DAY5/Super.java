package DAY5;



class test
{
//	test()
//	{
//		System.out.println("this is the parent class");
//		
//	}
	static int c=10;
	static int v;
	static void m1()
	{
		v=c*9;
		System.out.println("by using static");//static keyword
	}
	static {
		v=c*9;
	}
}
class exam extends test
{
	exam()
	{
		super();
		System.out.println("this is child class");
	}
}
public class Super {

	public static void main(String[] args) {
		//test s=new test();
		exam e=new exam();
		test a =new test();
		a.m1();
		System.out.println(a.v);
	}

}
