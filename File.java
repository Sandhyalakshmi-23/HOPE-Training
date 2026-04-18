import java.io.FileWriter;
import java.io.IOException;
public class File {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("test,txt");
            fw.write("Write using filewriter");
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
