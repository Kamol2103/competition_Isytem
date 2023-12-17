package task6;

public class Task6 {
    public static String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + res[p2];

                res[p1] += sum / 10;
                res[p2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : res) if (!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
        // TODO: 17/12/23 successfully completed
    }

    public static void main(String[] args) {
        System.out.println("multiply(\"3\",\"2\") = " + multiply("5", "4"));
        System.out.println("multiply(\"123\",\"456\") = " + multiply("123", "456"));
    }
}