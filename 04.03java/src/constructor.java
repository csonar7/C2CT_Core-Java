class car1
{
	private int id;
	private String model;
//	public car1()
//	{
//		id=30;
//		model="chetan";
//	}
	public car1(String n, int i)
	{
		id=i;
		model=n;
	}
	
//	public void setid(int i)
//	{
//		id = i;
//	}
	public int getid() 
	{
		return id;
	}
//	public void setmodel(String m)
//	{
//		model = m;
//	}
	public String getmodel()
	{
		return model;
	}
	
}

public class constructor {

	private static final String String = null;

	public static void main(String[] args) {
		int i;
		java.lang.String n;
		car1 nike = new car1(n= "sonu", i= 25);
		System.out.println(nike.getid());
		System.out.println(nike.getmodel());
		
		

	}

}
