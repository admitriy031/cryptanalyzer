package Cryptanalyzer;

public class CaesarsCipher {
    private final FileWriteReade fileWriteReade;
    private char[] lowCh = { 'а', 'б', 'в', 'г', 'ґ', 'д','е', 'є', 'ж',
            'з', 'и', 'і', 'ї', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
            'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я' };
    private char[] upCh = { 'А', 'Б', 'В', 'Г','Ґ', 'Д', 'Е', 'Є', 'Ж',
            'З', 'И', 'І','Ї', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х',
            'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ю', 'Я' };
    public CaesarsCipher(FileWriteReade fileWriteReade) {
        this.fileWriteReade=fileWriteReade;
    }
    public void encrypt(int moveOn){
        char[] chars = fileWriteReade.bytesToChars();

        for (int i=0; i<chars.length; i++){
            int index = 0;
            boolean isNOTLetter = Character.isWhitespace(chars[i]);
            if (!isNOTLetter){
                if (Character.isLowerCase(chars[i])){
                    while (chars[i] != lowCh[index]) index++;
                    index +=moveOn;
                    if (index > 32){
                        index -= 33;
                    }
                    chars[i] = lowCh[index];
                }else if (Character.isUpperCase(chars[i])){
                    while (chars[i] != upCh[index]) index++;
                    index +=moveOn;
                    if (index > 32){
                        index -= 33;
                    }
                    chars[i] = upCh[index];
                }
            }
        }
        byte[] encryptedBytes = fileWriteReade.charsToBytes(chars);
        fileWriteReade.writeFile(encryptedBytes);

    }
    public void decode(int comeBackTo){
        char[] chars = fileWriteReade.bytesToChars();

        for (int i=0; i<chars.length; i++){
            int index = 0;
            boolean isNOTLetter = Character.isWhitespace(chars[i]);
            if (!isNOTLetter){
                if (Character.isLowerCase(chars[i])){
                    while (chars[i] != lowCh[index]) index++;
                    index -=comeBackTo;
                    if (index < 0){
                        index += 33;
                    }
                    chars[i] = lowCh[index];
                }else if (Character.isUpperCase(chars[i])){
                    while (chars[i] != upCh[index]) index++;
                    index -=comeBackTo;
                    if (index < 0){
                        index += 33;
                    }
                    chars[i] = upCh[index];
                }
            }
        }
        byte[] decipherBytes = fileWriteReade.charsToBytes(chars);
        fileWriteReade.writeFile(decipherBytes);
    }
    public void bruteForce(){

    }
}
