public class BuyingApples{
  public static void main (String[] args){
      System.out.println("Enter cost per LB: ");
      double costLB = IO.readDouble();
      System.out.println("Enter number of pounds: ");
      double numPounds = IO.readDouble();
      boolean badInput = false;
      if(costLB < 0){
        IO.reportBadInput();
        badInput = true;
      }
      if(numPounds < 0){
        IO.reportBadInput();
        badInput = true;
      }
      if(badInput == false){
        IO.outputDoubleAnswer(costLB * numPounds);
      }
  }
}
