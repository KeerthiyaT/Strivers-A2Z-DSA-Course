class Main {
 static void pattern20(int n)
 {
  int spaces = 2*n-2;
      for(int i = 1;i<=2*n-1;i++){
       int stars = i;
          if(i>n) stars = 2*n - i;
           for(int j=1;j<=stars;j++){
              System.out.print("*");
          }
          for(int j = 1;j<=spaces;j++){
              System.out.print(" ");
          }
         for(int j = 1;j<=stars;j++){
              System.out.print("*");
          }
          if(i<n) spaces -=2;
          else spaces +=2;
      }
}
//ANOTHER METHOD
public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int space=n*2-2;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print("*");
	        }
	        
	        for(int j=0;j<space;j++){
	            System.out.print(" ");
	        }
	        space-=2;
	        for(int j=0;j<=i;j++){
	            System.out.print("*");
	        }
	        System.out.println(" ");
	    }
	   
	    for(int i=1;i<n;i++){
	        for(int j=i;j<=n-1;j++){
	            System.out.print("*");
	        }
	        
	        for(int j=0;j<i*2;j++){
	            System.out.print(" ");
	        }
	       
	        for(int j=i;j<=n-1;j++){
	            System.out.print("*");
	        }
	        System.out.println();
	        
	    }
	}
}
