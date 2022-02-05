import static org.junit.Assert.assertEquals;

import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testDemo() {
        assertEquals(11, SkillDemo.strLength("hello", "Hello!"));
    }
}
