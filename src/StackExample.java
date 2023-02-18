import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import static java.lang.System.exit;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        while (true) {
            if (st.empty()) {
                System.out.println("Do you want you insert an element?");
            } else {
                System.out.println("\nYour stack length is " + st.size() + "\n");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Do you want you insert one more element?");
            }
            System.out.println("YES: 1         NO:0");
            int isEmpty = sc.nextInt();
            switch (isEmpty) {
                case 0 -> {
                    if (isStackEmpty(st)) {
                        System.out.println("The stack is empty!");
                    } else {
                        System.out.println("\nTop element of stack is " + st.peek());
                        System.out.println("The elements of stack are: " + Arrays.toString(st.toArray()));
                        System.out.print("                            ");
                        for (int i = 1; i <= st.size(); i++) {
                            System.out.print(i + "     ");
                        }
                    }
                    exit(1);
                }
                case 1 -> {
                    System.out.println("Please enter your element:");
                    st.push(input.nextLine());
                }
                default -> {
                    System.out.println("You have entered wrong key, please try again! \n");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    private static boolean isStackEmpty(Stack<String> st) {
        return st.empty();
    }
}
