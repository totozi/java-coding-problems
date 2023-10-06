package ch1;

public class Ex008 {

    public static void main(String[] args) {
        // 문자열에서 모든 여백 제거
        
        String input = "sfa  \n 한글     dasfsdf  영어 ";

        System.out.println(input);

        System.out.println("===================");

        String result = removeSpace(input);

        System.out.println(result);

    }

    private static String removeSpace(String param) {
        
        char[] chArr = param.toCharArray();
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < chArr.length; i++) {
            //System.out.println(chArr[i]);
            if(Character.isSpaceChar(chArr[i]) != true && (byte) chArr[i] != Character.LETTER_NUMBER) {
                builder.append(chArr[i]);
                
            }
        }

        return builder.toString();
    }
    
}
