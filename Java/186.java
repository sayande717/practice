// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/

class TestClass {
    static boolean isNumber(char input) {
        if (input>='0' && input<='9') {
            return true;
        }
        return false;
    }

    static boolean isEven(int input) {
        return (input%2)==0;
    }

    static boolean isVowel(char input) {
        final char[] listOfVowels = {'A','E','I','O','U','Y'};
        for(int index=0; index<listOfVowels.length;index++) {
            if(input == listOfVowels[index]) {
                return true;
            }
        }
        return false;
    }

    static String isValidTag(String tag) {
        String[] options = {"invalid","valid"};
        if(isVowel(tag.charAt(2))) {
            return options[0];
        }

        int index = 0;
        while(index<tag.length()-1) {
            char current = tag.charAt(index);
            char next = tag.charAt(index+1);
            if(isNumber(current) && isNumber(next)) {
                if(!isEven(current+next)){
                    return options[0];
                }
            }
            index++;
        }
        return options[1];
    }

    public static void main(String args[]) {
        System.out.println(isValidTag(args[0]));
    }
}