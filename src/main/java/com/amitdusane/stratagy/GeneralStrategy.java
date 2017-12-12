package com.amitdusane.stratagy;

/**
 * The Class GeneralStratagy.
 */
public abstract class GeneralStrategy implements Strategy
{

    /*
     * (non-Javadoc)
     * 
     * @see com.amitdusane.stratagy.Stratagy#execute()
     */
    public void execute()
    {
        dothis();
        dothat();
        dosomething();

    }

    /**
     * Dothis.
     */
    public abstract void dothis();

    /**
     * Dothat.
     */
    public abstract void dothat();

    /**
     * Dosomething.
     */
    public abstract void dosomething();

}
