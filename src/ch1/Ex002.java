package ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Ex002 {

    public static void main(String[] args) {
        // 문자열에서 반복되지 않는 첫번째 문자 찾기
        // 공백은 제외하고

        String str = "!!555562223"; // 일 때 5 반환

        Character answer = firstNonRepeatedChar(str);
        System.out.println(answer);
    }

    private static Character firstNonRepeatedChar(String paramStr) {
        Character answer = null;
        if(paramStr.length() == 0) {
            return answer;
        } else if(paramStr.length() == 1) {
            return paramStr.charAt(0);
        }

        // 이전, 지금, 다음 비교
        // 단, 마지막은 다음 비교 필요없음
        // 즉 이전, 지금이 2번 다르거나, 처음, 마지막에 1번만 다르면 정답
        // Iterator로 do ~ while hasNext 하면 되려나

        ArrayList<Character> list = new ArrayList<Character>();
        
        for(int i = 0; i < paramStr.length(); i++) {
            list.add(paramStr.charAt(i));
        }

        Iterator<Character> iterator = list.iterator();

        Character bef = iterator.next();
        Character now;
        int result = 1;
        
        do{
            
            now = iterator.next();

            if(bef != now) {
                result++;
            } else {
                result = 0;
            }
            
            if(result == 2) {
                return bef;
            } else {
                bef = now;
            }
            
            
        } while (iterator.hasNext());

        if(result == 0) {
            return null;
        } else {
            return bef;
        }
        
    }
    
}
