import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in); //modtage inputs og udskrive outputs (class)
    Database database = new Database(); // databasen indeholder objekter(superhelte) (class) //man skal bruge et objekt, for at kunne bruge databasen

    int valg;


    public void startMenu() {
        database.createTestData();
        do {
            System.out.println("--------------------------------- \n Velkommen til superhelteverdenen!\n---------------------------------");
            System.out.println(" 1) Opret ny superhelt \n 2) Søg efter superhelt \n 5) Vis alle superhelte \n 9) Luk databasen \n ---------------------------------");


            int valg = scanner.nextInt();
            scanner.nextLine();
            if (valg == 1) {
                opretSuperheroMenu();
            }
            else if (valg == 2) {
                søgHelt();
            }
            else if (valg == 9) {
                System.exit(0);
            }
            else if (valg == 5) {
                printAllSuperheroes();
            }


        } while (valg != 9);
    }


    public void opretSuperheroMenu() {

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


    public void søgHelt() {
        System.out.println("Indtast navn på superhelt:\n");

        String searchTerm = scanner.nextLine();

        for (int i = 0; i < database.getSuperheroes().size(); i++) {

            if (database.getSuperheroes().get(i).getHelteNavn().equals(searchTerm)) {
                System.out.println(database.getSuperheroes().get(i));
            }
        }
      /*  System.out.println("---------------------------------\nSøg efter superhelt:");
        String searchTerm = scanner.nextLine();
        Superhero fundet = database.searchFor(searchTerm);
        if (fundet == null) {
            System.out.println("Intet resultat");*/

    }


    public void printAllSuperheroes() {
        System.out.println("Liste over superhelte\n ");
        for (Superhero superhero : database.getSuperheroes()) {
            System.out.println(superhero);
        }
    }

    /*public void redigerHelt() {

        boolean writingError;

        System.out.println("Skriv her, hvilken helt du vil redigere:?");
        String name = scanner.nextLine();


        for (int i = 0; i < database.getSuperheroes().size(); i++) {

            if (database.getSuperheroes().get(i).equals(name)) {
                String nytHelteNavn = scanner.nextLine();
                database.getSuperheroes().get(i).setHelteNavn(nytHelteNavn);
            }
        }
        List<Superhero> superheroes = database.searchFor(name);

        if (superheroes.size() == 0) {
            System.out.println("Helten findes ikke - prøv igen.");
        }
        else {
            Superhero superhero = superheroes.get(0);
            System.out.println("Ret heltens navn (" + superhero.getHelteNavn() + "):");
            String nytNavn = scanner.nextLine();
            if (!nytNavn.isEmpty()) {
                superhero.setHelteNavn(nytNavn);
            }

            System.out.println("Ret superheltens rigtige navn (" + superhero.getÆgteNavn() + "):");
            String nytÆgteNavn = scanner.nextLine();
            if (!nytÆgteNavn.isEmpty()) {
                superhero.setÆgteNavn(nytÆgteNavn);
            }
            System.out.println("Ret superheltens superkraft(" + superhero.getSuperkraft() + "):");
            String nySuperkraft = scanner.nextLine();
            if (!nySuperkraft.isEmpty()) {
                superhero.setSuperkraft(nySuperkraft);
            }

            System.out.println("Ret superheltens art (" + superhero.getHuman() + "):");
            boolean nytHuman = scanner.nextBoolean();
            if (!nytHuman.isEmpty()) {
                int human = Integer.parseInt(nytHuman);
                superhero.setHuman(human);
            }
            System.out.println("Ret superheltens oprindelseseår (" + superhero.getÅrstal() + "):");
            try {
                String nytOprindelsesÅr = scanner.nextLine();
                if (!nytOprindelsesÅr.isEmpty()) {
                    int year = Integer.parseInt(nytOprindelsesÅr);
                    superhero.setÅrstal(year);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ikke korrekt tal");


            }
        }

     */
}
