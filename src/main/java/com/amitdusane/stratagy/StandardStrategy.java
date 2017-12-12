package com.amitdusane.stratagy;

/**
 * The Class StandardStratagy.
 */
public abstract class StandardStrategy implements Strategy
{

    /*
     * (non-Javadoc)
     * 
     * @see com.amitdusane.stratagy.Stratagy#execute()
     */
    public void execute()
    {
        doOne();
        doTwo();

    }

    /**
     * Do one.
     */
    public abstract void doOne();

    /**
     * Do two.
     */
    public abstract void doTwo();
}
