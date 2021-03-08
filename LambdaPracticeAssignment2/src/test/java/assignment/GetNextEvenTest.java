package assignment;

import org.junit.Assert;
import org.junit.Test;



public class GetNextEvenTest {

   GetNextEvenImpl obj = new GetNextEvenImpl();

    @Test
    public  void test1()
    {

        long actual=obj.get.getEven(8795467);
        long expected=8795468;
        Assert.assertEquals(expected,actual);


    }



    @Test
    public  void test2()
    {

        long actual=obj.get.getEven(87641906753L);
        long expected=87641906754L;
        Assert.assertEquals(expected,actual);

    }

    /////Negative Test case as expected output will be 879656
    @Test
    public  void test3()
    {

        long actual=obj.get.getEven(879654);
        long expected=879655;


        Assert.assertNotEquals(expected,actual);


    }



}