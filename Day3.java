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
        // Expected ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(result.toString());

        input = "234";
        result = letterCombinations(input);

        // Expected ["a","b","c"]
        System.out.println(result.toString());
    }
    
    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        return result;
    }
}