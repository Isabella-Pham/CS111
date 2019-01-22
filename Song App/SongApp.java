/*
*
* This class implements a library of songs
*
* @author CS111 - Rutgers University
*
*/

public class SongApp{
  public static void main(String[] args) {
    /*SongApp sapp = new SongApp();
    Song a = new Song("aaa");
    Song b = new Song("bbb");
    Song c = new Song("ccc");
    Song d = new Song("ddd");
    Song e = new Song("eee");
    Song f = new Song("fff");
    sapp.addSong(a);
    sapp.addSong(b);
    sapp.addSong(c);
    sapp.addSong(d);
    sapp.addSong(e);
    sapp.addSong(f);
    a.setYear(2000);
    b.setYear(2003);
    c.setYear(2009);
    d.setYear(2000);
    e.setYear(2003);
    f.setYear(1999);
    a.setRating(3);
    b.setRating(2);
    c.setRating(1);
    d.setRating(3);
    e.setRating(1);
    f.setRating(2);
    a.addWriter("bob");
    a.addWriter("helen");
    b.addWriter("lucy");
    c.addWriter("jane");
    d.addWriter("helen");
    e.addWriter("bob");
    f.addWriter("julie");

    sapp.print();
    System.out.println(sapp.removeSong(c));
    System.out.println();
    sapp.print();
    sapp.sortByYear();
    System.out.println();
    sapp.print();*/
  }

  private Song[] items;      // keep Songs in an unsorted array
  private int numberOfItems; // number of Songs in the array

  /*
  * Default constructor creates array with capacity for 5 Songs
  */
  SongApp (){
      items = new Song[5];
  }

  /*
  * One argument constructor creates array with user defines capacity
  * @param capacity defines the capacity of the Song library
  */
  SongApp (int capacity) {
      items = new Song[capacity];
  }
  /*
  * Add a Song into the library (unsorted array)
  *
  * If the library is full (there is not enough space to add another Song)
  *   - create a new array with double the size of the current array.
  *   - copy all current Songs into new array
  *   - add new Song
  *
  * @param m The Song to be added to the libary
  */
  public void addSong (Song m) { //COMPLETED TEST CASES
      int i;
      for(i = 0; i < items.length; i++){
        if(items[i] == null){
          items[i] = m;
          break;
        }
      }
      if(i == items.length){
        Song[] newItems = new Song[items.length*2];
        for(int j = 0; j < items.length; j++){
          newItems[j] = items[j];
        }
        newItems[items.length] = m;
        items = newItems;
      }
      numberOfItems++;

  }

  /*
  * Removes a Song from the library. Returns true if Song is removed, false
  * otherwise.
  * The array should not become sparse after a remove, that is, all Songs
  * should be in consecutive indexes in the array.
  *
  * @param m The Song to be removed
  *
  */
  public boolean removeSong (Song m){
      boolean removed = false;
      int i;
      for(i=0; i<numberOfItems; i++){
        if (items[i].equals(m)){
          numberOfItems--;
          items[i] = items[numberOfItems];
          items[numberOfItems] = null;
          removed = true;
          break;
        }
      }
    /*  if(removed == true){
        numberOfItems--;
        for(int j = i+1; j < numberOfItems; j++){
          items[j] = items[j++];
        }
      }
    items[numberOfItems] = null;*/
    return removed;
  }

  /*
  * Returns the library of songs
  *
  * @return The array of Songs
  */
  public Song[] getSongs () { //COMPLETED TEST CASES
      return items;
  }

  /*
  * Returns the current number of Songs in the library
  *
  * @return The number of items in the array
  */
  public int getNumberOfItems(){ //COMPLETED TEST CASES
      return numberOfItems;
  }

  /*
  * Update the rating of Song @m to @rating
  *
  * @param @m The Song to have its ratings updated
  * @param @rating The new rating of @m
  * @return tue if update is successfull, false otherwise
  *
  */
  public boolean updateRating(Song m, int rating){ //COMPLETED TEST CASES
    for(int i=0; i<numberOfItems; i++){
      if(items[i].getName() == m.getName()){
        items[i].setRating(rating);
        return true;
      }
    }
    return false;
  }

  /*
  * Prints all Songs
  */
  public void print(){ //COMPLETED TEST CASES
      for(int i = 0; i < numberOfItems; i++){
        System.out.println(items[i].toString());
      }
  }

