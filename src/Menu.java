import java.util.Scanner;

public class Menu {
    private static final int ENCODE=1;
    private static final int DECODE=2;
    private static final int EXIT=0;
    private static final String INFO_MENU= """
                    1. Encode
                    2. Decode
                    0. Exit
                    """;
    private static final String INFO_ITEM_TO_ENCODE= """
            1. shift 3 to the right
            2. shift 6 to right
            3. shift 9  to right
            """;
    private static boolean isRunning=true;
    final Scanner scanner=new Scanner(System.in);
    public void run(){
        while (isRunning){
            System.out.println(INFO_MENU);
            int itemMenu=scanner.nextInt();
            switch (itemMenu){
                case ENCODE ->itemToENCODE();
                case DECODE -> itemToDecode();
                case EXIT -> itemToExit();
            }
        }
    }
    private void itemToENCODE(){
        System.out.println(INFO_ITEM_TO_ENCODE);
        Scanner encodeScanner=new Scanner(System.in);
        int choiceEncoding=encodeScanner.nextInt();
        switch (choiceEncoding){

        }
    }
    private void itemToDecode(){

    }
    private void itemToExit(){
        isRunning=false;
    }
}
