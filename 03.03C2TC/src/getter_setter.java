class car
{
	private int id;
	private String model;
	
	public void setid(int i)
	{
		id = i;
	}
	public int getid() 
	{
		return id;
	}
	public void setmodel(String m)
	{
		model = m;
	}
	public String getmodel()
	{
		return model;
	}
}



public class getter_setter {

	public static void main(String[] args) {
		car Honda= new car();
		Honda.setid(25);
		System.out.println(Honda.getid());
		Honda.setmodel("hhh210vv");
		System.out.println(Honda.getmodel());
		
	}

}
