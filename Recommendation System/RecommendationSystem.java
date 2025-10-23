import java.util.Scanner;
public class RecommendationSystem {
    public static void main(String[]arga){
        String [] Fantasy = {"Harry Potter , Pirates of caribbean , The Hobbit , Lord of the rings"};
        String[] Scifi  = {"Lucy , Interstellar , Inception , oppenheimer , The Martian"};
        String[] Horror = {"The conjuring , Sinister , It , Hereditary, Haunted "};
        String [] Biography = {" Sanju , The wolf of wall street , Ford Vs Ferrari ,The Pursuit of happiness"};
        String [] Love = {"kal ho na ho , Barfi , Raanjhanaa, Aashiqui 2, Saiyaara"};
        Scanner sc = new Scanner(System.in);
        System.out.println("What kind of movie do you like ? (Fantasy/Scifi/Horror/Biography,Love)");
        String Genre = sc.nextLine();

        if (Genre.equalsIgnoreCase("Fanstasy")){
            System.out.println("Recommended Fantasy Movie:");
            for (String movie : Fantasy){
                System.out.println(movie);
            }
        }else if(Genre.equalsIgnoreCase("Scifi")){
            System.out.println("Recommended SciFi Movies :");
            for(String movie : Scifi){
                System.out.println(movie);
            }

        }else if (Genre.equalsIgnoreCase("Horror")){
            System.out.println("Recommemded Horror Movies :");
            for(String movie : Horror){
                System.out.println(movie);
            }
        }else if (Genre.equalsIgnoreCase("Biography")){
            System.out.println("Recommeded Biography Movies");
            for(String movie : Biography){
                System.out.println(movie);
            }
        }else if (Genre.equalsIgnoreCase("Love")){
            System.out.println("Recommended Love Movies ");
            for(String movie : Love){
                System.out.println(movie);
            }
        }else{
            System.out.println("Sorry , No Recommendations availablr for that genre .Please choose of the given Recommendation.");
        }
    }
}
