import java.util.*;
class Program{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int current=0,goingupward=0;
        StringBuilder[] rows=new StringBuilder[];
        if(n==7) return s;
        for(char c:s.toCharArray()){
            rows[current].append(c);
            if(current==0 || current==n-1){
                goingupward=!goingupward;
            }
            current+=goingupward?:-1,1;
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder row:rows){
            ans.append(row);
        }
        return ans.toString();
