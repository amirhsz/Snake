package inc.faregh.model;

/**
 * our game mode
 * we will add test case for subclasses
 */
public abstract class Strategy {

    //TODO add our table instance

    /**
     * Execution of a direction and commit changes on table's snake
     * @param d where we want to go
     */
    abstract void Execute(Direction d);

}
