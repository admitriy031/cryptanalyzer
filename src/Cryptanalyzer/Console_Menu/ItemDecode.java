package Cryptanalyzer.Console_Menu;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.Decode.DecipherOn3;
import Cryptanalyzer.Decode.DecipherOn6;
import Cryptanalyzer.Decode.DecipherOn9;
import Cryptanalyzer.FileWriteReade;

import java.util.Scanner;

public class ItemDecode {
    public void itemToDecode(){
        System.out.println(Constant.INFO_ITEM_TO_DECODE);
        Scanner decodeScanner=new Scanner(System.in);
        int choiceDecoding=decodeScanner.nextInt();
        switch (choiceDecoding){
            case Constant.COME_BACK_TO3 -> decipherOn3();
            case Constant.COME_BACK_TO6 -> decipherOn6();
            case Constant.COME_BACK_TO9 -> decipherOn9();
            case Constant.BRUTE_FORCE -> bruteForce();
        }
    }
    private void decipherOn3(){
        DecipherOn3 decipherOn3=new DecipherOn3(new FileWriteReade(FilePath.filePathRead(), FilePath.filePathWrite()));
        decipherOn3.decode(3);
    }
    private void decipherOn6(){
        DecipherOn6 decipherOn6=new DecipherOn6(new FileWriteReade(FilePath.filePathRead(),FilePath.filePathWrite()));
        decipherOn6.decode(6);
    }
    private void decipherOn9(){
        DecipherOn9 decipherOn9=new DecipherOn9((new FileWriteReade(FilePath.filePathRead(),FilePath.filePathWrite())));
        decipherOn9.decode(9);
    }
    private void bruteForce(){
        CaesarsCipher decipherBruteForce=new CaesarsCipher(new FileWriteReade(FilePath.filePathRead(), FilePath.filePathWrite()));
        decipherBruteForce.bruteForce();
    }
}
