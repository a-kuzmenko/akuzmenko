package com.it;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by UITS-Admin on 24.02.2019.
 */
public class MyTest {
    @DataProvider(name = "Pay")
    public static Object[][] Pay() {
        return new Object[][]{{new Pay1()},{new Pay2()},{new Pay3()},{new Pay4()}};

    }

    @Test(dataProvider = "Pay")
    public void test1(Pay pay) {
        System.out.println("select goods");
        pay.pay();
        System.out.println("check goods");
    }
}
