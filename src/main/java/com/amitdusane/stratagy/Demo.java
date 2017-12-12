package com.amitdusane.stratagy;

import java.util.Arrays;
import java.util.List;

//Depending on instance execution strategy is decided

/**
 * The Class Demo.
 */
public final class Demo
{
    private Demo()
    {
       
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args)
    {

        List<Strategy> stratagies = Arrays.asList(new General(), new Standard());

        for (Strategy stratagy : stratagies) {
            stratagy.execute();
        }

    }
}
