package variable;

public class Var2 {
    public static void main(String[] args) {
        int a;    //변수 선언 - 정수 타입
        //" = " 는 오른쪽 값을 왼쪽에 대입한다는 뜻 (값 저장)
        a = 20; //변수 초기화  - 선언한 변수에 처음으로 값을 대입하여 저장하는 것


        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        //변수선언방법
        int b, c, d, e;

        //변수 선언 초기화 한번에
        int f = 1;
        System.out.println(f);

        //변수는 꼭 초기화를 해야함 안하면 컴파일 오류 발생함 -> 지역변수의 경우! ( 인스턴스 변수, 클래스변수는 직접 초기화할 필요 없고 자바가 초기화해줌)
        

    }
}
