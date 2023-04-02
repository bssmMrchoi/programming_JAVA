package ch16.generic2;

public class Powder implements Material{
    @Override
    public String toString() {
        return "재료는 Powder 입니다.";
    }

    @Override
    public void doPrint() {
        System.out.println("powder 재료이므로 출력할 수 있습니다.");
    }
}
