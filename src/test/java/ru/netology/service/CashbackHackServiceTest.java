package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void minimumValueTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        Assert.assertEquals(100, service.remain(amount));
    }

    @Test
    public void testIsExactly1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        Assert.assertEquals(0,service.remain(amount));
    }
}