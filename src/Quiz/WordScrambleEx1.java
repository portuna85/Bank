package Quiz;

import java.util.Arrays;

public class WordScrambleEx1 {

    public static void main(String[] args) {

        String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};

        String answer = null;

        try {

            answer = getAnswer(strArr);
            System.out.println("Answer:" + answer);

            for (int i = 0; i < 10; i++) {
                String question = getScrambledWord(answer);
                System.out.println("Question:" + question);
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("접근할 수 없는 배열에 접근 했습니다.");
            e.printStackTrace();

        } catch (Exception e) {

            System.out.println("아래와 같은 오류가 발생 했습니다.");
            System.out.println(e.getMessage());

        }
    } // main

    public static int getLessThanArrayLength(int length) {

        int v;

        do {
            double random = Math.random();
            v = (int) (random * 10);
        } while (v >= length);

        return v;
    }

    public static String getAnswer(String[] strArr) throws Exception{

        int lessThanArrayLength = getLessThanArrayLength(strArr.length);
        return strArr[lessThanArrayLength];

    }

    public static String getScrambledWord(String str) {

        int escapeCount = 0;
        int originStringCount = str.length();

        String[] originStringArray = str.split("");
        String[] resultStringArray = new String[originStringCount];

        while (escapeCount < originStringCount) {

            String temp;

            if (resultStringArray[escapeCount] == null) {

                int count = getLessThanArrayLength(originStringCount);
                temp = originStringArray[count];

                if (temp != null) {
                    originStringArray[count] = null;
                    resultStringArray[escapeCount] = temp;
                    escapeCount++;
                }
            }
        }

        String arrayToString = createArrayToString(resultStringArray);

        return arrayToString;

    } // scramble(String str)

    private static String createArrayToString(String[] resultStringArray) {

        String result = "";

        for (String s : resultStringArray) {
            result += s;
        }

        return result;
    }
}
