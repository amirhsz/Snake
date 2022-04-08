package inc.faregh.model;

/**
 * this class uses to know an object's position
 */
public class Point {

    /**
     * location of this object
     */
    private int x,y;

    /**
     * constructor
     * @param x X of our object
     * @param y Y of our object
     * @see Point#x
     * @see Point#y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * get X
     * @return X of our object
     * @see Point#x
     */
    public int getX() {
        return x;
    }

    /**
     * set X value of our object
     * @param x new X of our object
     * @see Point#x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * get Y
     * @return Y of our object
     * @see Point#y
     */
    public int getY() {
        return y;
    }

    /**
     * set Y value of our object
     * @param y new Y of our object
     * @see Point#y
     */
    public void setY(int y) {
        this.y = y;
    }

}
