
public class fibonacciseries {

	public static void main(String[] args) {
		int i,a=0,b=1,c,count=10;
		System.out.print(a+" "+b);
		for(i=2;i<count;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
