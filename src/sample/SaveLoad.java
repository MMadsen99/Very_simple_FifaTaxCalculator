package sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SaveLoad {
    static int loadSum;
    public void save() throws IOException {
        Controller controller = new Controller();

        java.io.File file = new java.io.File("src/saveFile.txt");
        try{
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.println(controller.sum);

            output.close();
            System.out.println("The file has been saved");
        }catch (Exception e ){
            System.out.println("Something went wrong");
        }

    }
    public void load() throws FileNotFoundException {
       Controller controller = new Controller();
        java.io.File file = new java.io.File("src/saveFile.txt");
        try{
            Scanner input = new Scanner(file);
            loadSum = input.nextInt();
            System.out.println(loadSum);

            input.close();

        }catch (Exception e ){
            System.out.println("Something went wrong");
        }
    }
}
