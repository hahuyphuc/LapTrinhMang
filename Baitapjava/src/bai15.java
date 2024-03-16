import java.util.Scanner;

public class bai15 {
    /*public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println(n + " la so chan");
        }else {
            System.out.println(n + " la so le");
        }
    }*/
    public static void main(String[] args) {

        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();

        if(a==0) {
            if(b==0) {
                System.out.println("Phương trình vô số nghiệm!");
            }else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }else {
            x = -b/a;
            System.out.println("Con nghiem x = "+ x);
        }
    }
}


