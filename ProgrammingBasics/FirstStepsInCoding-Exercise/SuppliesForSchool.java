import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPen = Integer.parseInt(scanner.nextLine());
        int countMarker = Integer.parseInt(scanner.nextLine());
        int countClean = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sumWithoutDiscount = countPen * 5.80 + countMarker * 7.20 + countClean * 1.20;

        double sumWithDiscount = sumWithoutDiscount - (sumWithoutDiscount * discount/100);

        System.out.println(sumWithDiscount);
    }
}
