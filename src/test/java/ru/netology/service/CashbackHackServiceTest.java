package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void minimumValueTest() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        Assert.assertEquals(service.remain(amount), 100);
    }

    @Test
    public void testIsExactly1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        Assert.assertEquals(service.remain(amount), 0);
    }
}