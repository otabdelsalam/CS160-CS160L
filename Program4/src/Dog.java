/** Hare class
 *   inherits from abstract Racer class
 */

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Dog extends Racer
{
    /** Default Constructor: calls Racer default constructor
     */
    public Dog( )
    {
        super( );
    }

    /** Constructor
     *    @param rID   racer Id, passed to Racer constructor
     *    @param rX    x position, passed to Racer constructor
     *    @param rY    y position, passed to Racer constructor
     */
    public Dog( String rID, int rX, int rY )
    {
        super( rID, rX, rY );
    }

    /** move:  calculates the new x position for the racer
     *   Hare move characteristics:  30% of the time, Hare jumps 5 pixels
     *                               70% of the time, Hare sleeps (no move)
     *   generates random number between 1 & 10
     *          for 1 - 7,  no change to x position
     *          for 8 - 10, x position is incremented by 5
     */
    public void move( )
    {
        Random rand = new Random( );
        int move =  rand.nextInt( 10 ) + 1 ;
        if(move == 1)
        {
            setX( getX( ));
        }
        else if(move < 3)
        {
            setX( getX( ) + move );
        }
        else if(move > 3 && move < 6)
        {
            setX((int) (getX( ) + move/2.5 ));
        }
        else if(move > 6 && move < 9)
        {
            setX((int) (getX( ) + move/3.5));
        }
        else
        {
            setX((int) (getX( ) + move/3.5));
        }

    }

    /** draw: draws the Hare at current (x, y) coordinate
     *   @param g   Graphics context
     */
    public void draw( Graphics g )
    {
        int startY = getY( );
        int startX = getX( );
        if(this.isWinner)
        {
            morph(g);
        }

        // tail
        g.setColor(new Color(165, 42, 42));
        g.fillOval( startX - 37, startY + 8,  16, 12 ) ;

        //body
        g.fillOval( startX - 30, startY,  20,  20 );

        //head
        g.fillOval( startX - 13, startY + 2, 13, 8 );
        g.fillOval( startX - 11, startY - 8, 10, 15 );
        g.setColor(Color.black);
        g.fillOval( startX - 7, startY + 4, 3, 3 );

        //legs
        g.setColor(new Color(165, 42, 42));
        g.fillOval(startX - 32, startY + 16,  9, 9 ) ;
        g.fillOval(startX - 21, startY + 16,  9, 9 ) ;
    }

    public void morph( Graphics g)
    {
        //When the dog wins, it will be given a red ball for its valiant efforts.
        int endY = getY( );
        int endX = getX( );
        g.setColor(Color.red);
        g.fillOval( endX - 5, endY+4, 15, 15 );


    }
}