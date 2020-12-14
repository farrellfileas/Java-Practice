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
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '(') {
                i = helper(characters, i);
            }
        }
        String result = "";
        for (char c : characters) {
            if(c != '(' && c != ')') {
                result += c;
            }
        }
        return result;
    }
    //s = "(u(love)i)";
    private static int helper(char[] s, int index) {
        for (int i = index + 1; i < s.length; i++) {
            if (s[i] == '(') {
                i = helper(s, i);
            }
            else if (s[i] == ')') {
                flip(s, index, i);
                return i;
            }
        }
        return 0;
    }

    private static void flip(char[] s, int a, int b) {
        while(a < b) { 
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            b--;
            a++;
         }
    }

    /*
    at the end of the function
    string result
    traverse 
    traverse char s
        result += s[i] if s[i] is not ( or )

    helper(char[] s, int index)
    traverse the string from index + 1
        if i see a ( 
            helper(string, i)
        if i see a ) 
            flip(index, i, s)

    flip(a, b, s) 
         while(a < b) {
            char temp = s[a]
            s[a] = s[b]
            s[b] = temp
            b--;
            a++;
         }
    */
}
