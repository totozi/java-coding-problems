package ch1;

public class Ex006 {
    
    public static void main(String[] args) {
        // 주어진 문자열에서 특정 문자의 빈도수를 세는 프로그램을 작성하라.

        String input = "abcazbczabczab c zz dd e tt";

        char ch = 'z';
        int cnt = 0;

        cnt = cntOfCharInString(input, ch);

        System.out.println(cnt);

    }

    private static int cntOfCharInString(String str, char paramCh) {
        int result = 0;

        for(char ch : str.toCharArray()) {
            if(paramCh == ch) {
                result++;
            }
        }

        return result;
    }
}
