import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj 5 imion:");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();
        String name4 = input.nextLine();
        String name5 = input.nextLine();
        System.out.println("Cześć " + name5);
        System.out.println("Cześć " + name4);
        System.out.println("Cześć " + name3);
        System.out.println("Cześć " + name2);
        System.out.println("Cześć " + name1);
        input.close();
    }
}
