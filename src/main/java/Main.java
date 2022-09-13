import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Velkommen til superhelteverdenen!");
        System.out.println("---------------------------------");

        Scanner scanner = new Scanner(System.in);
        Database database = new Database();


        do {
            System.out.println("1) For at oprette ny superhelt \n 5) Søg efter superhelt \n 9) Luk databasen ");

            int menuvalg = scanner.nextInt();


            if ((menuvalg) == 1) {
                System.out.println("Opret en superhelt");

                System.out.println("Indtast en superhelts navn (fx Superman)");
                String heltenavn = scanner.nextLine();


                System.out.println("Indtast superheltens rigtige navn");
                String ægtenavn = scanner.nextLine();

                System.out.println("Indtast superheltens superkræfter");
                String superkraft = scanner.nextLine();

                System.out.println("Er superhelten et menneske? (alternativ et rumvæsen)");
                boolean human = scanner.nextBoolean();

                System.out.println("Indtast superheltens oprettelsesår");
                int årstal = scanner.nextInt();

                database.createSuperhero(heltenavn, ægtenavn, årstal, superkraft, human);

            } else if (menuvalg == 9) ;
            System.out.println("Program afsluttes");
            System.exit(9);scanner.nextInt();


            }while (true) ;

        }

    }



