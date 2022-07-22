import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();

            if(str.equals("END")) {
                break;
            }

            String[] c = new String[str.length()];

            for (int i =0 ; i < str.length(); i++) {
                c[i] = String.valueOf(str.charAt(i));
            }

            for (int i =2 ; i <= str.length() ; i++) {
                c[str.length() -1] += c[str.length() -i];
            }

            System.out.println(c[str.length() -1]);
        }
    }
}