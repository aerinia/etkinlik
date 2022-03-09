import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
        System.out.print("Hava kaç derece?:");
    int degree= scan.nextInt();
    if(degree<=5){
        System.out.print("Kayak");
    }
    if(5<degree && degree<15) {
        System.out.print("Sinema");
    }
     if(15<=degree && degree<=25) {
         System.out.print("Piknik");
     }
          if(25<degree) {
                System.out.print("Yüzme");
            }
        }
    }


