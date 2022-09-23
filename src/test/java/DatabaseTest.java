import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest
{


    @Test
    void createSuperhero()
    {
        //Arrange
        Database database = new Database();
        //Act
        database.createSuperhero("Batman", "Tom", 2321, "ingenting", true);
        ArrayList<Superhero> results = database.getSuperheroes();
        int actualSize = results.size();
        int expectedSize = 1;
        //Assert
        assertEquals(actualSize, expectedSize);
    }
}

