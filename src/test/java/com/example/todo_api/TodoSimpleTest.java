package com.example.todo_api;

import com.claykab.todo_api.todo.Todo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoSimpleTest {

    private Todo todo;

    @BeforeEach
    public void setUp() {
        todo = new Todo();
        todo.setTodoId(1L);
        todo.setTodoTitle("Buy groceries");
        todo.setTodoDescription("Buy milk and eggs");
        todo.setComplete(false);
    }

    @Test
    public void testTodoTitleNotEmpty() {
        assertNotNull(todo.getTodoTitle());
        assertFalse(todo.getTodoTitle().isEmpty());
    }

    @Test
    public void testTodoDescriptionNotEmpty() {
        assertNotNull(todo.getTodoDescription());
        assertFalse(todo.getTodoDescription().isEmpty());
    }

    @Test
    public void testTodoCompletedDefaultFalse() {
        assertFalse(todo.isComplete());
    }

    @Test
    public void testTodoSetComplete() {
        todo.setComplete(true);
        assertTrue(todo.isComplete());
    }

    @Test
    public void testTodoId() {
        assertEquals(1L, todo.getTodoId());
    }

    @Test
    public void testTodoTitleValue() {
        assertEquals("Buy groceries", todo.getTodoTitle());
    }
}
