package Cryptanalyzer.Console_Menu;

public class Constant {
    public static final int ENCODE=1;
    public static final int DECODE=2;
    public static final int EXIT=0;
    public static final int MOVE_ON_3=3;
    public static final int MOVE_ON_6=4;
    public static final int MOVE_ON_9=5;
    public static final int COME_BACK_TO3=6;
    public static final int COME_BACK_TO6=7;
    public static final int COME_BACK_TO9=8;
    public static final int BRUTE_FORCE=9;
    public static final String INFO_MENU= """
                    1. Encode
                    2. Decode
                    0. Exit
                    """;
    public static final String INFO_ITEM_TO_ENCODE= """
            3. shift 3 to the right
            4. shift 6 to right
            5. shift 9 to right
            """;
    public static final String INFO_ITEM_TO_DECODE= """
            6. shift 3 to the left
            7. shift 6 to the left
            8. shift 9 to the left
            9. Brute force
            """;
}
