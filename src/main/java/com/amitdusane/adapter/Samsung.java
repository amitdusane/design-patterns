package com.amitdusane.adapter;

/**
 * The Class Samsung.
 */
public class Samsung implements Chargeable2
{

    /** The mobile name. */
    private String mobileName;

    /**
     * Instantiates a new samsung.
     *
     * @param mobileName the mobile name
     */
    public Samsung(String mobileName)
    {
        this.mobileName = mobileName;
    }

    public void setMobileName(String name)
    {
        mobileName = name;

    }

    public void performCharging()
    {
        System.out.println("Charging " + mobileName + " ...");

    }

}
