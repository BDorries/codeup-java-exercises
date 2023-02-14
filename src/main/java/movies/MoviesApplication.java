package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        while(true) {
            writeMenu();
            Input in = new Input();
            int choice = in.getInt(1, 6);
            menuChoice(choice);
        }
    }
    public static void writeMenu(){
        System.out.printf("""
        Please make a selection
        1. View all movies
        2. View movies by category: animated
        3. View movies by category: drama
        4. View movies by category: horror
        5. View movies by category: sci-fi
        6. Exit
        
        Selection:\s
        """);
    }
    public static void menuChoice(int choice){
        switch(choice){
            case 1 : //view all movies
                movies.toString();
                break;
            case 2 : //view all animated movies
                matchCategory("animated");
                break;
            case 3 : //view all drama movies
                matchCategory("drama");
                break;
            case 4 : //view all horror movies
                matchCategory("horror");
                break;
            case 5 : //view all sci-fi movies
                matchCategory("scifi");
                break;
            case 6 : //exit
                System.exit(0);
        }
    }
    public static void matchCategory(String category){
        Movie[] movieArr = new Movie[0];
        for (int i = 0; i < movies.length; i++) {

            if(movies[i].getCategory().equalsIgnoreCase(category)){
                movieArr = Arrays.copyOf(movieArr,movieArr.length+1);
                movieArr[movieArr.length-1] = movies[i];
            }
        }
        System.out.println("Search results: ");
        for (int i = 0; i < movieArr.length; i++) {
            System.out.print(movieArr[i].printName());
        }
    }
}
