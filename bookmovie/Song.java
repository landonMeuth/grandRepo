public class Song {
     //field variable
     String name;
     String artist;
     double rating;

     public Song(){}

     public Song(String title){
          this.name = title;
     }

     public Song(String title, String artist){
          this.name = title;
          this.artist = artist;
     }

     public Song(String title,String artist,double rate){
          this.name = title;
          this.artist = artist;
          this.rating = rate;
     }

     //getters & setters
     //accessors & mutators
     //will have a getter and setter for each field variable
     public void setRating(double newRating){
          this.rating=newRating;
     }
     public double getRating(){
          return this.rating;
     }
     public void setTitle(String newName){
          this.name=newName;
     }
     public String getName(){
          return this.name;
     }

     @Override
     public String toString() {
          String out="";
          out += "title: "+this.name;
          out += "\nartist: "+this.artist;
          out += "\nrating: "+this.rating;
          out+="\n";
          return out;
     }

}
