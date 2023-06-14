import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file=new File("D:\\cryptanalyzer\\transcript.txt");
        System.out.println("Введіть шлях до файлу");
        try(Scanner scanner=new Scanner(System.in);
            FileReader fileReader=new FileReader(scanner.nextLine());
            FileWriter fileWriter=new FileWriter(file)){
            int c;
            while((c=fileReader.read())!=-1){
                fileWriter.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}