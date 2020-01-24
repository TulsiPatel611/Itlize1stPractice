 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      int sum = baseValue + valueToAdd;
      return sum;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      double sum = baseValue + valueToAdd;
      return sum;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      double halfValue = (double)(number / 2);
      return halfValue;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      boolean result = false;
      
      if (number % 2 != 0) {
          result = true;
      }
      return result;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      int square = number * number;
      return square;
  }
  
  public static void main (String[] args) {

          MathUtilities mathUtil = new MathUtilities();

          System.out.println("Sum of Integer Values = " + mathUtil.add(10,10));
          System.out.println("Sum of Double Values = " + mathUtil.add(2.50d, 2.50d));
          System.out.println("Half Value of the number = " + mathUtil.half(60));
          System.out.println("Is number Odd? = " + mathUtil.isOdd(60));
          System.out.println("Sqaure of the number = " + mathUtil.square(4));
      }

}
