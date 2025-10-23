import java.util.Scanner;
public class RecommendationSystem{
    public static void main(String[] arga){
        String[] Fantasy= {"Harry Potter , Pirates of Caribbean ,The Hobbit , Lord of the Rings"};
        String[] Scifi ={"Lucy , Interstellar ,Inception , Oppenheimer , The Martian"};
        String[] Horror = {"The.Conjuring , Sinister , It , Hereditary , Haunted"};
        String[] Biography= {"Sanju ,The Wolf of Wall Street , Ford Vs Ferrari , The Pursuit of Happiness"};
        String[] Love ={"Kal Ho Na Ho , Barfi , Raanjhanaa , Aashiqui 2 ,Saiyaara"};
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("What kind of movies are looking for ?  (Fantasy/Scifi/Horror/Biography/Love) Type 'Exit' to quit");
            String Genre= sc.nextLine();
            if(Genre.equalsIgnoreCase("Exit")){
                System.out.println("Thank You ! GoodBye ");
                break;
            }
            if(Genre.equalsIgnoreCase("Fantasy")){
                System.out.println("Recommended Fantasy Movie:");
                for (String movie : Fantasy){
                    System.out.println(movie);
                 }
            }else if (Genre.equalsIgnoreCase("Scifi")){
                System.out.println("Recommended SciFi Movies:");
                for (String movie : Scifi){
                    System.out.println(movie);
                }

            }else if(Genre.equalsIgnoreCase("Horror")) {
                System.out.println("Recommemded Horror Movies :");
                for(String movie : Horror){
                    System.out.println(movie);
                }
            }else if(Genre.equalsIgnoreCase("Biography")){
                System.out.println("Recommeded Biography Movies");
                for (String movie : Biography){
                 System.out.println(movie);
                }
            }else if (Genre.equalsIgnoreCase("Love")) {
                System.out.println("Recommended Love Movies :");
                for (String movie : Love) {
                    System.out.println(movie);
                }
            } else{
                System.out.println("Sorry ,No Recommendations available for that genre. Please choose from the given Recommendations.");
             }
            
        }
        sc.close();
    }
}

