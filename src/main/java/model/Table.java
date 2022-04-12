package inc.faregh.model;

import inc.faregh.model.modes.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Our game bord
 */
public class Table {

    /**
     * Width and Height of table
     */
    private final int w,h;

    /**
     * Standard table for game
     */
    private static Table STANDARD_TABLE;

    /**
     * contains all points of table
     */
    private final List<Point> points;

    /**
     * List of available fruits in game
     */
    private List<Fruit> fruits;

    /**
     * The snake that we play with it
     */
    private final Snake snake;

    /**
     * make a table
     * @param w {@link  Table#w}
     * @param h {@link Table#h}
     */
    public Table(int w, int h, Strategy strategy){
        this.w = w;
        this.h = h;
        this.snake = new Snake(strategy);
        // making points
        points = new ArrayList<>();
        for(int i = 0; i<w; i++){
            for(int j = 0; j<h; j++){
                points.add(new Point(i, j));
            }
        }
        //TODO make a fruit in fruits
    }

    /**
     * remove a special fruit
     * @param fruit target fruit
     * @see Table#fruits
     */
    public void removeFruit(Fruit fruit){
        fruits.remove(fruit);
    }

    /**
     * add a special fruit
     * @param fruit target fruit
     * @see Table#fruits
     */
    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }

    /*
      Standard table giving
      @return Standard mode table
     */
    //TODO make this method after view
    /*
    public synchronized static Table getStandardInstance(){
        return STANDARD_TABLE==null?new Table():STANDARD_TABLE;
    }
    */

    /**
     * @return {@link Table#points}
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     * @return {@link Table#fruits}
     */
    public List<Fruit> getFruits() {
        return fruits;
    }

    /**
     * @return {@link Table#snake}
     */
    public Snake getSnake() {
        return snake;
    }

    @Override
    public String toString() {
        return "w="+w+", h="+h+", fruits="+fruits.toString()+", snake="+snake;
    }

}
