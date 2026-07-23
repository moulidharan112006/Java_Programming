package Zoho;

public class Pattern {
    static void printAsPattern(String s){
        int n = s.length();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j == i){
                    System.out.print(s.charAt(i));
                }
                else if(j == n-1-i){
                    System.out.print(s.charAt(n-1-i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        String s = "zohoround";
        printAsPattern(s);
    }
}
