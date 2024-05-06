public class NestedIfElse
{
    public static void main(String[] args) 
  {
        int num = 30;

        if (num < 50) 
        {
            System.out.println("Number is less than 50.");
            
            if (num % 2 == 0) 
            {
                System.out.println("Number is even.");
            } 
            else
            {
                System.out.println("Number is odd.");
            }
        } 
        else 
        {
            System.out.println("Number is greater than or equal to 50.");
        }
    }
}

