package inc.faregh.model;

import java.util.Objects;

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
     * @param o the object to compare with us
     * @return If our position equals parameter position returns true
     * @see Point#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piece)) return false;

        Piece piece = (Piece) o;

        return Objects.equals(p, piece.p);
    }

    /**
     * @return a human-readable String to know the object values
     */
    @Override
    public String toString() {
        return "p="+p;
    }

}
