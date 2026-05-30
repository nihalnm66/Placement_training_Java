import java.util.*;
import java.util.regex.Pattern;
public class KYC {
    static Map<String, String> patterns = new HashMap<>();
    static {
        patterns.put("name", "^[A-Za-z ]{3,}$");
        patterns.put("password", "^(?=.*[@#$!])[A-Za-z0-9?=.@#$!*]{8,}$");
        patterns.put("aadhaar", "^[0-9]{12}$");
        patterns.put("pan", "^[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}$");
        patterns.put("email", "^[a-z0-9-_]{2,}@[a-z]{3,}\\.[a-z]{2,}$");
    }
    static String validateKYC(Map<String, String> userData) {
        boolean flag = true;
        for (Map.Entry<String, String> entry : userData.entrySet()) {
            String field = entry.getKey();
            String value = entry.getValue();
            String regex = patterns.get(field);     
            if (!Pattern.matches(regex, value)) {
                System.out.println("Invalid " + field);
                flag = false;
            }
        }
        return flag ? "Account created" : "Invalid User data";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> user = new LinkedHashMap<>();
        System.out.println("KYC Registration");
        System.out.print("Enter Name: ");
        user.put("name", scanner.nextLine());
        System.out.print("Enter Password: ");
        user.put("password", scanner.next());
        System.out.print("Enter Aadhaar Number (12 digits): ");
        long aadhaarNum = scanner.nextLong(); 
        user.put("aadhaar", String.valueOf(aadhaarNum)); 
        System.out.print("Enter PAN Number: ");
        user.put("pan", scanner.next());
        System.out.print("Enter Email: ");
        user.put("email", scanner.next());
        System.out.println("\n--- Validation Results ---");
        System.out.println(validateKYC(user));
        scanner.close();
    }
}