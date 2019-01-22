public class Zoo{
  public static void main (String[] args){
      System.out.println("Enter number of Zoos: ");
      int numZoos = IO.readInt();
      int totalGiraffes = 0;
      int totalLions = 0;
      int totalSnakes = 0;
      for(int i = 1; i <= numZoos; i++){
        System.out.println("Enter number of giraffes for zoo " + i + ": ");
        int giraffes = IO.readInt();
        totalGiraffes += giraffes;
        System.out.println("Enter number of lions for zoo " + i + ": ");
        int lions = IO.readInt();
        totalLions += lions;
        System.out.println("Enter number of snakes for zoo " + i + ": ");
        int snakes = IO.readInt();
        totalSnakes += snakes;
      }
      IO.outputIntAnswer(totalGiraffes);
      IO.outputIntAnswer(totalLions);
      IO.outputIntAnswer(totalSnakes);
  }
}
