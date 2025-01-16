import java.util.Scanner;

class Encrypt {
  //method for encrypting:
  public static String encrypt(String m)
  {
    //declares variables and gives them value
    int z = 10;
    
    String done = "";
   //loop for encryption
    for (int i = 0; i< m.length(); i++)
      {
        //if statement for value of z. Value of z changes making encryption had to crack 
        if (z > 3)
        {
      z = z-1;
          }
        else
        {
          z = z +i ;
        }
        char  letter = m.charAt(i);
        int ascii= (int)letter;
        int coded = ascii - 3 +z ; //Where the encryption takes place
        char newLetter;
        int q = 0;
        int r;
        int b,l;
        if (coded > 126) //if number is over 126, start at 32 and add remaining numbers. This code is necessary to make sure there are no boxes in the textbox as avery number over 126 is a box
        {
         r = (z-3);
         b =  coded - 126;
         l = r-b ;
          q = 32+l;
        }
         else //if not continue with code
        { 
        q = coded;
        }
          newLetter = (char)q;
        done = done + newLetter;
      }
    //reverses encrption
     String name = done;
    String reversed = "";
 for (int i = name.length() - 1; i >= 0; i = i - 1)
 {
 String letter = name.substring (i,i+1);
 reversed = reversed + letter; 
}
    return reversed;// returns full encryption
  }

 //method for decrypting
  public static String decrypt(String en)
  {
    //reverses decryption
 String name = en;
    String reversed = "";
 for (int i = name.length() - 1; i >= 0; i = i - 1)
 {
 String letter = name.substring (i,i+1);
 reversed = reversed + letter; 
   en = reversed;
}

    int z = 10;//declares variables
    String done = "";
    for (int i=0;i<en.length();i++)//loop for encryption
      {
         // changes vakue of z
        if (z > 3)
        {
      z = z-1;
          }
        else
        {
          z = z +i;
        }
         char letter = en.charAt(i);
        int ascii = (int)letter;

        int decoded= ascii+3 - z; //decryption takes place
    char newLetter;
        int q=0;
        int b,l,r;
        if (decoded < 32) //if number is less than 32, start at 126 and subtract remaining numbers
        {
         r = (3-z);
          r = -(r);
         b =  32-decoded;
         l = r-b;
          q = 126-l;
        }
         
         else 
        { 
        q = decoded;

        }
          newLetter = (char)q;
        done = done + newLetter;
      }
      return done;// returns decryption
    
  }
}