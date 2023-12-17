package task4;

public class Task4 {
    public static int[] rsArr(int[] arr) {
        if (arr[arr.length - 1] == 9) {
            int[] rs = new int[arr.length + 1];
            rs[arr.length - 1] = 1;
            rs[arr.length] = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                rs[i] = arr[i];
            }
            return rs;
        }
        arr[arr.length - 1] = arr[arr.length - 1] + 1;
        return arr;
    }

    // TODO: 17/12/23 Successfully completed
    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{9,9,9};
        int[] ints = rsArr(arr);
        showArray(ints);
    }
}
