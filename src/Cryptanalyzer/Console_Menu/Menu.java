package Cryptanalyzer.Console_Menu;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.Decode.DecipherOn3;
import Cryptanalyzer.Decode.DecipherOn6;
import Cryptanalyzer.Decode.DecipherOn9;
import Cryptanalyzer.Encode.EncryptFileOn3;
import Cryptanalyzer.Encode.EncryptFileOn6;
import Cryptanalyzer.Encode.EncryptFileOn9;
import Cryptanalyzer.FileNotFountException;
import Cryptanalyzer.FileWriteReade;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Menu {
    private static boolean isRunning=true;

    final Scanner scanner=new Scanner(System.in);
    public void run(){
        while (isRunning){
            System.out.println(Constant.INFO_MENU);
            int itemMenu=scanner.nextInt();
            switch (itemMenu){
                case Constant.ENCODE ->new ItemEncode().itemToEncode();
                case Constant.DECODE ->new ItemDecode().itemToDecode();
                case Constant.EXIT -> itemToExit();
            }
        }
    }

    private void itemToExit(){
        isRunning=false;
    }
}

