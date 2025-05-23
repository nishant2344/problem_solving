class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }
        System.out.println("Smallest element: " + min);
    }
}
