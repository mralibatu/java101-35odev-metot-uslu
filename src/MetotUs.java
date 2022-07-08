import java.util.Scanner;
public class MetotUs {

    static int uslu(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Sonuc : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayiyi giriniz : ");
        int a = input.nextInt();
        System.out.println("Us sayiyi giriniz : ");
        int b = input.nextInt();
        uslu(a,b);
    }
}
