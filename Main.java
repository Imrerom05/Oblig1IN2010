import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Teque teque = new Teque();
            for (int i = 0; i < n; i++) {
                String command = scanner.next();
                int x = scanner.nextInt();
                if (command.equals("push_back")) {
                    teque.push_back(x);
                } else if (command.equals("push_front")) {
                    teque.push_front(x);
                } else if (command.equals("push_middle")) {
                    teque.push_middle(x);
                } else if (command.equals("get")) {
                    System.out.println(teque.get(x));   
    }
}}}



