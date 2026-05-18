package StriverSheet.Recursion;

public class Print1ToN {
    static void print1ToN(int start,int end){
        if(start == end){
            System.out.print(start+" ");
            return;
        }
        System.out.print(start+" ");
        print1ToN(start+1,end);
    }
    public static void main(String[] args) {
        int n = 4;
        print1ToN(1,n);
    }
}
