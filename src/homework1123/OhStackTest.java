package homework1123;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dhgof_000 on 2016-11-23.
 */
public class OhStackTest {

    @Test
    public void testEmpty() {
        OhStack stack = new OhStack();

        assertTrue(stack.empty());

        stack.push("(");
        assertFalse(stack.empty());

        assertTrue(stack.peek() == "(");
        assertTrue(stack.pop() == "(");

        assertTrue(stack.empty());
    }




}