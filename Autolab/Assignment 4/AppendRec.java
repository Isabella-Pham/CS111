public class AppendRec{
  public static void main(String[] args) {

  }
  public static String appendNTimes(String original, int n){
      if(n == 0){
        return original;
      }
      return original + appendNTimes(original, n-1);
  }
}
