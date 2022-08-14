import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("tutar girin= ");
        int tutar =scanner.nextInt();
        System.out.print("kdv oran  miktarını girin = ");
        int kdvt =scanner.nextInt();
        double kdvtutar =tutar+((tutar*kdvt)/100);
        System.out.print("kdv uygulanmış yeni tutarınız = "+kdvtutar);


    }
}
