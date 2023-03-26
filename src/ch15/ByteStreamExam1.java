package ch15;

import java.io.IOException;
import java.io.InputStream;

//바이트 단위 입력
public class ByteStreamExam1 {
    public static void main(String[] args) {
        //System.in 자체가 inputstream
        InputStream is = System.in;
        byte[] b = new byte[1024];
        int len = 0;
        try {
            len = is.read(b);
            //byte출력시 사용하는 write함수, 아스키코드 입력 -> 문자 출력
            System.out.write(b, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
