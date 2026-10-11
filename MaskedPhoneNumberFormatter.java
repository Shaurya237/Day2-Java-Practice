import java.util.Scanner;

public class MaskedPhoneNumberFormatter {
    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) {
            return "Invalid phone number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        StringBuilder maskedPhone = new StringBuilder(phone);
        maskedPhone.replace(0, 6, "XXXXXX");
        maskedPhone.insert(6, '-');
        return maskedPhone.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10-digit phone number: ");
        String phone = scanner.nextLine().trim();
        System.out.println(maskPhoneNumber(phone));
        scanner.close();
    }
}
