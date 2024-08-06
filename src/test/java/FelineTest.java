import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {


    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void testFelineGetKittens() throws Exception {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
    @Test public void testFelineGetFamily() {
        Feline feline = new Feline();
      assertEquals("Кошачьи", feline.getFamily());
    }
}
