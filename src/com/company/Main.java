package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String string = "Experience is simply the name we give our mistakes.";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {

            char charAt = string.charAt(i);

            if (map.containsKey(charAt)) {
                Integer integer = map.get(charAt);

                integer++;
                map.put(charAt, integer);
            } else {
                map.put(charAt, 1);
            }

            if (map.get(charAt) == 2) {
                System.out.println("first dublicate charapter is: " + charAt);
                break;
            }

        }

    }
}
