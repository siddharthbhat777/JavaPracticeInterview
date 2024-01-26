package LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String question = "   fly me   to   the moon  ";
        int answer = optimisedLengthOfLastWord(question);
        System.out.println(answer);
    }

    private static int optimisedLengthOfLastWord(String question) {
        String [] splitWords = question.split(" ");
        return splitWords[splitWords.length - 1].length();
    }
    private static int lengthOfLastWord(String question) {
        String justifiedQuestion = question.trim().replaceAll("\\s+", " "); // \s means whitespace and \s+ more than 1 consecutive whitespaces
        String [] splitWords = justifiedQuestion.split(" ");
        return splitWords[splitWords.length - 1].length();
    }
}
