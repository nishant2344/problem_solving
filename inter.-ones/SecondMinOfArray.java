class SecondMinOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34};
        int min = arr[0], secondMin = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }
        for (int i = 0; i < arr.length; i++) {
            secondMin = (arr[i] < secondMin && arr[i] != min) ? arr[i] : secondMin;
        }
        System.out.println("Second smallest element: " + secondMin);
    }
}
