import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void testFelineEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        System.out.println("Ожидаемое значение" + expected);
        System.out.println("Ожидаемое значение" + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testFelineGetKittens() throws Exception {
        int expectedKittens = 3;
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(expectedKittens);
        int actualKittens = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        assertEquals(expectedKittens, actualKittens);
    }
    @Test public void testFelineGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }
}
