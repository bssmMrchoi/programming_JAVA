package ch16.generic2;

public class GenericExam {
    public static void main(String[] args) {
        ThreeDPrinterGeneric<Powder> powderPrinter = new ThreeDPrinterGeneric<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);

        ThreeDPrinterGeneric<Plastic> plasticPrinter = new ThreeDPrinterGeneric<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);

        //Water를 사용하지 못한다.
        //ThreeDPrinterGeneric<Water> printer = new ThreeDPrinterGeneric<>();
    }

}
