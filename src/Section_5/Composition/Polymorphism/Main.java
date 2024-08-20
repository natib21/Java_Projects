package Section_5.Composition.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Adventure","Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, "+
                    "S for Science Fiction, or Q to quit ) :");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
          System.out.print("Enter Movies Title: ");
            String title = s.nextLine();
            Movie movies = Movie.getMovie(type,title);
            movies.watchMovie();
        }
    }
}
