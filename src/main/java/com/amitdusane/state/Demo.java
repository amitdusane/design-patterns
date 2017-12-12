package com.amitdusane.state;

/**
 * The Class Demo.
 */
//Same object changes its behaviour(method output) depends on input
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
        Kid kid = new Kid(2);
        kid.getKidState().eat();
        kid.setAge(5); // Same object changes its behaviour(method output)
                       // depends on input
        kid.getKidState().eat();
    }

}
