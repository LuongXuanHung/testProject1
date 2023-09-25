package model;

import java.util.Base64;
import org.w3c.dom.Text;

public class Extension {

//    private String encodeToBytes;
//    private String encodeToString;
//    private String decodeToString;
//    private byte[] decodeToBytes;
//    private String password;

    public static byte[] encodeToByte(String password) {
        // Mã hoá chuỗi thành mảng byte
        return password.getBytes();
    }

    public static String encodeToString(String password) {
        // Mã hoá chuỗi thành chuỗi đã được mã hoá
        byte[] bytes = password.getBytes();
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String decodeToString(String password) {
        // Giải mã chuỗi từ chuỗi đã được mã hoá
        byte[] bytes = Base64.getDecoder().decode(password);
        return new String(bytes);
    }

    public static String decodeToByte(byte[] password) {
        // Giải mã mảng byte thành chuỗi
        return new String(password);
    }
}
