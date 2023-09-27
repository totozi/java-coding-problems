package ch1;

import java.util.Arrays;
import java.util.ListIterator;

public class Ex003 {
    public static void main(String[] args) {
        
        String paramStr = "12345 6789 abcdefg";

        // 단어 뒤집기
        paramStr = reverseWords(paramStr);

        // 글자 뒤집기
        paramStr = reverseChars(paramStr);

        System.out.println(paramStr);

    }

    private static String reverseWords(String paramString) {

        // 단어 쪼개기
        String[] strArr = paramString.split(" ");

        // 거꾸로 출력해주기
        return printWordsIntoSentence(strArr, -1);

    }

    private static String reverseChars(String paramString) {

        // 단어 쪼개기
        String[] strArr = paramString.split(" ");

        String tmp = "";

        // 글자 뒤집기
        for(int i = 0; strArr.length > i; i++) {
            
            tmp = "";

            for(int j = strArr[i].length() - 1; j >= 0; j--) {
                tmp += strArr[i].charAt(j);
            }

            strArr[i] = tmp;
        }

        return printWordsIntoSentence(strArr, 1);

    }

    // 출력 방향대로 단어 이어붙이기
    private static String printWordsIntoSentence(String[] strArr, int direction) {

        StringBuilder stringBuilder = new StringBuilder();

        // 뒤부터 출력
        if(direction < 0) {

            ListIterator<String> listIterator = Arrays.asList(strArr).listIterator(strArr.length);

            for(int i = 0; strArr.length > i; i++) {
                stringBuilder.append(listIterator.previous());
                stringBuilder.append(" ");
            }

        } else { // 앞부터 출력

            ListIterator<String> listIterator = Arrays.asList(strArr).listIterator();

            for(int i = 0; strArr.length > i; i++) {
                stringBuilder.append(listIterator.next());
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" ")).toString();

    }
}

