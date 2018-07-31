
package javaapplication12;
import java.util.*;
public class Java01 {
   static void displayValue(Locale currentLocale, String key) {
      ResourceBundle labels = 
      ResourceBundle.getBundle("\\aaa\\aaa01",currentLocale);
      String value  = labels.getString(key);
      System.out.println(
           "Locale = " + currentLocale.toString() + ", " +
           "key = " + key + ", " +
           "value = " + value);
   }


   static void iterateKeys(Locale currentLocale) {
      ResourceBundle labels = 
         ResourceBundle.getBundle("\\aaa\\aaa01",currentLocale);

      Enumeration bundleKeys = labels.getKeys();

      while (bundleKeys.hasMoreElements()) {
         String key = (String)bundleKeys.nextElement();
         String value  = labels.getString(key);
         System.out.println("key = " + key + ", " +
           "value = " + value);
      }

   } 
   static public void main(String[] args) {

      Locale[] supportedLocales = {
         Locale.FRENCH,
         Locale.GERMAN,
         Locale.ENGLISH
      };

      for (int i = 0; i < supportedLocales.length; i ++) {
          displayValue(supportedLocales[i], "s2");
      }

      System.out.println();

      iterateKeys(supportedLocales[0]);

   } 

}