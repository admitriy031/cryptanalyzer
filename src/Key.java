public class Key {
    public String CaesarsCode(String text, int step) {
        String result="";
        char[] textChar = text.toCharArray();
        char[] lowCh = { 'а', 'б', 'в', 'г', 'ґ', 'д','е', 'є', 'ж',
                'з', 'и', 'і', 'ї', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я' };
        char[] upCh = { 'А', 'Б', 'В', 'Г','Ґ', 'Д', 'Е', 'Є', 'Ж',
                'З', 'И', 'І','Ї', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х',
                'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ю', 'Я' };
        for (int i=0; i<textChar.length; i++){
            int index = 0;
            boolean isNOTLetter = Character.isWhitespace(textChar[i]);
            if (!isNOTLetter){
                if (Character.isLowerCase(textChar[i])){
                    while (textChar[i] != lowCh[index]) index++;
                    index +=step;
                    if (index > 32){
                        index -= 33;
                    }
                    textChar[i] = lowCh[index];
                }else if (Character.isUpperCase(textChar[i])){
                    while (textChar[i] != upCh[index]) index++;
                    index +=step;
                    if (index > 32){
                        index -= 33;
                    }
                    textChar[i] = upCh[index];
                }
            }
        }
        for (char c:textChar) {
            result += c;
        }
        return result;
    }

}
