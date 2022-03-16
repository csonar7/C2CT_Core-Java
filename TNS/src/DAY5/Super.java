package DAY5;



class test
{
	test()
	{
		System.out.println("this is the parent class");
		
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
	}

}
