class AddDigits {
    public static void main(String[] args) {
        int num = 4567, sum = 0;
        sum = (num == 0) ? 0 : sum;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
