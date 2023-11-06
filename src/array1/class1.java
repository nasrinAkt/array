package array1;

public class class1 {

	public static void main(String[] args) {
		class1.dhaka();
		 class1.dhaka1();
		
		
	}
public static void dhaka() {//printing one value on array
String [] joy = {"java","cucumber","apple","banana"};
	System.out.println(joy[3]);

}
public static void dhaka1() {//size of the array 
String [] joy = {"java","cucumber","apple","banana"};
/*int a=joy.length;//by length method we can know size of the array. length method given by java
	System.out.println(a);*/
for(int i =0;i<joy.length;i++) {
System.out.println(joy[i]);	
}
}
	
	
	
	
}
