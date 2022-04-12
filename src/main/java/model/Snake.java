package inc.faregh.model;

import java.util.List;

/**
 * We build this project for this class:)
 */
public class Snake {

    /**
     * Our strategy pattern
     */
    private final Strategy strategy;

    /**
     * Body of snake
     */
    private List<Body> body;

    /**
     * Snake's head
     */
    private final Body head;

    //TODO is this method really needed or we can do it when init??
    /**
     * Randomly make a snake head with special strategy patter
     * @param strategy our strategy to apply
     */
    public Snake(Strategy strategy){
        this.strategy = strategy;
        //TODO make a random head
        head=null;
    }

    /**
     * Create a snake with special head carouser
     * @param strategy our strategy pattern to apply
     * @param head the special head location
     */
    public Snake(Strategy strategy, Body head){
        this.strategy = strategy;
        this.head = head;
    }

    @Override
    public String toString(){
        return "Strategy: "+strategy+",\tHead: "+head+",\tBody: "+body.toString();
    }

}
