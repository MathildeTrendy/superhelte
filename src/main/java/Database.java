import java.security.PrivateKey;
import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superhero = new ArrayList<>();

    public void createSuperhero(String heltenavn, String ægtenavn, int årstal, String superkraft, boolean human){

        Superhero hero = new Superhero(heltenavn, ægtenavn, årstal, superkraft, human);

superhero.add(hero);

    }
}










