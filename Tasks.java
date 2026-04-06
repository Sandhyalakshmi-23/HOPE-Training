<<<<<<< HEAD
import java.util.*;
public class Tasks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
               
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
=======
import java.util.*;
public class Tasks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
               
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
>>>>>>> a6a9cce24ff92adce4fe1431f66e8951287cb92a
}