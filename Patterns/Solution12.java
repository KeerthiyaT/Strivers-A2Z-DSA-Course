public class Main
{
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++){
		    for(char j=(char)(int)('A'+n-i-1);j<(char)(int)('A'+n-1);j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
