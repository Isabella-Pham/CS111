public class Compress{
  public static void main(String[] args) {
    System.out.println("Enter a string.");
    String str = IO.readString();
    System.out.println(compress(str));
  }
  public static String compress (String original){
    int counter = 0;
    StringBuilder sb = new StringBuilder();
    if(original.length() != 1 && original.charAt(0) == original.charAt(1)){
      counter++;
    }
    for(int i = 1, j = 0; i <= original.length(); i++, j++){
      if(i == original.length() || original.charAt(i) != original.charAt(j)){
        if(counter > 1){
          sb.append(counter);
        }
        sb.append(original.charAt(j));
        counter = 1;
      }else{
        counter++;
      }
    }
    return sb.toString();
  }
}
