package Trainning;

public class GuessTheWord {
    static String guessTheWord(String[] s){
        int max =0,ind = -1;
        for(int i=0;i<s.length;i++){
            if(s[i].length()%2!=0 && s[i].length() > max){
                max = s[i].length();
                ind = i;
            }
        }
        if(ind == -1) return "Better Luck Next Time";
        return s[ind];
    }
    public static void main(String[] args) {
        String[] s = {"Hello","Good","morning","Welcome","you"};
        System.out.println(guessTheWord(s));
    }
}
