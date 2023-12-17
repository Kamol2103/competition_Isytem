package task5;

public class Task5 {
    public static int reverse(int n){
        int result=0;
        while (n!=0){
            result+=n%10;
            result*=10;
            n/=10;
        }
       return result/=10;
    }

    // TODO: 17/12/23 Succesfully completed
    public static void main(String[] args) {
        System.out.println(reverse(120));
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
    }
}
