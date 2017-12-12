package com.amitdusane.adapter;

/**
 * The Class ChargerUtils.
 */
public final class ChargerUtils
{

    /**
     * Instantiates a new charger utils.
     */
    private ChargerUtils()
    {
        
    }
    
    /**
     * Charge.
     *
     * @param charger the charger
     */
    public static void charge(Chargeable1 charger)
    {
        charger.doCharge();
    }

}
