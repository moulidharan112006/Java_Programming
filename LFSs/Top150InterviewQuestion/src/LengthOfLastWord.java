public class LengthOfLastWord {
    static int lengthOfWord(String s){
        String[] str = s.split("\\s");
        return str[str.length -1].length();
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfWord(s));
    }
}
