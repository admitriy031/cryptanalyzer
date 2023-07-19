package Cryptanalyzer.Console_Menu;

import Cryptanalyzer.Encode.EncryptFileOn3;
import Cryptanalyzer.Encode.EncryptFileOn6;
import Cryptanalyzer.Encode.EncryptFileOn9;
import Cryptanalyzer.FileWriteReade;

import java.util.Scanner;

public class ItemEncode {
    public void itemToEncode(){
        System.out.println(Constant.INFO_ITEM_TO_ENCODE);
        Scanner encodeScanner=new Scanner(System.in);
        int choiceEncoding=encodeScanner.nextInt();
        switch (choiceEncoding){
            case Constant.MOVE_ON_3->encryptFileOn3();
            case Constant.MOVE_ON_6->encryptFileOn6();
            case Constant.MOVE_ON_9->encryptFileOn9();
        }
    }
    private void encryptFileOn3(){
        EncryptFileOn3 encryptFileON3=new EncryptFileOn3(new FileWriteReade(FilePath.filePathRead(),FilePath.filePathWrite()));
        encryptFileON3.encrypt(3);
    }
    private void encryptFileOn6(){
        EncryptFileOn6 encryptFileOn6=new EncryptFileOn6(new FileWriteReade(FilePath.filePathRead(),FilePath.filePathWrite()));
        encryptFileOn6.encrypt(6);
    }
    private void encryptFileOn9(){
        EncryptFileOn9 encryptFileOn9=new EncryptFileOn9((new FileWriteReade(FilePath.filePathRead(),FilePath.filePathWrite())));
        encryptFileOn9.encrypt(9);
    }
}
