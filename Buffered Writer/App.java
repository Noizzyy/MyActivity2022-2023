import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            FileReader reader = new FileReader();
            int character;
        
            while ((character = reader.read()) != -1) {
                System.out.println((char)character);  
            }
            reader.closed();
        } catch(IOExceptio e){
            e.printStackTrace();
        }
    }       
}
