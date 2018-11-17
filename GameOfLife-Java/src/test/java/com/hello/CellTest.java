package com.hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void test_is_dead() {
        Cell cell = new Cell();
        assertFalse(cell.isAlive);
    }

    @Test
    public void test_reproduct() {
        Cell cell = new Cell();
        cell.reproduct();
        assertTrue(cell.isAlive);

    }
}