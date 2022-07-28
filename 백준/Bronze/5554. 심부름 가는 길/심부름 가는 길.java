
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int sum=0;
        int x,y;
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        x=sum/60;
        y=sum%60;

        System.out.println(x);
        System.out.println(y);

    }
}
