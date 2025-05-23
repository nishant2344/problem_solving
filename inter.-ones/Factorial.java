class Factorial {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        fact = (num == 0) ? 1 : fact;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
