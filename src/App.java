import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, "cp866");
        String name;
        int choice, choice2;
        System.out.println("RPG GAME");
        System.out.println("1. Начать игру");
        System.out.println("2. Выйти из игры");
        choice = scanner.nextInt();
        if (choice == 1){
            System.out.println("Выберите расу");
            System.out.println("1. Человек");
            System.out.println("2. Эльф");
            System.out.println("3. Орк");
            choice2 = scanner.nextInt();
            if (choice2 == 1) {
                System.out.print("Введите имя:");
                name = scanner.next().toString();
                Human player = new Human(name);
                player.display();
            } else if (choice2 == 2) {
                System.out.print("Введите имя:");
                name = scanner.next().toString();
                Elf player = new Elf(name);
                player.display();
            } else if (choice2 == 3) {
                System.out.print("Введите имя:");
                name = scanner.next().toString();
                Orc player = new Orc(name);
                player.display();
            } else {
                System.out.println("Неверный ввод!");
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
        scanner.close();


    }

}
