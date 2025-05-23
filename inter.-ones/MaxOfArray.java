class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
        }
        System.out.println("Maximum element: " + max);
    }
}
