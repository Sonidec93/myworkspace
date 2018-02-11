package staticFeatures;

class A{

	private static String a="Mukul";
	
	
	static{
		System.out.println(a);
	}
	
	public static  String sgetValue(){
		return a;
	}

}

public class Student{
	
	public static void main(String arg[]){
		System.out.println(A.sgetValue());
	
	}
}
