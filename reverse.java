import java.util.Scanner;
import java.util.Arrays;
class main{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n;
         n=sc.nextInt();
        int[] a= new int[n];
        int b=a.length;
        System.out.println("size of array :" +b);
        for (int i=0; i <= a.length-1; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("number" +Arrays.toString(a));
        for(int i=0;  i<b-1;i++){
            b--;
        int temp = a[i];
        a[i]=a[b];
        a[b]= temp;
        i++;
        b--;
            
        }
        System.out.println(Arrays.toString(a));
      
            
            
        }
       
    
}
