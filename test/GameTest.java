package model;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class GameTest {
    private GameTest expert;
    
    public GameTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        expert = new Game();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetWtypesSwords() {
        List advice = expert.getWtypes("Swords");
        
        String expected = "Straight Sword";
        assertEquals(expected, advice.get(0).toString());
        expected = "Katana";
        assertEquals(expected, advice.get(1).toString());
        expected = "Scimitar";
        assertEquals(expected, advice.get(2).toString());
    }
}
