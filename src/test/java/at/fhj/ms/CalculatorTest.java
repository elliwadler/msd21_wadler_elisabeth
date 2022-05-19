package at.fhj.ms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

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
        Assertions.assertEquals(5*3.25, calc.multiply(5, 3.25),0.001);}

    @Test
    public void calcDivideTest1(){
        Assertions.assertEquals(1, calc.divide(5, 5));
    }

    @Test
    public void calcDivideTest2(){
        Assertions.assertEquals(15/4.0, calc.divide(15, 4), 0.001);}

    @Test
    public void calcDivideTest3(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });
    }


    @Test
    public void calcFacultyTest1(){
        Assertions.assertEquals(120, calc.faculty(5));}

    @Test
    public void calcFacultyTest2(){
        Assertions.assertEquals(1, calc.faculty(0));
    }

    @Test
    public void calcFacultyTest3(){
        Assertions.assertEquals(0, calc.faculty(-3));}
}
