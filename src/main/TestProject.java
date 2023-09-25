package main;

import java.io.Console;
import java.util.Base64;
import java.util.Scanner;
import model.Extension;

public class TestProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi từ bàn phím: ");
        String originalString = scanner.nextLine();

        // Mã hoá chuỗi thành mảng byte
        byte[] encodedBytes = Extension.encodeToByte(originalString);

        // Mã hoá chuỗi thành chuỗi đã được mã hoá
        String encodedString = Extension.encodeToString(originalString);

        // Giải mã chuỗi từ chuỗi đã được mã hoá
        String decodedString = Extension.decodeToString(encodedString);

        // Giải mã mảng byte thành chuỗi
        String decodedBytes = Extension.decodeToByte(encodedBytes);

        System.out.println("Original String: " + originalString);
        System.out.println("Encoded Bytes: " + encodedBytes);
        System.out.println("Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decodedString);
        System.out.println("Decoded Bytes: " + decodedBytes);
    }

}
