package part6.part6b.part6.part6.b.todo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class todoTest {

     @Test
    public void todoInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, todo.removeTask());
    }
    
}
