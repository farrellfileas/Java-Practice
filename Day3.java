import java.util.*;

public class Day3 {
    char[] two = {'a', 'b', 'c'};
    char[] three = {'d', 'e', 'f'};
    char[] four = {'g', 'h', 'i'};
    char[] five = {'j', 'k', 'l'};
    char[] six = {'m','n','o'};
    char[] seven = {'p','q','r','s'};
    char[] eight = {'t','u','v'};
    char[] nine = {'w','x','y','z'};

    public static void main(String[] args) {
        String input = "23";
        List<String> result = letterCombinations(input);

        // Expected ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(result.toString());

        input = "2";
        result = letterCombinations(input);

        // Expected ["a","b","c"]
        System.out.println(result.toString());
    }
    
    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        return result;
    }
}