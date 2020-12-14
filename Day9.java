public class Day9 {
    public static void main(String[] args) {
        // ((2 + 1) * 3) = 9
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));

        // (4 + (13 / 5)) = 6
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));

        //   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
        // = ((10 * (6 / (12 * -11))) + 17) + 5
        // = ((10 * (6 / -132)) + 17) + 5
        // = ((10 * 0) + 17) + 5
        // = (0 + 17) + 5
        // = 17 + 5
        // = 22
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    private static int evalRPN(String[] tokens) {
        return 0;
    }
}
