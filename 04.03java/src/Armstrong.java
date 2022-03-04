
public class Armstrong {

	static boolean armstrong(int num)
	{
		int temp,count=0,last;
		double sum=0;
		temp=num;
		while(temp>0)
		{
			temp=temp/10;//15//1//0
			count++ ;//1//2//3
		}
		temp=num;
		while(temp>0)
		{
			last=temp%10;
			sum=sum+Math.pow(last,count);
			temp=temp/10;
		}
		if(num==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) {
		int num=153;
		System.out.println("the number is"+num);
		if(armstrong(num))
		{
			System.out.println(num+" is armstrong number");
		}
		else
		{
			System.out.println(num+" is not armstrong number");
		}

	}

}
