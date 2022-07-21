import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String a = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

        String[] ABC = a.split(" ");

        for (int i = 0; i<26; i++) {
            System.out.print(in.indexOf(ABC[i])+" ");
        }
    }
}
