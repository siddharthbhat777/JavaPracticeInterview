import java.util.Random;

public class RandomKeyword {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));//between 0 to +9
        }
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(21)-10);//between -10 to +10
        }
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(6)+1);//between +1 to +6
        }
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextBoolean());
        }
    }
}
