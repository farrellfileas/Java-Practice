public class Day7 {
    public static void main(String[] args) {
        String s = "(abcd)";
        System.out.println(reverseParentheses(s)); // Expected dcba

        s = "(u(love)i)";
        System.out.println(reverseParentheses(s)); // Expected iloveu

        s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s)); // Expected leetcode

        s = "a(bcdefghijkl(mno)p)q";
        System.out.println(reverseParentheses(s)); // Expected apmnolkjihgfedcbq
    }

    private static String reverseParentheses(String s) {
        return "";
    }
}
