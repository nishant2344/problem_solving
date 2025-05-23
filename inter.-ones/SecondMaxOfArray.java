class SecondMaxOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34};
        int max = arr[0], secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
        }
        for (int i = 0; i < arr.length; i++) {
            secondMax = (arr[i] > secondMax && arr[i] != max) ? arr[i] : secondMax;
        }
        System.out.println("Second maximum element: " + secondMax);
    }
}
