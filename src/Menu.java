import java.nio.file.Files;
import java.nio.file.Path;
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

    private String fileRead(){
        Scanner readScanner=new Scanner(System.in);
        System.out.println("Enter the file path from which you want to read the text");
        String file=readScanner.nextLine();
        try {
            while (isRunning){
                isRunning=false;
                if(Files.exists(Path.of(file))){
                    return file;
                }
                else {
                    System.out.println("Sorry, file not found");
                }
            }
        }catch (FileNotFountException e){
            System.out.println("try again");
        }
        throw new FileNotFountException("File path could not be validated");
    }
    private String fileWrite(){
        Scanner writeScanner=new Scanner(System.in);
        System.out.println("Enter the file in which you want to write date");
        String file=writeScanner.nextLine();
        return file;
    }
}

