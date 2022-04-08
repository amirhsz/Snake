package inc.faregh.model;
//TODO
/**
 * it can be {@link inc.faregh.model.Fruit} or Body
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

}
