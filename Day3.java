import java.util.*;

public class Day3 {
    static char[] two = {'a', 'b', 'c'};
    static char[] three = {'d', 'e', 'f'};
    static char[] four = {'g', 'h', 'i'};
    static char[] five = {'j', 'k', 'l'};
    static char[] six = {'m','n','o'};
    static char[] seven = {'p','q','r','s'};
    static char[] eight = {'t','u','v'};
    static char[] nine = {'w','x','y','z'};

    public static void main(String[] args) {
        String input = "23";
        List<String> result = letterCombinations(input);
        // recursion(string entry, int index, string input)
        // String 
        // --> Really explain what the parameters mean
        // Expected ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(result.toString());

        input = "234";
        result = letterCombinations(input);

        // Expected ["a","b","c"]
        System.out.println(result.toString());
    }
    
    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        helper("", 0, digits, result);
        return result;
    }

    private static void helper(String entry, int index, String digits, List<String> result) {
        if (index == digits.length()) {
            result.add(entry);
        }
        else {
            char[] number = getList(digits.charAt(index));
            for (char i : number) {
                helper(entry + i, index + 1, digits, result);
            }
        }
    }

    private static char[] getList(char digit) {
        if (digit == '2') {
            return two;
        } else if (digit == '3') {
            return three;
        } else if (digit == '4') {
            return four;
        } else if (digit == '5') {
            return five;
        } else if (digit == '6') {
            return six;
        } else if (digit == '7') {
            return seven;
        } else if (digit == '8') {
            return eight;
        } else {
            return nine;
        }
    }
}