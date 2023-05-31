abstract class Dog implements Moveable {
    protected int position;
    protected int averageLength;
    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract public void move();

    abstract void describe();
}
