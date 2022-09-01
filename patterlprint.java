package pattern.java;

public class patternL{
public static void main(String[] args)
{
int n =5;

  // Print i rows of stars

    for (int i=1; i<=n; i++)
    {
    	 // Printing Column of Stars
        for (int j=1; j<=i; j++)
        {
    
            if( j == 1 || j == 0 || i == n)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
}






