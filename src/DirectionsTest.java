import java.util.Scanner;

public class DirectionsTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dostępne kierunki: ");
        for(Directions d: Directions.values()){
            System.out.println(d);
        }
        System.out.println("Wybierz kierunek:");
        String dr = scan.nextLine();
        Directions direct = Directions.valueOf(dr);
        direct.printDirections();

    }
}
