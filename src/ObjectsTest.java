import java.util.Scanner;

public class ObjectsTest {
    public static void main(String[] args) {
        Objects[] chocolade = new Objects[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < chocolade.length; i++) {
            System.out.println("Podaj markę czekolady:");
            String brand = scanner.nextLine();
            System.out.println("Podaj rodzaj czekolady");
            String kind = scanner.nextLine();
            System.out.println("Podaj cenę:");
            double pr = scanner.nextDouble();
            scanner.nextLine();
            chocolade[i] = new Objects(brand, kind, pr);

            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (chocolade[i].equals(chocolade[j])) {
                        System.out.println("Duplikat! Wprowadź produkt ponownie.");
                        i--;
                    }

                }
            }
        }
            for (Objects obj : chocolade) {
                System.out.println(obj);
            }


        }
    }
