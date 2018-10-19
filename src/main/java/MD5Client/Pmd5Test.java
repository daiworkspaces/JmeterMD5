package MD5Client;

import java.io.UnsupportedEncodingException;

public class Pmd5Test {


    public static void main(String[] args) throws UnsupportedEncodingException {
        Pmd5 aa = new Pmd5();
        String mes = "123456";
        String s = aa.MD5(mes);
        System.out.println(s);
    }


}

