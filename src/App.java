import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> studentDatabase = new HashMap<String, String>();

        int input = 0;
        while (input != 5)
        {
            System.out.println("What would you like to do?");
            System.out.println("1 - Add Student \n2 - Find Student \n3 - Delete Student\n4 - Show all Students\n5 - Exit");
            input = scan.nextInt();

            if(input == 1)
            {
                System.out.println("What is their name?");
                String name = scan.nextLine();
                System.out.println("What is their ID");
                String id = scan.nextLine();
                studentDatabase.put(id, name);
            }
            else if (input == 2)
            {
                System.out.println("What is their ID");
                String id = scan.nextLine();
                for (String student : studentDatabase.keySet())
                {
                    if (student == id)
                    {
                        System.out.println(studentDatabase.get(student));
                    }
                }
            }
            else if(input == 3)
            {

            }
            else if (input == 4)
            {

            }
        }
    }
}
