package method;


public class Average {
	
  public static void main(String[] args) {
int sum=0;
	  
	  int b[]= {1,2,-3,4,-5};
	 // for(int c=0;c<b.length-1;c++) 
	 for(int c=0;c<b.length;c++) 
//	 if(b[c]>0) {
		 
		 if(b[c]<0) {
		 
	 sum=sum+b[c];
	 
		// System.out.print(" "+sum);
	 }
	  
  System.out.println(sum);
	
}
}
