package Cryptanalyzer.Console_Menu;

import Cryptanalyzer.FileNotFountException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilePath {
    private static boolean isRunning=true;

    public static String filePathRead(){
        Scanner readScanner=new Scanner(System.in);
        System.out.println("Enter the file path from which you want to read the text");
        String file=readScanner.nextLine();
        try {
            while (isRunning){
                isRunning=false;
                if(Files.exists(Path.of(file))){
                    return file;
                }
                else {
                    System.out.println("Sorry, file not found");
                }
            }
        }catch (FileNotFountException e){
            System.out.println("try again");
        }
        throw new FileNotFountException("File path could not be validated");
    }
    public static String filePathWrite(){
        Scanner writeScanner=new Scanner(System.in);
        System.out.println("Enter the file in which you want to write date");
        String file=writeScanner.nextLine();
        return file;
    }
}
