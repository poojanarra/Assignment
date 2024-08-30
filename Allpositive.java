package method;

public class Allpositive {
	//Copy array
		public static void main(String[] args) {
		  int a[]= {1,2,3,4,5,6,8,9,9};
		  int b[]= new int[a.length];
		  for(int i=0;i<a.length;i++) {
		  b[i]= a[i];
		    System.out.print(" "+b[i]);
		} 

}

}