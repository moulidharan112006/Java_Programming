package StriverSheet.Recursion;

public class PrintNTimesName {
    static void recursion(int n){
        if(n < 1) return;
        System.out.println("Mouli");
        recursion(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        recursion(n);
    }
}
