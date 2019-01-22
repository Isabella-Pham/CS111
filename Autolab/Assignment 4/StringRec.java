public class StringRec{
  public static void main(String[] args) {
    System.out.println("Enter a string.");
    String str = IO.readString();
    System.out.println(decompress(str));
  }
  public static String decompress (String original){
    if(original.length() == 1 || original.equals("")){
      return original;
    }
    if(original.charAt(0) >= '1' && original.charAt(0) <= '9'){
      return printXTimes(original.charAt(1), original.charAt(0)) + decompress(original.substring(1));
    }else{
      return original.substring(0,1) + decompress(original.substring(1));
    }
  }
  public static String printXTimes(char c, char x){
    String str = "";
    for(char i = '1'; i < x; i++){
      str = str + c;
    }
    return str;
  }
}
