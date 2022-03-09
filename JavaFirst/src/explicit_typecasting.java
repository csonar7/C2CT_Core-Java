

public class explicit_typecasting {
//	whenever we want to add large size data to small size we used typecasting,and we forcly add to data 
//	then we used explicit typecasting 

	public static void main(String[] args) {
		float f =1.223f;
		System.out.println(f);
		double d= f;
		char c='s';
		int i =25;
		System.out.println(c);
//		long l=12311l;
//		i=(int)l;//this is called explicit typecasting
//		System.out.println(i);
		char abc=(char)i;//this is called explicit typecasting
		System.out.println(abc);
		int k='c';
				System.out.println(k);
		char z='a';
		char x =(char) (z + 6);
		System.out.println('a'/3);

	}

}
