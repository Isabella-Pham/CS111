public class Gas{
  public static void main (String[] args){
    double cost = IO.readDouble();
    double numGallons = IO.readDouble();
    boolean creditCard = IO.readBoolean();
    boolean badInput = false;
    if(cost < 0){
      IO.reportBadInput();
      badInput = true;
    }
    if(numGallons < 0){
      IO.reportBadInput();
      badInput = true;
    }
    if(badInput == false){
      if(creditCard){
        IO.outputDoubleAnswer(cost*numGallons*1.10);
      }else{
        IO.outputDoubleAnswer(cost*numGallons);
      }
    }
  }
}
