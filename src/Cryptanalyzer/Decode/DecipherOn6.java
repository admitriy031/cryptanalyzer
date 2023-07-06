package Cryptanalyzer.Decode;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.FileWriteReade;

public class DecipherOn6 extends CaesarsCipher {
    public DecipherOn6(FileWriteReade fileWriteReade) {
        super(fileWriteReade);
    }

    @Override
    public void decode(int comeBackTo) {
        comeBackTo=6;
        super.decode(comeBackTo);
    }
}
