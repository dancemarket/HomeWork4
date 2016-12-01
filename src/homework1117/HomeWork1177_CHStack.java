package homework1117;

import homework1123.OhStack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ola on 2016. 11. 17..
 */
public class HomeWork1177_CHStack {

    public static Map<String, String> ruleMap = new HashMap<>();

    public static void main(String[] args) {
        initRule();

        System.out.println(check("[{()()}]"));
        System.out.println(check("[{(()}]"));
    }

    private static void initRule() {
        ruleMap.put("(", ")");
        ruleMap.put("{", "}");
        ruleMap.put("[", "]");
        ruleMap.put("<", ">");
    }

    public static boolean check(String data) {
        OhStack ohStack = new OhStack();

        for (char character :  data.toCharArray()) {

            String current = String.valueOf(character);
            if (ruleMap.containsKey(current)) {
                ohStack.push(current);
            } else if (ruleMap.containsValue(current)) {

                String top = ohStack.pop();
                if (isNotPair(current, top)) {
                    return false;
                }
            }
        }

        return ohStack.empty();
    }

    private static boolean isNotPair(String target, String compare) {
        for (Map.Entry<String, String> entry : ruleMap.entrySet()) {
            if (target.equals(entry.getValue())) {
                String key = entry.getKey();
                if (!key.equals(compare)) {
                    return true;
                }
            }
        }
        return false;
    }
}