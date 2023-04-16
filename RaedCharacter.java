 // Java program to read character using Scanner class

 import java.util.Scanner;

 public class RaedCharacter
{
    public static void main(String[] args)
    {
        //Declare the object and initilize with
        Scanner sc = new Scanner(System.in);
                    //character input
        System.out.println("Please Enter the Character ");
        char ch = sc.next().charAt(0);
            //print the read value
        System.out.println("char = "+ch);
    }
}
