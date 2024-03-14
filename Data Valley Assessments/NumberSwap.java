public class NumberSwap {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap a and b without using a third variable and without using + or - operators
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
