package com.amitdusane.adapter;

/**
 * The Class SampsungAdapter.
 */
public class SampsungAdapter implements Chargeable1
{

    /** The samsung. */
    private Chargeable2 samsung;

    /**
     * Instantiates a new sampsung adapter.
     *
     * @param samsung the samsung
     */
    public SampsungAdapter(Chargeable2 samsung)
    {
        this.samsung = samsung;
    }

    /* (non-Javadoc)
     * @see com.amitdusane.adapter.Chargeable1#setMobileName(java.lang.String)
     */
    public void setMobileName(String name)
    {
        // Do nothing.

    }

    /* (non-Javadoc)
     * @see com.amitdusane.adapter.Chargeable1#doCharge()
     */
    public void doCharge()
    {
        samsung.performCharging();
    }

}
