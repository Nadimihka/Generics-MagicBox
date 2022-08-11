import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int box1Length = 5;
        MagicBox<Integer> box1 = new MagicBox<>(box1Length);

        for (int i = 0; i < box1Length; i++) {
            if (!box1.add(i * 100))
                System.out.println(i + " в коробку не влез");
        }
        System.out.println("Из коробки выбран элемент  " + box1.pick());

        int box2Length = 3;
        MagicBox<String> box2 = new MagicBox<>(box2Length);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < box2Length; i++) {
            System.out.println("введите строку или 'end'");
            String s = scanner.nextLine();
            if (s.equals("end")) {
                break;
            } else {
                box2.add(s);
            }
        }
        System.out.println("Из коробки выбран элемент  " + box2.pick());
    }
}