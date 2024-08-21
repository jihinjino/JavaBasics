package loops;

public class SwapVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b =20;
		int temp =0;
//		temp =a; // 10
//		a =b; //20
//		b =temp; //10
		
		a = a+b;  //25
		System.out.println("Value of a: "+a);
		b =a-b;   //-15
		System.out.println("Value of b: "+b);
		a = a-b;  //5-(15)
		System.out.println("Value of a:"+a);
  
		
		System.out.println("After swapping: "+a+" "+b);
		
	}

}
