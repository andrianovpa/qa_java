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

@RunWith(Parameterized.class)

public class LionTest {
    private final String sexType;
    private final boolean expected;

    public LionTest(String sexType, boolean expected) {
        this.sexType = sexType;
        this.expected = expected;
    }
    @Spy
    Feline feline;
    @Parameterized.Parameters
        public static Object[][] getCredentials() {
            return new Object[][] {
                    {"Самец", true},
                    {"Самка", false}

            };
        }
        @Before
        public void setUp() {
            MockitoAnnotations.openMocks(this);
        }
    @Test
    public void testLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(sexType, feline);
        assertEquals(expected, lion.doesHaveMane());
    }
    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(sexType, feline);
        assertEquals(1, lion.getKittens());
    }
    @Test
    public void testLionGetFood() throws  Exception {
        Lion lion = new Lion(sexType, feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }


}
