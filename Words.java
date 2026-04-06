import java.util.*;
public class Words{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int len=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                len=i;
            }
            if(len%2==0){
                System.out.print(Character.toString(arr[i]));
            }
        }
            
    }
}