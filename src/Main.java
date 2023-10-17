import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {

        System.out.println("Welcome to Student DataBase\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("Enter 1 to insert data.");
            System.out.println("Enter 2 to display data.");
            System.out.println("Enter 3 to delete data.");
            System.out.println("Enter 4 to exit.");
            System.out.print("Enter your choice : ");
            int ch = Integer.parseInt(br.readLine());

            if(1 == ch) {
                // insert data
            }
            else if (2 == ch) {
                // display data
            }
            else if(3 == ch) {
                // delete data
            }
            else if (4 == ch){
                // exit
                break;
            }
            else {
                System.out.println("Please enter right choice.");
            }

        }
    }
}
