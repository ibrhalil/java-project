package com.ibrhalil;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static boolean metot(int value) {
        char[] array = new char[value];
        Arrays.fill(array, '\n');
        String str = new String(array);
        return true;
    }

    public static void main(String[] args) {
        int intMax = Integer.MAX_VALUE;
        int max = 0;
        int k = 1;

        for (int i = intMax - k; i > 1; i--) {
            boolean lock = false;
            try {
                lock = metot(i);
                for (int j = i; j < max; j++) {

                   /* FileWriter output = new FileWriter("/Users/halil/dev/ideaProjeler/java-project/java-se/java-11-string/java-string-max-size/src/main/java/com/ibrhalil/testFile.txt");
                    output.write(str);
                    output.close();
                    */
                    System.out.println(j);
                }
                
                break;
            } catch (Throwable t) {
                if (!lock) {
                    k *= 10;
                    i = intMax - k;
                    max = intMax - (k/10) ;
                } else {
                    k /= 10;
                }
                
            }

        }



       /* do {
            for (int i = min; i < max; i++) {
                try {
                    char[] array = new char[min];
                    str = new String(array);
                    System.out.println("str.length(): ".concat(String.valueOf(str.length())));
                    start = false;
                } catch (Throwable t) {
                    //System.out.println("new char[".concat(String.valueOf(min)).concat("] : ".concat(t.getMessage())));
                    min = max - k;
                    k *= 10;
                }
                System.out.println("ttttttt");
            }


        } while (start);

        */

    }
}