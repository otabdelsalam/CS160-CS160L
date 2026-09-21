/** Hare class
 *   inherits from abstract Racer class
 */

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Snake extends Racer
{
    /** Default Constructor: calls Racer default constructor
     */
    public Snake( )
    {
        super( );
    }

    /** Constructor
     *    @param rID   racer Id, passed to Racer constructor
     *    @param rX    x position, passed to Racer constructor
     *    @param rY    y position, passed to Racer constructor
     */
    public Snake(String rID, int rX, int rY )
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
        if(move > 5)
        {
            setX(getX() + 3);
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
        // body
        g.setColor( Color.GREEN );
        g.fillOval( startX - 37, startY + 4,  40, 12 ) ;

        //eye
        g.setColor( Color.BLACK );
        g.fillOval( startX - 5, startY  + 3,  5, 5 ) ;

        //tongue
        g.setColor(Color.RED);
        g.fillOval( startX - 1, startY + 7,  10, 5 ) ;


    }

    @Override
    public void morph( Graphics g)
    {
        //When the snake wins, its eyes will widen and tongue will grow extremely long, like McQueen in the Cars movie.
        int endX = getX( );
        int endY = getY( );
        g.setColor( Color.BLACK );
        g.fillOval( endX - 5, endY  - 1,  10, 10 ) ;
        g.setColor( Color.RED );
        g.fillOval( endX - 1, endY + 7,  50, 5 ) ;

    }
}