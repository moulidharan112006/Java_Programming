package String;

public class GuessTheWord {
    static String theWord(String[] s){
        int index = -1;
        for(int i=0;i<s.length;i++){
            if(index!=-1 && s[i].length()%2!=0 && s[i].length() > s[index].length()) index = i;
            else if(index == -1 && s[i].length()%2!=0) index = i;
        }
        return (index == -1)?"Better Luck Next Time":s[index];
    }
    public static void main(String[] args) {
//        int n = 5;
        String[] s = {"hello","word","morning","welcome","you"};
//        String[] s = {"Go","To","Hell"};
        System.out.println(theWord(s));
    }
}
