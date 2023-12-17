package task10;

public class Task10 {
    public static int[] listIndexTarget(int[] arr, int target) {
        int[] arrays = new int[2];
        arrays[0] = -1;
        arrays[1] = -1;
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target &&count == -1) {
                arrays[0] = i;
                count=i;
            }
            else if (arr[i]==target){
                count=i;
            }
            arrays[1] = count;
        }
        return arrays;
    }

    // TODO: 17/12/23 Success 
    public static void showArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] ints = listIndexTarget(new int[]{}, 0);
        showArray(ints);
    }
}
