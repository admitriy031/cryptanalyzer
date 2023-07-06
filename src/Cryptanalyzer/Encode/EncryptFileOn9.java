package Cryptanalyzer.Encode;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.FileWriteReade;

public class EncryptFileOn9 extends CaesarsCipher {
    public EncryptFileOn9(FileWriteReade fileWriteReade) {
        super(fileWriteReade);
    }
    @Override
    public void encrypt(int moveOn) {
        moveOn=9;
        super.encrypt(moveOn);
    }
}
