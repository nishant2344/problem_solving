class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 371, temp = num, sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        System.out.println((num == sum) ? "Armstrong" : "Not Armstrong");
    }
}
