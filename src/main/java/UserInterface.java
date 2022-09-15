import java.util.Scanner;

public class UserInterface
{

    Scanner scanner = new Scanner(System.in); //modtage inputs og udskrive outputs (class)
    Database database = new Database(); // databasen indeholder objekter(superhelte) (class) //man skal bruge et objekt, for at kunne bruge databasen

    int valg;


    public void startMenu()
    {
        database.createTestData();
        do
        {
            System.out.println("--------------------------------- \n Velkommen til superhelteverdenen!\n---------------------------------");
            System.out.println(" 1) Opret ny superhelt \n 2) Søg efter superhelt \n 5) Vis alle superhelte \n 9) Luk databasen \n ---------------------------------");


            int valg = scanner.nextInt();
            scanner.nextLine();
            if (valg == 1)
            {
                opretSuperheroMenu();
            }
            else if (valg == 2)
            {
                søgHelt();
            }
            else if (valg == 9)
            {
                System.exit(0);
            }
            else if (valg == 5)
            {
                printAllSuperheroes();
            }


        } while (valg != 9);
    }


    public void opretSuperheroMenu()
    {

        System.out.println("Oprettelse af superhelt\n");

        System.out.println("Indtast en superhelts navn (fx Superman):");
        String heltenavn = scanner.nextLine();

        System.out.println("Indtast superheltens rigtige navn:");
        String ægtenavn = scanner.nextLine();

        System.out.println("Indtast superheltens superkræfter:");
        String superkraft = scanner.nextLine();

        System.out.println("Er superhelten et menneske? (alternativ et rumvæsen):");
        boolean human = scanner.nextBoolean();

        System.out.println("Indtast superheltens oprindelsesår:");
        int årstal = scanner.nextInt();

        database.createSuperhero(heltenavn, ægtenavn, årstal, superkraft, human);
    }


    public void søgHelt()
    {
        System.out.println("---------------------------------\nSøg efter superhelt:");
        String searchTerm = scanner.nextLine();
        Superhero fundet = database.searchFor(searchTerm);
        if (fundet == null)
        {
            System.out.println("Intet resultat");

        }
    }


    public static void printAllSuperheroes()
    {
        System.out.println(Database.getSuperheroes());


    }

    // public void gemHelt() {
    // for (Superhero : database.)


}



