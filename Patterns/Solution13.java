public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-i;j++){
	            System.out.print("*");
	        }
	        for(int j=0;j<i*2;j++){
	            System.out.print(" ");
	        }
	        for(int j=0;j<n-i;j++){
	            System.out.print("*");
	        }
	        System.out.println(" ");
	    }
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
	        System.out.println();
	        
	    }
	}
}
