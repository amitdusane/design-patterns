package com.amitdusane.adapter;

/**
 * The Class Apple.
 */
public class Apple implements Chargeable1
{

    /** The mobile name. */
    private String mobileName;

    /**
     * Instantiates a new apple.
     *
     * @param mobileName the mobile name
     */
    public Apple(String mobileName)
    {
        this.mobileName = mobileName;
    }

    /* (non-Javadoc)
     * @see com.amitdusane.adapter.Chargeable1#setMobileName(java.lang.String)
     */
    public void setMobileName(String name)
    {
        mobileName = name;

    }

    /* (non-Javadoc)
     * @see com.amitdusane.adapter.Chargeable1#doCharge()
     */
    public void doCharge()
    {
        System.out.println("Charging " + mobileName + " ....");
    }

}
