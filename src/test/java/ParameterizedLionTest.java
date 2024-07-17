import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {
    private final String sexType;
    private final boolean expected;
    public ParameterizedLionTest(String sexType, boolean expected) {
        this.sexType = sexType;
        this.expected = expected;
    }
    @Spy
    Feline feline;
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}

        };
    }
    @Test
    public void testLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(sexType, feline);
        assertEquals(expected, lion.doesHaveMane());
    }

}
