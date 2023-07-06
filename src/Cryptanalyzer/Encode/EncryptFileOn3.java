package Cryptanalyzer.Encode;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.FileWriteReade;

public class EncryptFileOn3 extends CaesarsCipher {
    public EncryptFileOn3(FileWriteReade fileWriteReade) {
        super(fileWriteReade);
    }

    @Override
    public void encrypt(int moveOn3) {
        moveOn3=3;
        super.encrypt(moveOn3);
    }


}
