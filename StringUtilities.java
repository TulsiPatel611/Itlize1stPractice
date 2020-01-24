
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        char[] charArr = valueToBeReversed.toCharArray(); 
        String reversedString = "";
        
        for (int i = charArr.length - 1; i >= 0; i--) {
            reversedString = reversedString + charArr[i];
        }
        
        return reversedString;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int strLength = word.length();
        int middleIndex = strLength / 2;
        char[] charArrayOfWord = word.toCharArray();
        
        return charArrayOfWord[middleIndex];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char[] chArr = value.toCharArray();
        String newString = "";
        
        for (int i = 0; i < chArr.length; i++) {
            Character c = chArr[i];
            if (c.equals(charToRemove)) {
                continue;
            }
            else {
               newString = newString + chArr[i];
            }
        }
        
        return newString;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] arrOfSentence = sentence.split(" ");
        
        return arrOfSentence[arrOfSentence.length -1];
    }
    
    public static void main (String[] args) {

          StringUtilities stringUtil = new StringUtilities();

          System.out.println("Return Input = " + stringUtil.returnInput("Java Practice"));
          System.out.println("Concatenate String = " + stringUtil.concatenate("Java","Practice"));
          System.out.println("Reverse the String = " + stringUtil.reverse("wxyz"));
          System.out.println("Get the middle character = " + stringUtil.getMiddleCharacter("abc"));
          System.out.println("Remove the character = " + stringUtil.removeCharacter("Ninja", 'j'));
          System.out.println("Get the last word = " + stringUtil.getLastWord("Ruby on Rails"));
      }
}
