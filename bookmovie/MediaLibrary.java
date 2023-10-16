import java.util.ArrayList;
import java.util.Scanner;

public class MediaLibrary {

     //set the IP address of your API or a user
     final static String ipAddress = "192.168.1.150";
     //static variable for the class MediaLibrary
     private static ArrayList<Song> myPlaylist = new ArrayList<Song>();
     private static ArrayList<Book> myBookShelf = new ArrayList<Book>();

     public static void main(String[] args) {               //MediaLibrary.main(String[] args)
          Song s1 = new Song();
          Song s2 = new Song("Yikes!");
          Song s3 = new Song("Yonkers","Tyler The Blythe");

          myPlaylist.add(s1);myPlaylist.add(s2);myPlaylist.add(s3);

          // printPlaylist(myPlaylist);

          s1.setTitle("Wheels on Da Bus");
          //call the object name or call the item in the list
          s1.setRating(1);
          myPlaylist.get(1).setRating(5);
          myPlaylist.get(2).setRating(10);

          // printPlaylist(myPlaylist);

          //method that automates the song creation - ask the user for info
          addSong();
          addSong();

          printPlaylist(myPlaylist);

          printAveRating(myPlaylist);

          System.out.println(findASong());
          //Find a song based on the user input,
          //   and if the user input is the song title, 
          //   return the song.

          myBookShelf.add(new Book());
          myBookShelf.add(new Book("Rainbow Six"));
          myBookShelf.add(new Book("Percy Jackson","Rick Whoop"));

          // printShelf(myBookShelf);

     }
     private static void printPlaylist(ArrayList<Song> arr){
          for(int i=0;i<arr.size();i++){
               System.out.println(arr.get(i));
          }
     }
     private static void printShelf(ArrayList<Book> arr){
          for(int i=0;i<arr.size();i++){
               System.out.println(arr.get(i));
          }
     }
     private static void addSong(){
          Scanner ui = new Scanner(System.in);
          String n = ui.nextLine();
          String a = ui.nextLine();
          double r = ui.nextDouble();
          myPlaylist.add(new Song(n,a,r));
     }
     private static void printAveRating(ArrayList<Song> arr){
          double average = 0.0;
          double sum=0.0;
          for(int i=0;i<arr.size();i++){
               sum+=arr.get(i).getRating();
          }
          average=sum/arr.size();
          System.out.println(average);
     }
     private static Song findASong(){
          Scanner ui = new Scanner(System.in);
          String userInput = ui.nextLine();
          for(int i=0;i<myPlaylist.size();i++){
               if(myPlaylist.get(i).getName().equals(userInput)){
                    return myPlaylist.get(i);
               }
          }
          return new Song();
     }


}
