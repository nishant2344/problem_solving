class FibonacciThreeTerm {
    public static void main(String[] args) {
        int n = 7, a = 0, b = 1, c = 2;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 3; i < n; i++) {
            int d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}
