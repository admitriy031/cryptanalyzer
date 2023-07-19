package Cryptanalyzer;

import Cryptanalyzer.Decode.DecipherOn3;
import Cryptanalyzer.Decode.DecipherOn6;
import Cryptanalyzer.Decode.DecipherOn9;
import Cryptanalyzer.Encode.EncryptFileOn3;
import Cryptanalyzer.Encode.EncryptFileOn6;
import Cryptanalyzer.Encode.EncryptFileOn9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Menu {
    private static final int ENCODE=1;
    private static final int DECODE=2;
    private static final int EXIT=0;
    private static final int MOVE_ON_3=3;
    private static final int MOVE_ON_6=4;
    private static final int MOVE_ON_9=5;
    private static final int COME_BACK_TO3=6;
    private static final int COME_BACK_TO6=7;
    private static final int COME_BACK_TO9=8;
    private static final int BRUTE_FORCE=9;
    private static final String INFO_MENU= """
                    1. Encode
                    2. Decode
                    0. Exit
                    """;
    private static final String INFO_ITEM_TO_ENCODE= """
            3. shift 3 to the right
            4. shift 6 to right
            5. shift 9  to right
            """;
    private static final String INFO_ITEM_TO_DECODE= """
            6. shift 3 to the left
            7. shift 6 to the left
            8. shift 9 to the left
            9. Brute force
            """;
    private static boolean isRunning=true;
    final Scanner scanner=new Scanner(System.in);
    public void run(){
        while (isRunning){
            System.out.println(INFO_MENU);
            int itemMenu=scanner.nextInt();
            switch (itemMenu){
                case ENCODE ->itemToENCODE();
                case DECODE -> itemToDecode();
                case EXIT -> itemToExit();
            }
        }
    }

    private void itemToENCODE(){
        System.out.println(INFO_ITEM_TO_ENCODE);
        Scanner encodeScanner=new Scanner(System.in);
        int choiceEncoding=encodeScanner.nextInt();
        switch (choiceEncoding){
            case MOVE_ON_3->encryptFileOn3();
            case MOVE_ON_6->encryptFileOn6();
            case MOVE_ON_9->encryptFileOn9();
        }
    }
    private void encryptFileOn3(){
        EncryptFileOn3 encryptFileON3=new EncryptFileOn3(new FileWriteReade(filePathRead(),filePathWrite()));
        encryptFileON3.encrypt(3);
    }
    private void encryptFileOn6(){
        EncryptFileOn6 encryptFileOn6=new EncryptFileOn6(new FileWriteReade(filePathRead(),filePathWrite()));
        encryptFileOn6.encrypt(6);
    }
    private void encryptFileOn9(){
        EncryptFileOn9 encryptFileOn9=new EncryptFileOn9((new FileWriteReade(filePathRead(),filePathWrite())));
        encryptFileOn9.encrypt(9);
    }


    private void itemToDecode(){
        System.out.println(INFO_ITEM_TO_DECODE);
        Scanner decodeScanner=new Scanner(System.in);
        int choiceDecoding=decodeScanner.nextInt();
        switch (choiceDecoding){
            case COME_BACK_TO3 -> decipherOn3();
            case COME_BACK_TO6 -> decipherOn6();
            case COME_BACK_TO9 -> decipherOn9();
            case BRUTE_FORCE -> bruteForce();
        }
    }
    private void decipherOn3(){
        DecipherOn3 decipherOn3=new DecipherOn3(new FileWriteReade(filePathRead(),filePathWrite()));
        decipherOn3.decode(3);
    }
    private void decipherOn6(){
        DecipherOn6 decipherOn6=new DecipherOn6(new FileWriteReade(filePathRead(),filePathWrite()));
        decipherOn6.decode(6);
    }
    private void decipherOn9(){
        DecipherOn9 decipherOn9=new DecipherOn9((new FileWriteReade(filePathRead(),filePathWrite())));
        decipherOn9.decode(9);
    }
    private void bruteForce(){
        CaesarsCipher decipheBruteForce=new CaesarsCipher(new FileWriteReade(filePathRead(), filePathWrite()));
        decipheBruteForce.bruteForce();
    }

    private void itemToExit(){
        isRunning=false;
    }

    private String filePathRead(){
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
    private String filePathWrite(){
        Scanner writeScanner=new Scanner(System.in);
        System.out.println("Enter the file in which you want to write date");
        String file=writeScanner.nextLine();
        return file;
    }
}

