package ch16.generic2;

public class Plastic implements Material{
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrint() {
        System.out.println("plastic 재료이므로 출력할 수 있습니다.");
    }
}
