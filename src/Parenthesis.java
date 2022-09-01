import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        String s = "{[]()}!";
        Parenthesis p = new Parenthesis();
        if (p.isValid(s)) {
            System.out.println("It is valid");
        } else {
            System.out.println("It is not valid");
        }
    }
    public boolean isValid(String s) {
        if (!String.valueOf(s.charAt(s.length() - 1)).equals("!"))
        {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == '[' || s.charAt(i) == ']' || s.charAt(i) == '(' || s.charAt(i) == ')')
            {
                if(!st.empty() && isvalid(st.peek(),s.charAt(i))){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if (st.isEmpty()) return true;
        return false;
    }

    static boolean isvalid(char l, char r){
        if((l=='{' && r=='}') || (l=='(' && r==')') || (l=='[' && r==']')) return true;
        return false;
    }
}
