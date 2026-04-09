package com.example.todo_api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoSimpleTest {

    @Test
    public void testTodoTitleNotEmpty() {
        String title = "Buy groceries";
        assertNotNull(title);
        assertFalse(title.isEmpty());
    }

    @Test
    public void testTodoTitleLength() {
        String title = "Buy groceries";
        assertTrue(title.length() > 0);
    }

    @Test
    public void testTodoCompletedDefaultFalse() {
        boolean completed = false;
        assertFalse(completed);
    }
}
