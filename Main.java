package mycustompackage;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    boolean doProb1 = false;
    boolean doProb2 = true;

    if (doProb1)
    {
      System.out.println("Enter two strings: ");
      String yourWord = new String();
      String yourTarget = new String();
      yourWord = sc.nextLine();
      yourTarget = sc.nextLine();
      System.out.println("The substring " + yourTarget + " appears in " + yourWord + " " + countSub(yourWord, yourTarget) + " time(s).");
    }

    if (doProb2)
    {
      System.out.println("Enter two strings: ");
      String yourWord2 = new String();
      String yourTarget2 = new String();
      yourWord2 = sc.nextLine();
      yourTarget2 = sc.nextLine();
      System.out.println("The substring " + yourTarget2 + " is being properly contained " + countProperContains(yourWord2, yourTarget2) + " times");
    }
  }

  public static int countSub(String word, String target)
  {
    word.toLowerCase();
    target.toLowerCase();
    int theCounter = 0;
    int targetLength = target.length();
    for (int i = 0; i < word.length()-targetLength+1; i++)
    {
      if (target.equals(word.substring(i,i+targetLength)))
      {
        theCounter++;
      }
    }
    return theCounter;
  }

  public static int countProperContains(String word2, String target2)
  {
    word2.toLowerCase();
    target2.toLowerCase();
    int theCounter2 = 0;
    int targetLength2 = target2.length();
    for (int i = 0; i < word2.length()-targetLength2+1; i++)
    {
      if (target2.equals(word2.substring(i,i+targetLength2)))
      {
        if ( (i == 0))
        {
          if (word2.substring(i+1,i+2).equals(" "))
          {
            theCounter2++;
          }
        }
        if ((i == word2.length()-1))
        {
          if (word2.substring(i-1,i).equals(" "))
          {
            theCounter2++;
          }
        }
        if ((i != 0 ) && (i != word2.length()-1))
        {
          if ((word2.substring(i-1, i).equals(" ")) && (word2.substring(i+1, i+2).equals(" ")))
            {
              theCounter2++;
            }
        }
      }
    }
    return theCounter2;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
