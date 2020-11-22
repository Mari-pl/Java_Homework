package ru.geekbrains_java1_lesson_online;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileWorks {
    private static final Random rnd = new Random();
    private static final int CHAR_BOUND_L = 70;
    private static final int CHAR_BOUND_H = 80;
    private static final int WORDS_AMOUNT = 5;
    private static final int WORD_LENGTH = 10;
    private static final int FILES_AMOUNT = 3;

    public static void main(String[] args) {
        String[] fileNames = new String[FILES_AMOUNT];
        for (int i = 0; i < fileNames.length; i++)
            fileNames[i] = "file_" + i + ".txt";

    }

   try {
       for (int i = 0; i < fileNames.length; i++)
           if (i < 2)
               writeFileContents(fileNames[i], 100);
           else
               writeFileContents(fileNames[i], WORDS_AMOUNT, WORD_LENGTH);
       System.out.println("Выводит результат в файл1 и файл2");

       concatenate(fileNames[1], fileNames[2], "file_out.txt");
       System.out.println("Записываем результат в file_out");
    }

   private static void writeFileContents(String fileName, int length) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(generateSymbols(length).getBytes());
        fos.flush();
        fos.close();
    }

    private static String generateSymbols(int amount) {
    StringBuilder sequence  = new StringBuilder();
    for (int i = 0; i < amount; i++ )
        sequence.append((char) (CHAR_BOUND_L + rnd.nextInt(CHAR_BOUND_H - CHAR_BOUND_L)));
    return sequence.toString();
    }

   private static void concatenate (String file_in1, String file_in2, String file_out) throws IOException {
       FileOutputStream fos = new FileOutputStream(file_out);
       int ch;
       FileInputStream fis = new FileInputStream(file_in1);
       while ((ch = fis.read()) != -1)
           fos.write(ch);
       fis.close();

       fis = new FileInputStream(file_in2);
       while ((ch = fis.read()) != -1)
           fos.write(ch);
       fis.close();

       fos.flush();
       fos.close();
   }


}
