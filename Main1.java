import java.util.*;
public class Main1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                i++;
            }
            if(ch==' '){
                count++;
                continue;
               
            }
        }
        return count;

    }
}