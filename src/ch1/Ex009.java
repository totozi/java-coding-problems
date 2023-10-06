public class Ex009 {

    public static void main(String[] args) {
        // 문자열을 구분자로 합치기
        String str1 = "1234";
        String str2 = "abcd";
        String str3 = "가나다";
        char delimter = ',';

        String[] strArr = {str1, str2, str3};

        String answer = "";

        answer = concatStringsWithChar(strArr, delimter);

        System.out.println(answer);
    }

    private static String concatStringsWithChar(String[] arr, char delimter) {
        StringBuilder builder = new StringBuilder();

        for (String string : arr) {
            builder.append(string);
            builder.append(delimter);
        }

        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }
    
}
