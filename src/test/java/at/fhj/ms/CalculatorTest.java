package at.fhj.ms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    @Test
    public void calcAddTest1(){
        Assertions.assertEquals(8, calc.add(5, 3.0));
    }

    @Test
    public void calcAddTest2(){
        Assertions.assertEquals(5+3, calc.add(5, 3));}

    @Test
    public void calcMinusTest1(){
        Assertions.assertEquals(2, calc.minus(5, 3.0));
    }

    @Test
    public void calcMinusTest2(){
        Assertions.assertEquals(5-3, calc.minus(5, 3));}

    @Test
    public void calcMultiplyTest1(){
        Assertions.assertEquals(0, calc.multiply(5, 0));
    }

    @Test
    public void calcMultiplyTest2(){
        Assertions.assertEquals(5*3, calc.multiply(5, 3));}

    @Test
    public void calcDivideTest1(){
        Assertions.assertEquals(1, calc.divide(5, 5));
    }

    @Test
    public void calcDivideTest2(){
        Assertions.assertEquals(15/3, calc.divide(15, 3));}
}
