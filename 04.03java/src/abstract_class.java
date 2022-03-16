abstract class AC 
{
	public AC()//constructor
	{
		System.out.println("Constructor of AC");
	}
	public void degree()
	{
		System.out.println("30 degree celcies");
	}
	abstract public void Swichoof();
	
}
class DC extends AC
{

	@Override
	public void Swichoof() {
		System.out.println("Hello !!!!!!");
		
	}
	
}
public class abstract_class {

	public static void main(String[] args) {
		AC a= new DC();
		a.degree();
		

	}

}
