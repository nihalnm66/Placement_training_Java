import java.util.Scanner;
import java.io.IOException;

public class Prompt {
    public static void main(String[] args) throws IOException,InterruptedException{
        Scanner scan=new Scanner(System.in);
        Runtime run=Runtime.getRuntime();
        System.out.println("enter the app wish to open? ");
        String app=scan.next();
        Thread.sleep(2000);
        Process pro = new ProcessBuilder("open", "-a", app).start();        
        //windows:
        //Process pro=run.exec(app);
        scan.close();
    }
}
