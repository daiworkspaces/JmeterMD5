package MD5Client;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Pmd5 {

    public String MD5(String s) throws UnsupportedEncodingException {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes =md.digest(s.getBytes("utf-8"));
            return toHex(bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String toHex(byte[] bytes) {
        final char[] HEX_DIGITS="0123456789ABCDEF".toCharArray();
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i=0;i<bytes.length;i++){
            ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }
        return ret.toString().toUpperCase();
    }

}
