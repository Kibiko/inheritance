import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {

    private Zoo zoo;
    private Animal animal;

    @BeforeEach
    public void setUp(){
        zoo = new Zoo();
    }

    @Test
    public void canCountAnimals(){
        assertThat(zoo.countAnimals()).isEqualTo(0);
    }

    @Test
    public void canAddAnimal(){
        Animal donkey = new Lion("Simba",false);
        zoo.addAnimal(donkey);
        assertThat(zoo.countAnimals()).isEqualTo(1);
    }

    @Test
    public void canAddMultipleAnimals(){
        Animal parrot = new Parrot("Tooktook");
        Animal lioness = new Lion("Nala",false);
        zoo.addAnimal(parrot);
        zoo.addAnimal(lioness);
        assertThat(zoo.countAnimals()).isEqualTo(2);
    }

}
