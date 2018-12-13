package week3;


import Week3.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private  int first,second,exptected;
    Calculator cal;


    @Before
    public void setup(){
        cal=new Calculator();
    }
    @After // runs after every unit test
    public void tearDown(){

    }


    public CalculatorTest(int exptected,int first, int second ) {
        this.first = first;
        this.second = second;
        this.exptected = exptected;
    }

    @Parameterized.Parameters
    public static Collection<Object []> TestData(){
        Object [][] data=new Object[][]{
                {20,2,18},{7,-14,21},{-98,2,-100}};
        return Arrays.asList(data);
    }



    @Test
    public  void TestAdd(){
        Assert.assertEquals(this.exptected,this.cal.add(this.first,this.second));
    }
}
