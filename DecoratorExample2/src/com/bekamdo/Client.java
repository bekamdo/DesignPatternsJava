package com.bekamdo;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Ben Kamau aaaaaBBBBdddd");
        byte[] bytes = stringBuffer.toString().getBytes();
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) > 0) {
                System.out.println((char) c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
