package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldReturn999IfAmount1() {
        int amount = 1;
        int actual = cashback.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1IfAmount999() {
        int amount = 999;
        int actual = cashback.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000IfAmount0() {
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmount1001() {
        int amount = 1001;
        int actual = cashback.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmount1500() {
        int amount = 1500;
        int actual = cashback.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> cashback.remain(0));
}