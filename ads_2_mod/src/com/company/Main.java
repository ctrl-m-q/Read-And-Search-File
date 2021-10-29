package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static ArrayList<String> ReadFile(String file) {
        ArrayList<String> array = new ArrayList<String>();
        try(FileInputStream fis = new FileInputStream(file);
            InputStreamReader isreader = new InputStreamReader(fis);
            BufferedReader bread = new BufferedReader(isreader)){
            String line = bread.readLine();
            while (line != null){
                array.add(line);
                line = bread.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("Enter name of file");
        Scanner s = new Scanner(System.in);
        ArrayList<String> file = ReadFile(s.nextLine());
        try {
            Pattern pattern = Pattern.compile("^(\\+|-)?[0-9]+$");
            Matcher m;
            for (int i = 0; i < file.size(); i++) {
                m = pattern.matcher(file.get(i));
                if (m.find()) {
                    System.out.println("Integers exist in this line");
                } else {
                    System.out.println("no integers in this line");
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
