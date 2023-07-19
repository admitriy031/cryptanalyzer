package Cryptanalyzer.Decode;

import Cryptanalyzer.CaesarsCipher;
import Cryptanalyzer.FileWriteReade;

public class DecipherOn3 extends CaesarsCipher {

    public DecipherOn3(FileWriteReade fileWriteReade) {
        super(fileWriteReade);

    }
    @Override
    public void decode(int comeBackTo) {
        comeBackTo=3;
        super.decode(comeBackTo);
    }
}
