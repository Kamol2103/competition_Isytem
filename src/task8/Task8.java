package task8;

public class Task8 {
    public static void max(int[] n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max1Index = -1;
        for (int i = 0; i < n.length; i++) {
            if (max1 < n[i]) {
                max1 = n[i];
                max1Index = i;
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (max1Index == i) continue;
            if (max2 < n[i]) {
                max2 = n[i];
            }
        }
        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
    }
    // TODO: 17/12/23 Successfully completed
    public static void main(String[] args) {
        max(new int[]{2,1});
    }


}
