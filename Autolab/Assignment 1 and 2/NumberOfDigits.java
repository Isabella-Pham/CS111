public class NumberOfDigits{
  public static void main (String[] args){
    System.out.print("Enter an integer: ");
    int number = IO.readInt();
    double newNum = (double) number;
    int digits = 0;
    while (newNum >= 1){
      digits++;
      newNum = newNum/10;
    }
    IO.outputIntAnswer(digits);
  }
}
