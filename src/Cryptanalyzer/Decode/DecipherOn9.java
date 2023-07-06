package Cryptanalyzer.Decode;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.FileWriteReade;

public class DecipherOn9 extends CaesarsCipher {
    public DecipherOn9(FileWriteReade fileWriteReade) {
        super(fileWriteReade);
    }

    @Override
    public void decode(int comeBackTo) {
        comeBackTo=9;
        super.decode(comeBackTo);
    }
}
