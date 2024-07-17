import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

import static org.junit.Assert.assertEquals;



public class LionTest {

    @Spy
    Lion lion;


        @Before
        public void setUp() {
            MockitoAnnotations.openMocks(this);
        }

    @Test
    public void testGetKittens() throws Exception {
        assertEquals(1, lion.getKittens());
    }
    @Test
    public void testLionGetFood() throws  Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }


}