  /*
  * Return all the Songs by @songwriter. The array size should be the
  * number of Songs by @songwriter.
  *
  * @param songwriter The songwriter's name
  * @param An array of all the Songs by @songwriter
  *
  */
  public Song[] getSongsBySongwriter(String songwriter){ //COMPLETED TEST CASES
    int length = 0;
    for(int i = 0; i < numberOfItems; i++){
      for(int j = 0; j < 50; j++){
        if(items[i].getWriterAtIndex(j) == null){
          break;
        }
        if(items[i].getWriterAtIndex(j).equals(songwriter)){
          length++;
          break;
        }
      }
    }
      Song[] song = new Song[length];
      int songIndex = 0;
      for(int i = 0; i < numberOfItems; i++){
        for(int j = 0; j < 50; j++){
          if(items[i].getWriterAtIndex(j) == null){
            break;
          }
          if(items[i].getWriterAtIndex(j).equals(songwriter)){
            song[songIndex] = items[i];
            songIndex++;
            break;
          }
        }
    }
    return song;
  }

  /*
  * Return all the Songs released in @year. The array size should be the
  * number of Songs made in @year.
  *
  * @param year The year the Songs were made
  * @return An array of all the Songs made in @year
  *
  */
  public Song[] getSongsByYear(int year){ //COMPLETED TEST CASES
    int length = 0;
    for(int i = 0; i < numberOfItems; i++){
      if(items[i].getYear() == year){
        length++;
      }
    }
    Song[] song = new Song[length];
    int songIndex = 0;
    for(int i = 0; i < numberOfItems; i++){
      if(items[i].getYear() == year){
        song[songIndex] = items[i];
        songIndex++;
      }
    }
    return song;
  }

  /*
  * Return all the Songs with ratings greater then @rating
  *
  * @param rating
  * @return An array of all Songs with rating greater than @rating
  *
  */
  public Song[] getSongsWithRatingsGreaterThan(int rating){ //COMPLETED TEST CASES
    int length = 0;
    for(int i = 0; i < numberOfItems; i++){
      if(items[i].getRating() > rating){
        length++;
      }
    }
    Song[] song = new Song[length];
    int songIndex = 0;
    for(int i = 0; i < numberOfItems; i++){
      if(items[i].getRating() > rating){
        song[songIndex] = items[i];
        songIndex++;
      }
    }
    return song;
  }

  /*
  * Search for Song name @name using binary search algorithm.
  * Assumes items is sorted
  */
  public Song searchSongByName(String name){ //COMPLETED TEST CASES
    int l = 0;
    int r = numberOfItems - 1;
    while (l <= r){
      int mid = l + (r-l)/2;
      if (items[mid].getName() == name){
        return items[mid];
      }else if (items[mid].getName().compareTo(name) < 0){
        l = mid + 1;
      }else{
        r = mid - 1;
      }
    }
    return null;
}
/*
* Sorts Songs by year using insertion sort
*/
public void sortByYear () { //COMPLETED TEST CASES
  for (int i=1; i<numberOfItems; ++i){
    Song key = items[i];
    int j = i-1;
  while (j>=0 && items[j].getYear() > key.getYear()){
    items[j+1] = items[j];
    j = j-1;
  }
  items[j+1] = key;
  }
}

 /*
  * Sorts array of Songs by name using selection sort
  */
public void sortByName(){ //COMPLETED TEST CASES
  for (int i = 0; i < numberOfItems-1; i++){
  int minIndex = i;
    for (int j = i+1; j < numberOfItems; j++){
      if (items[j].compareTo(items[minIndex]) < 0){
        minIndex = j;
      }
    }
      Song temp = items[minIndex];
      items[minIndex] = items[i];
      items[i] = temp;
  }
}

 /*
  * Search for Song name using recursive linear search
  * @param name The name of the song to search
  * @param Songs The array containing all songs
  * @param l The left index
  * @param r The right index
  * @return The song with name @name or null if song is not found
  */
  public static Song searchSongByName (String name, Song[] Songs, int l, int r){ //COMPLETED TEST CASES
    if (r < l){
      return null;
    }
    if (Songs[l].getName() == name){
      return Songs[l];
    }
    if (Songs[r].getName() == name){
      return Songs[r];
    }
    return searchSongByName(name,Songs, l+1, r-1);
  }
}
