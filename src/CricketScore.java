import java.util.HashMap;

public class CricketScore {
    public static void main(String[] args) {
        int [] score = cricketScore();
        if (score[1] == 0) {
            System.out.println("Overs = " + score[0] + " overs");
        } else {
            System.out.println("Overs = " + score[0] + " overs and " + score[1] + " balls");
        }
        System.out.println("Runs = " + score[2]);
        System.out.println("Wickets = " + score[3]);
        System.out.println("Wide balls = " + score[4]);
    }

    private static int[] cricketScore() {
        int min = 0;
        int max = 8;
        int totalRuns = 0;
        HashMap <Integer, Integer> countSpecial = new HashMap<>();
        countSpecial.put(7, 0);
        countSpecial.put(8, 0);
        int overBalls = 0;
        int overs = 0;
        int i;
        for (i = 0; i<120; i++) {
            int randomRun = (int) (Math.random() * (max-min+1) + min);
            if (randomRun < 6) {
                System.out.println("Ball " + (i+1) + " = " + randomRun);
                overBalls++;
            } else if (randomRun == 7) {
                System.out.println("Ball " + (i+1) + " = " + "Wide Ball");
            } else {
                System.out.println("Ball " + (i+1) + " = " + "Wicket");
                overBalls++;
            }
            if (randomRun == 7) {
                randomRun = 1;
                countSpecial.put(7, countSpecial.get(7) + 1);
                i--;
            }
            if (randomRun == 8) {
                randomRun = 0;
                countSpecial.put(8, countSpecial.get(8) + 1);
            }
            if (countSpecial.get(8) == 10) {
                System.out.println("\nInning end as wickets are 5");
                break;
            }
            if (randomRun < 6) {
                totalRuns = totalRuns+randomRun;
            }
            if (i == 119) {
                System.out.println("\nInning end as overs are 3");
            }
            if (overBalls == 6) {
                overs = overs + 1;
                overBalls = 0;
            }
        }

        return new int[]{overs, overBalls, totalRuns, countSpecial.get(8), countSpecial.get(7)};
    }
}
