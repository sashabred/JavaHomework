package lesson5;
import java.util.Arrays;
import java.util.Locale;

public class StringParse {

        //метод для поиска самого длинного слова в строке.
        public static String getLongestWord(String data) {

          String array[]= data.split(" ");
          int maxLength = 0;
          String word = "";

          for (int i=0; i <array.length; i++) {
              if (array[i].length() > maxLength) {
                  maxLength = array[i].length();
                  word = array[i];
              }
          }
        return word;
        }

    //метод, который проверяет является ли слово палиндромом.
    public static boolean isPalindrom(String data) {
        StringBuilder str= new StringBuilder(data);
        String strReverse = str.reverse().toString();
        return data.equalsIgnoreCase(strReverse);
    }

    // метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    public static String resetByaka(String data) {
        return data.toLowerCase().replace("бяка", "[вырезано цензурой]");
    }

    //Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
    public static int findSubString(String string, String subString) {
        int count = 0;
        for (int x = string.indexOf(subString); x >= 0; x = string.indexOf(subString, x + 1)) {
            count++;
        }

        return count;
    }

    // метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
   public static String invertWords(String s) {

       String[] stringArray = s.split(" ");
       StringBuilder strBuilder = new StringBuilder();

       for (int i = 0; i < stringArray.length; i++) {
           String reversedStr = new StringBuilder(stringArray[i]).reverse().toString();
           strBuilder.append(reversedStr)
                        .append(" ");
       }
       return strBuilder.toString().trim();

   }

}
