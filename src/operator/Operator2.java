package operator;

public class Operator2 {
    public static void main(String[] args) {

        //문자열과 숫자 더하면 문자열 됨! (문자열에 더하는것은 다 문자열 되어버림)

        //문자열 비교시에는 == 보다 equals() 메서드 사용하기
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // str1과 str2 비교
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are the same.");
        } else {
            System.out.println("str1 and str2 are different.");
        }

        // str1과 str3 비교
        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are the same.");
        } else {
            System.out.println("str1 and str3 are different.");
        }

        //문자열 비교
//        boolean result1 = "hello".equals("hello"); //리터럴 비교
//        boolean result2 = str1.equals("문자열1");//문자열 변수, 리터럴 비교
//        boolean result3 = str1.equals(str2);//문자열 변수 비교


    }
}
