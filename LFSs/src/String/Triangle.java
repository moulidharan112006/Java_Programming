package String;

public class Triangle {
    static String triangleType(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Invalid";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }
        return "Scalene";
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;
        System.out.println(triangleType(a, b, c));
    }
}
