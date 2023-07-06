package Cryptanalyzer.Encode;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.FileWriteReade;

public class EncryptFileOn6 extends CaesarsCipher {
    public EncryptFileOn6(FileWriteReade fileWriteReade) {
        super(fileWriteReade);
    }

    @Override
    public void encrypt(int moveOn) {
        moveOn=6;
        super.encrypt(moveOn);
    }
}
