// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double c =sc.nextDouble();
        double f=c*1.8+32;//перевод температуры из Цельсия в  Фаренгейты
        System.out.println(f);
        System.out.println();
  //==============================================================================
        double rub=sc.nextDouble();
        double dol=rub/78;//перевод рублей в доллары
        double eur=rub/88;//перевод рублей в евро
        System.out.println(dol);
        System.out.println(eur);

        }
    }
