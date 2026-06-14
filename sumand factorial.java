package itjava.example;

class Calculation {

    static void display() {
        int a = 10, b = 20;
        System.out.println(a + b);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        display();
        System.out.println(factorial(5));
    }
}
