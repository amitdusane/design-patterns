package com.amitdusane.stratagy;

/**
 * The Class Standard.
 */
public class Standard extends StandardStrategy
{

    /* (non-Javadoc)
     * @see com.amitdusane.stratagy.StandardStratagy#doOne()
     */
    @Override
    public void doOne()
    {
        System.out.println("Do One executed");

    }

    /* (non-Javadoc)
     * @see com.amitdusane.stratagy.StandardStratagy#doTwo()
     */
    @Override
    public void doTwo()
    {
        System.out.println("Do Two executed");

    }

}
