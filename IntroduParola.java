import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
public class IntroduParola
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Introdu o parola: ");
        String password = input.next();
        if (isValid(password)) {
            System.out.println("Parola Corecta");
        } else {
            System.out.println("Parola Incorecta");
        }
    }
    public static boolean isValid(String password) {
        if (password.length() < 9) {
            return false;
        }

        else {
            char c = 0 ;
            int  count=0;
            System.out.println(password.length());
            for (int i = 0;i<=password.length()-1; i++)
            {
                c = password.charAt(i);
                System.out.println(c);
                if (!Character.isLetterOrDigit(c))
                {
                    return false;
                }
                else if (Character.isDigit(c))
                {
                    count++;
                    if(count==3)
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }

}