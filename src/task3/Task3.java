package task3;

public class Task3 {
    public static int lastStrLength(String s){
        s.replaceAll("  "," ");
        String[] s1 = s.split(" ");
        return s1[s1.length-1].length();
    }
    //todo: Success

    public static void main(String[] args) {
        String str="Hello Worldovv as  ";
        String str1="Men Eng kuchli     Dasturchiman  ";
        System.out.println(lastStrLength(str));
        System.out.println("lastStrLength(str1) = " + lastStrLength(str1));
    }
}
