package array1;

public class class2 {

	public static void main(String[] args) {
		class2 lucky = new class2();
		lucky.happy();
		
		lucky.lamp();
		lucky.light();
		lucky.yellow();
	}
public void happy() {
double [] obj = {199.88,109.44,44.55,45.66,56.66,67.44};	
/*int a =obj.length;   //size of the array
System.out.println(a);   //size of array
System.out.println(obj[3]);   // for one value	*/
for(int i =0;i<obj.length;i++) {
System.out.println(obj[i]);	
}
	
}
public void lamp() {//size of the array
int [] sky = {20,30,40,50,60,70,80};
//int a = sky.length;// one way to get length
System.out.println(sky.length);//another way to get length
}	

public void light() {
int [] sky = {20,30,40,50,60,70,80};
System.out.println(sky[5]);
}	

public void yellow() {
int [] sky = {20,30,40,50,60,70,80};
for(int i = 0;i<sky.length;i++) {
System.out.println(sky[i]);	
	
}

}	
	
}
