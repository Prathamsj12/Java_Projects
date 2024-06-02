import java.util.Arrays;
import java.util.Scanner;
public class USDToRS {
    public static void main(String[] args) {
        double Value=86.86;
        System.out.println("Enter the USDT :");
        Scanner sc=new Scanner(System.in);
        int USDT=sc.nextInt();
        double TOIndiaRupee=USDT *Value;
        System.out.println("USDT Convert Into Rupees is "+TOIndiaRupee);

    }
}