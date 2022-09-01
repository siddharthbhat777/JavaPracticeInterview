public class PatternQuestions {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
//        O/P:
//         * * * * * *
//         * * * * * *
//         * * * * * *
//         * * * * * *

        System.out.println("\n--------------------------------------\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
//        O/P:
//         * * * *
//         * * *
//         * *
//         *

        System.out.println("\n--------------------------------------\n");

        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
//        O/P:
//         *
//         * *
//         * * *
//         * * * *

        System.out.println("\n--------------------------------------\n");

        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        O/P:
//         * * * * *
//         *       *
//         *       *
//         * * * * *

        System.out.println("\n--------------------------------------\n");

        for (int i = 1; i <= 4; i++)//4//3
        {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
//            O/P:
//                   *
//                 * * *
//               * * * * *
//             * * * * * * *

        System.out.println("\n--------------------------------------\n");

        for (int i = 4; i > 0; i--)//4//3
        {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
//        O/P:
//         * * * * * * *
//           * * * * *
//             * * *
//               *
    }
}
