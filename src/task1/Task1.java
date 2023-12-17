package task1;

public class Task1 {
    public static boolean degree(int n){
        if (n==1)return true;
        while (n>0){
            if (n%4!=0){
                return false;
            }

            n/=4;
        }
        return true;
    }

    // TODO: 17/12/23 Successfully completed

    public static void main(String[] args) {
        System.err.println(degree(3));
    }

}
