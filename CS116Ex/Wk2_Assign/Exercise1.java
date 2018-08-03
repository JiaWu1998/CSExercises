import java.util.Arrays;
public class Exercise1{
  public static void main(String[] args){
    String str1 = new String("This house is blue.");
    String str2 = new String("Pokemon go time?");
    String str3 = new String("PoKEmOn go Time?");
    String str4 = "kimfy";
    String str5 = "kimfhuhue";
    String str6 = "kimf";

    s("The index of 'house' starts from " + str1.indexOf("house") + " in : \"" + str1 + "\"");
    s("The character at index 6 of " + "\"" + str2 + "\"" + " is \'" + str2.charAt(6) + "\'");
    s("The string " + "\"" + str1 + "\"" + " is " + str1.length() + " characters long.");
    s("The substring from index 6(including) to index 12(excluding) is \"" + str2.substring(6,12) + "\" in string : " + "\"" + str2 + "\"");
    s("It is " + str2.equals(str2) + " that string " + "\"" + str2 + "\"" + " equals " + "\"" + str2 + "\"");
    s("It is " + str2.equals(str3) + " that string " + "\"" + str2 + "\"" + " equals " + "\"" + str3 + "\"");
    s("\nNow, the class string - compareTo method is a intriging one.");
    s("String \"" + str1 + "\" compare to \"" + str1 + "\" returns " + str1.compareTo(str1) );
    s("How ever String \"" + str1 + "\" compare to \"" + str2 + "\" returns " + str1.compareTo(str2) + " because it actually compare the decimal value of a character in ASCII of every character. If character at the same index for both string equals 0, it moves on to the next character index. If there is no difference throughout the both strings, it returns 0. However, if it finds a character from string 1 that is different from string 2 in the same index, it returns that difference in decimal value and system.exit(0)." );
    s("There is also one more condition in the compareTo method that is kinda cool, when all characters from both strings is equal at the same index WITH the exception of one string having extra characters, the compareTo method doesn't show the difference of decimal value but the DIFFERENCE OF STRING LENGTH.");
    s("Ex: \"" + str4 + "\" compareTo \"" + str5 + "\" returns " + str4.compareTo(str5) + " because of the difference of deciaml value found in index 4 of both strings, char 'y' and char 'h' \n however, \"" + str5 + "\" compare to \"" + str6 + "\" ,where the only difference is none up util index 4, returns " + str5.compareTo(str6) + " which is the difference between the length of both strings");
    s("For the split method, str3 is \"" + str3 + "\" and str3.split(\"o\",\"2\") is " + Arrays.toString(str3.split("o",2)) + " which returns a array that splits a string when 'o' happens; note that the second 'o' was not split. It's because of the delimiter-> it sets the limit length of the return array(mines was already length 2 in the first split so a second split can't be done). It specials cases of setting the delimter to 0 or a negative number, it makes it so that the return array length can be any length necessary.");
    s("The toUppercase and tolowercase is obviously making the all characters to whichever case. \n Ex: str3.toUpperCase() is \"" + str3.toUpperCase() + "\" and str3.toLowerCase() is \"" + str3.toLowerCase() + "\". note that these methods have exceptions for symbols."  );
    s("Finally, you have reached the end with the replace method which the takes the first string parameter and replace it with the second string parameter \n Ex: str3 is \""+ str3 +"\" \n str3.replace('o','uu') is \"" + str3.replace("o","uu_j") + "\".");
    }
    public static void s(String hey){
      System.out.println(hey);
      System.out.println();
      //typing system.out.println too many times is tiring.
    }
  }
