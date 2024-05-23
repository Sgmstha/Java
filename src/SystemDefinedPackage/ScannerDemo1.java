package SystemDefinedPackage;
import java.util.Scanner;
public class ScannerDemo1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Enter your Gender:");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Enter your Mobile Number:");
        long mobileNo = sc.nextLong();
        System.out.println("Enter your CGPA:");
        double cgpa = sc.nextDouble();
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Mobile Number:"+mobileNo);
        System.out.println("CGPA:"+cgpa);

    }
}
