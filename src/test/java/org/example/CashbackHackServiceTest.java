package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn999From1() {
        CashbackHackServic service = new CashbackHackServic();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500From500() {
        CashbackHackServic service = new CashbackHackServic();
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1From999() {
        CashbackHackServic service = new CashbackHackServic();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0From1000() {
        CashbackHackServic service = new CashbackHackServic();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn99From1001() {
        CashbackHackServic service = new CashbackHackServic();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0From2000() {
        CashbackHackServic service = new CashbackHackServic();
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}