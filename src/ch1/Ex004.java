package ch1;

public class Ex004 {
    public static void main(String[] args) {
        
        // 숫자만 포함하는 문자열인지 검사

        String input = "123 13555";
        String nullStr = null;
        boolean result = checkIfNumString(input);

        System.out.println(result);

    }

    private static boolean checkIfNumString(String input) {
        
        // 1. 문자열의 null 체크 및 길이 검사
        if(input == null || input.length() == 0) {
            return false;
        }

        // 2. 각 문자 값 검사
        for(char ch : input.toCharArray()) {
            if(ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }
}
