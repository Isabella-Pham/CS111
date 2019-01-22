public class DonateToPaws{
  public static void main(String[] args) {
    System.out.println("Please type your donation amount");
    double amount = IO.readDouble();
    System.out.println("Your donation fee is:");
    IO.outputDoubleAnswer(donationFee(amount));
  }
  public static double donationFee(double donationAmount){
    double fee = 0;
    if(donationAmount <= 150){
      fee = 3;
    }else if(donationAmount > 150 && donationAmount < 1500){
      if(0.04*donationAmount > 8){
        fee += 0.04*donationAmount;
      }else{
        fee += 8;
      }
    }else if(donationAmount >= 1500 && donationAmount < 15000){
      if(0.01*donationAmount > 20){
        fee += 0.01*donationAmount;
      }else{
        fee += 20;
      }
    }else if(donationAmount >= 15000){
      fee += 150;
      donationAmount -= 15000;
      if(donationAmount <= 4000 && donationAmount>0){
        fee += donationAmount*0.02;
      }else if(donationAmount > 4000){
        fee += 80+(donationAmount-4000)*0.03;
      }
    }
    return fee;
  }
}
