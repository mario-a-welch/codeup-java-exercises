package movies;

import util.Input;

public class MoviesApplication {
    public static Input userIn = new Input();
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {


        do {
            //List of options for the user to view all the movies or view movies by category
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("");

            int userSelection = userIn.getInt("Enter your choice: ");

            if(userSelection == 1){
                for(Movie m : movies){
                    System.out.println(m.getName() + " -- " + m.getCategory());
                }
            } else if(userSelection == 2){
                for(Movie m : movies){
                    if(m.getCategory().equals("animated")){
                        System.out.println(m.getName() + " -- " + m.getCategory());
                    }
                }
            } else if(userSelection ==3){
                for(Movie m : movies){
                    if(m.getCategory().equals("drama")){
                        System.out.println(m.getName() + " -- " + m.getCategory());
                    }
                }
            } else if(userSelection == 4){
                for(Movie m : movies){
                    if(m.getCategory().equals("horror")){
                        System.out.println(m.getName() + " -- " + m.getCategory());
                    }
                }
            } else if(userSelection == 5){
                for(Movie m : movies){
                    if(m.getCategory().equals("scifi")){
                        System.out.println(m.getName() + " -- " + m.getCategory());
                    }
                }
            }
        } while(userIn.yesNo("Do you want to search for other movies (y/n)"));
    }
}
