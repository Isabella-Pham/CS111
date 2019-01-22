public class TwoLargest{
  public static void main(String[] args) {
    System.out.println("Enter the terminating value.");
    double terminating = IO.readDouble();
    System.out.println("Enter a value");
    double largest1 = IO.readDouble();
    System.out.println("Enter another value");
    double largest2 = IO.readDouble();
    while(largest1 == terminating || largest2 == terminating){
      if(largest1 == terminating){
        System.out.println("Your first value appears to equal your terminating value, please enter a new value.");
        largest1 = IO.readDouble();
      }
      if(largest2 == terminating){
        System.out.println("Your second value appears to equal your terminating value, please enter a new value.");
        largest2 = IO.readDouble();
      }
    }
    if(largest2 > largest1){
      double temp = largest1;
      largest1 = largest2;
      largest2 = temp;
    }
    while(true){
      System.out.println("Enter another value.");
      double d = IO.readDouble();
      if(d == terminating){
        break;
      }
      if(d>largest1){
        double temp = largest1;
        largest1 = d;
        largest2 = temp;
      }else if(d>largest2){
        largest2 = d;
      }
    }
    System.out.println("The two largest numbers are:");
    IO.outputDoubleAnswer(largest1);
    IO.outputDoubleAnswer(largest2);
  }
}
