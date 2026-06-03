//class {}

import java.util.Scanner;
import java.util.logging.Logger;

public class DemoLogs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Logger logger=Logger.getLogger(DemoLogs.class.getName());
        String[] recruiters={"Google","Dlithe","Cognizant","Accenture","ZOHO"};
        
        // KYC kyc=KYC.getKyc();
        // kyc.name="abc";
        // kyc.contact=983757920;
    }
}

//SingleTonPattern
class KYC{
    String name;
    long contact;
    private static KYC kyc=new KYC();
    public static KYC getKyc(){
        return kyc;
    }
    private KYC(){};
}
