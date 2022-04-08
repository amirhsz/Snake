package inc.faregh.model;

/**
 * it can be {@link Fruit} or {@link Body}
 */
public abstract class Piece {

    /**
     * location of our object
     */
    protected Point p;

    /**
     * make Piece(fruit or body) with a known position
     * @param p location of object
     * @see Piece#p
     */
    public Piece(Point p) {
        this.p = p;
    }

    /**
     * get position of our object
     * @return p
     * @see Piece#p
     */
    public Point getP() {
        return p;
    }

    /**
     * set new value for p
     * @param p new position for our object
     * @see Piece#p
     */
    public void setP(Point p) {
        this.p = p;
    }

    /**
     * @return a human-readable String to know the object values
     */
    @Override
    public String toString() {
        return "p="+p;
    }

}
