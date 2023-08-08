package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @author https://www.linkedin.com/in/fatihmcicek/
 * Unit test for simple App.
 */
public class AppTest {
    App app = new App();
    int number1 = 3;
    int number2 = 5;

    @Test
    public void AddTest() {
        int addResult = app.Add(number1, number2);
        Assert.assertEquals(8, addResult);
        System.out.println("This is not equal!");

    }

    @Test
    public void SubtractTest() {
        int SubResult = app.Subtract(number2, number1);
        Assert.assertEquals(2, SubResult);
    }

    @Test
    public void MultiplyTest() {
        int MultipResult = app.Multiply(number2, number1);
        Assert.assertEquals(15, MultipResult);
    }

    @Test
    public void mainTest() {
        App app = new App();
        App.main(new String[]{"arg1", "arg2"});
    }
}