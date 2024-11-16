package mycustompackage;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    boolean doProb1 = false;
    boolean doProb2 = false;
    boolean doProb3 = true;

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

    if (doProb3)
    {
      System.out.println("Enter two strings: ");
      String yourWord3 = new String();
      String yourTarget3 = new String();
      yourWord3 = sc.nextLine();
      yourTarget3 = sc.nextLine();
      System.out.println(deleteSub(yourWord3, yourTarget3));
    }
  } 


  public static int countSub(String word, String target)
  {
    word = word.toLowerCase();
    target = target.toLowerCase();
    int theCounter = 0;
    int targetLength = target.length();
    for (int i = 0; i <= word.length()-targetLength; i++)
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
    word2 = word2.toLowerCase();
    target2 = target2.toLowerCase();
    int theCounter2 = 0;
    int targetLength2 = target2.length();
    for (int i = 0; i <= word2.length()-targetLength2; i++)
    {
      if (target2.equals(word2.substring(i,i+targetLength2)))
      {
        //Case 0: Exceptions at the start or end
        if (((i == 0) && !(word2.substring(i+targetLength2, i+targetLength2+1).equals(" "))) || ((i + targetLength2 == word2.length()) && !(word2.substring(i-1, i).equals(" "))))
        {
          theCounter2 +=0;
        }
        else
        {
        //Case 1: At the start
        if ((i==0) && (word2.substring(i+targetLength2, i+targetLength2+1).equals(" ")))
        {
          theCounter2++;  
        }
        //Case 2: At the end
        else if ((i + targetLength2 == word2.length()) && (word2.substring(i-1, i).equals(" ")))
        {
          theCounter2++;
        }
        //Case 3: In the middle
        else if ((word2.substring(i-1, i).equals(" ")) && word2.substring(i+targetLength2, i +targetLength2+1).equals(" "))
        {
          theCounter2++;
        }  
      }
      }
    }
    return theCounter2;
  }

  public static String deleteSub(String word3, String target3)
  {
    word3 = word3.toLowerCase();
    target3 = target3.toLowerCase();
    String word4 = new String();
    int targetLength3 = target3.length();
    for (int i = 0; i < word3.length(); i++)
    {
      if (i + targetLength3 <= word3.length())
      {
        if(target3.equals(word3.substring(i, i+targetLength3)))
        {
          i += targetLength3-1;
        }
        else
        {
          word4 += word3.substring(i, i+1);
        }
      }
      if (i + targetLength3 > word3.length())
      {
        word4 += word3.substring(i,i+1);
      }
    }
    return word4;
  }
}