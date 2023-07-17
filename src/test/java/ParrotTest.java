import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParrotTest {

    private Parrot parrot;

    @BeforeEach
    public void setUp(){
        parrot  = new Parrot("Zazoo");
    }

    @Test
    public void canMakeNoise(){
        assertThat(parrot.makeNoise()).isEqualTo("Squawk!");
    }

    @Test
    public void canEat(){
        assertThat(parrot.eat()).isEqualTo("Mmmm, that was tasty!");
    }

}
