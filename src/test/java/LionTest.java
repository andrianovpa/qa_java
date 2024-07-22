import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest  {
@Mock
Feline feline;
    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
    Mockito.verify(feline).getKittens();
    }
    @Test
    public void testLionGetFood() throws  Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString());
    }
    @Test
    public void testLionDoesHaveManeException() {
        try {
            Lion lion = new Lion("Используйте допустимые значения пола животного - самец или самка", feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }


}
