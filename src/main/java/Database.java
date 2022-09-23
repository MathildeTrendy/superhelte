import java.util.ArrayList;

public class Database {

    public ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createTestData() {
        createSuperhero("Bobbel", "Samme som heltenavn", 1998, "Tale med dyr", false);
        createSuperhero("Superman", "Clark Kent", 1978, "Flyve", false);
        createSuperhero("Kaptajn Underhyler", "Knold", 2017, "Flyve", true);
        createSuperhero("Robin", "Jason Todd", 1823, "Super styrke", true);
        createSuperhero("Bolt", "Samme som heltenavn", 2008, "Lasersyn", false);

    }


    public void createSuperhero(String heltenavn, String ægtenavn, int årstal, String superkraft, boolean human) {

        Superhero hero = new Superhero(heltenavn, ægtenavn, årstal, superkraft, human);

        superheroes.add(hero);

    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

   /* public ArrayList<Superhero> resultater = new ArrayList<>(); // lav arraylist af resultater
    String searchTerm = scanner.nextLine();

    {
        for (Superhero superhero : resultater) {
            if (superhero.getHelteNavn().equalsIgnoreCase(searchTerm)) {
                resultater.add(superhero); // i stedet for return her, add til resultater
            }
        }
        return resultater; // return resultater

    }

    public Superhero searchFor(String searchTerm) {
        return new Superhero();
    }


    */
}


