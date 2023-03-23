package ch15.dotcom.simple;

public class simpleDatComTest {
    public static void main(String[] args) {
//        1. SimpleDotCom 클래스의 인스턴스 만들기
        SimpleDotCom dot = new SimpleDotCom();

//        2. 위치 대입하기
        int[] locations = {2, 3, 4};
        //dot.setLocationCells(locations);

//        3. 사용자가 추측한 위치를 나타내는 String 변수 선언
        String guess = "2";

//        4. 3단계에서 만든 변수 전달 : checkYourself()
        String testResult = dot.checkYourself(guess);

//        5. 결과 출력 (true / false)
        if (testResult.equals("hit")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
