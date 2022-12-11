import java.util.Scanner;
public class CalculatorJava101SwitchCase {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. Sayıyı giriniz");
        n1 = input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz");
        n2 = input.nextInt();
        System.out.println("toplama = 1 \nçıkarma = 2 \nçarpma = 3 \nbölme = 4");

        System.out.print("Seçiminiz:");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam:"+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma:" + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma:" +(n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Hiçbir sayı 0 ile bölünemez. Lütfen tekrar deneyiniz");
                        break;
                    default:
                        System.out.println("Bölme:" + (n1/n2));
                }
                break;
        }
    }

}
