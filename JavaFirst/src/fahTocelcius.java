import java.util.Scanner;

public class fahTocelcius {

	public static void main(String[] args) {
		int f ;
		Scanner s = new Scanner(System.in);
		f=s.nextInt();
	//	int cel = (5/9)*(f-32);
		
	//	int cel=(5*(f-32))/9;
		
		int cel =(int) ((5.0/9)*(f-32));
		System.out.println(cel);
		

	}

}
