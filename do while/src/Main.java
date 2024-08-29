import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*java da bir seyi kac kez tekrarlamak istedigimize
    bagli olarak do-while dongusu var while dongusune
    cok benziyor ama en az bir kez calistiriliyor
     */
        Scanner scanner =new Scanner(System.in);
        String input ="";
        do {
            System.out.println("INPUT");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (!input.equals("quit"));

        /* do while dongusu icindeki kodun en az bir
        kez calistirilmasinigaranti eder while dan ayiran
        en temel ozellik

        do-while dongu kosulu kontrol edilmeden once
        dongu icindeki kod bir kez calistirilir sonra kosul
        kontrol edilir eger kosul dgru ise dongu tekrarlanir
        eger yanlis ise dongu sonlanir


        while da ise once kosul kontrol edilir eger kosul dogru
        ise dongu icindeki kod calistirilir
         */

        /* ilk olarak do blogu calisir bu blogun icinde
        kullanicidan giris alinir ve ekrana yazdirilir

        daha sonra while blou kontrol edilir eger
        kullanici quit yazmadiysa dongu tekrarlair quit yazdiysa
        dongu sonlanir
         */

    }
}