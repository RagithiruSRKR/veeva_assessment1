import java.util.ArrayList;
import java.util.List;

class CricketScores {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        scores.add(1);
        scores.add(4);
        scores.add(6);
        scores.add(4);
        scores.add(0);

        System.out.println("Ball-by-ball scores: " + scores);
    }
}
