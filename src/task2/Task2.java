package task2;

public class Task2 {
    public static  int [] removeTarget(int [] arr, int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==target){
               count++;
           }

        }
        if (count==0)return arr;
        int [] result=new int[arr.length-count];

        int k=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==target)continue;
               result[k++]=arr[i];
        }
        return result;
    }

    // TODO: 17/12/23 Success
    public static void showArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] ints = removeTarget(new int[]{9,2,3,4,2,-8,2}, 2);
        showArray(ints);
    }
}
