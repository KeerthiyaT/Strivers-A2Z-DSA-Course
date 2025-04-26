class Main {
   
   static void pattern15(int N)
{
     
      for(char i=0;i<N;i++){
          
          for(int j=0;j<=i;j++){
              System.out.print((char)((int)('A'+i)) + " ");
              
          }
        
          System.out.println();
         
      }
}
