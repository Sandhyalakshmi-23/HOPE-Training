import java.util.*;
class Program{
    public static void main(String[] args){
        String s="hello world java programming";
        String[] arr=s.split(" ");
        int count=0;
        for(String i: arr){
            count++;
        }
        System.out.print(count);
    }
}
