package ch1;


public class Ex005 {
    
    public static void main(String[] args) {
        // 모음과 자음 개수 세기(영어)
        // 모음 : a, e, i ,o ,u
        
        String input = "abc edfr eqld";
        int cntOfConsonants = 0;
        int cntOfVowels     = 0;

        cntOfConsonants = getCntOfAlphabet(input, 'C');
        cntOfVowels     = getCntOfAlphabet(input, 'V');

        System.out.println(cntOfConsonants);
        System.out.println(cntOfVowels);

    }



    private static int getCntOfAlphabet(String input, char delimter) {
      
        final char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();
        final char[] vowels     = "aeiou".toCharArray();    

        int result = 0;
        
        if(delimter == 'C') {
            for(char ch : input.toCharArray()) {
                if(checkStrContainsChar(ch, consonants)) {
                    result++;
                }
            }
        } else if (delimter == 'V') {
            for(char ch : input.toCharArray()) {
                if(checkStrContainsChar(ch, vowels)) {
                    result++;
                }
            }
        }
        
        return result;
    }

    private static boolean checkStrContainsChar(char ch, char[] chArr) {
        for(char obj : chArr) {
            if(obj == ch) {
                return true;
            }
        }

        return false;
    }



}
