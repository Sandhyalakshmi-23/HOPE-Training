public class Wrapper{
    public int test(String s){
        return valueOf(s);
    }
    public static void main(String[] args){
        Integer b=Integer.valueOf("1234");//return type->object(Integer)
        Integer b=Integer.parseInt("4567");// return type->int(int)
        int a=b.intValue();
        Integer x=128;
        System.out.print(test1("123"));
    }
}