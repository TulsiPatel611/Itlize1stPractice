public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int factorial = 1;

          if (number == 0 || number == 1) {
              return 1;
          }

          for (int i = 2; i <= number; i++) {
              factorial = factorial * i;
          }
          return factorial;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] arrOfPhrase = phrase.split(" ");
          String acronym = "";
          
          for (String str : arrOfPhrase) {
              acronym = acronym + str.charAt(0);
          }
          return acronym.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String[] arrOfWord = word.split("");
          String encryptedMessage = "";
          
          for (String s : arrOfWord) {
              
              int asciiValue = (int)(s.charAt(0));
              asciiValue += 3;
                
              char c = (char)asciiValue;
              
              if (c > 'z') {
                  char ch = (char)(asciiValue - 26);
                  encryptedMessage = encryptedMessage + ch;
              }
                
              else {
                encryptedMessage = encryptedMessage + c;
              }
          }
          
          return encryptedMessage;
      }
      
      public static void main (String[] args) {

          LoopFun loopFunObj = new LoopFun();

          System.out.println("Factorial = " + loopFunObj.factorial(5));
          System.out.println("Acronym = " + loopFunObj.acronym("Ruby on Rails"));
          System.out.println("Encrypted Message = " + loopFunObj.encrypt("wxyz"));
      }
}
