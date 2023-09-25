package ch1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex001 {

    public static void main(String[] args) {
        
        // 001. 문자 개수 세기
        // 주어진 문자열에서 문자 개수를 세는 프로그램을 작성하라.
        // aaabb이면 a 3개, b 2개
        String param = "aaabbcccaa";

        Map resultMap; 

        resultMap = countCharInString(param);

        System.out.println(resultMap);


    }

    private static Map<Character, Integer> countCharInString(String param) {

        char[] chArr = param.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char ch : chArr) {
            if(map.get(ch) != null) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        

        return map;
    }






    
}
