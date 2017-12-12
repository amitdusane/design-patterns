package com.amitdusane.state;

/**
 * The Class Kid.
 */
public class Kid
{
    
    /** The age. */
    private int age;
    
    /** The kid state. */
    private KidState kidState = null;

    /**
     * Instantiates a new kid.
     *
     * @param age the age
     */
    public Kid(int age)
    {
        setAge(age);
    }

    /**
     * Gets the age.
     *
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Sets the age.
     *
     * @param age the new age
     */
    public void setAge(int age)
    {
        this.age = age;
        if (age == 1) {
            setKidState(new FirstYearKid());
        }
        if (age == 2) {
            setKidState(new SecondYearKid());
        }
        if (age == 3) {
            setKidState(new ThirdYearKid());
        }
        if (age > 3) {
            setKidState(new AnyYearKid());
        }
    }

    /**
     * Gets the kid state.
     *
     * @return the kid state
     */
    public KidState getKidState()
    {
        return kidState;
    }

    /**
     * Sets the kid state.
     *
     * @param kidState the new kid state
     */
    public void setKidState(KidState kidState)
    {
        this.kidState = kidState;
    }
}
