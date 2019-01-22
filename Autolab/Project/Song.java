public class Song{
  public static void main(String[] args) {
    Song song1 = new Song("Fly Me to the Moon");
    song1.setYear(1);
    song1.addWriter("a");
    song1.addWriter("b");
    song1.addWriter("c");
    Song song2 = new Song("Fly Me to the Moon");
    song2.setYear(1);
    song2.addWriter("a");
    song2.addWriter("b");
    song2.addWriter("c");
    Song song3 = null;
    System.out.println(song1.equals(song2));
  }
  private String name;
  private int year;
  private int numberOfWriters = 0;
  private String[] writers = new String[50];
  private int rating;
  public Song(String n){
      name = n;
  }
  public void setName(String n){
    name = n;
  }
  public String getName(){
    return name;
  }
  public void setYear(int y){
    year = y;
  }
  public int getYear(){
    return year;
  }
  public void setRating(int r){
    rating = r;
  }
  public int getRating(){
    return rating;
  }
  public void addWriter(String writerName){
    for(int i = 0; i<50; i++){
      if(writers[i] == null){
        writers[i] = writerName;
        numberOfWriters++;
        break;
      }
    }
  }
  public String[] getWriters(){
    return writers;
  }
  public int getNumberOfWriters(){
    return numberOfWriters;
  }
  public String getWriterAtIndex(int i){
      return writers[i];
  }
  public String toString(){
      return  name + ", " + Integer.valueOf(year) + ", " + Integer.valueOf(rating);
  }
  public boolean equals(Object other){ //must fix
        if(other instanceof Song == true){
          Song Other = (Song) other;
          if(name.equals(Other.getName()) && year == Other.getYear() && numberOfWriters == Other.getNumberOfWriters()){
            for(int i = 0; i < numberOfWriters; i++){
              boolean same = false;
              for(int j = 0; j < numberOfWriters; j++){
                if(writers[i].equals(Other.getWriterAtIndex(j))){
                  same = true;
                  break;
                }
              }
              if(same == false){
                return false;
              }
            }
            return true;
          }else{
            return false;
          }
        }else{
          return false;
        }
}
public int compareTo(Song other){
      return name.compareTo(other.getName());
  }
}
