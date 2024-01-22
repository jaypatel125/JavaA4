import java.util.Random;
//Author: Jay Patel, 000881881
public class Die {
    private int sides; // to define sides
    private int currentSide; // to define current side

    // new object
    public Die(int sides){
        this.sides = sides;
        Random random = new Random();
        this.currentSide =  random.nextInt(sides) + 1; // generates random number for current side
    }

    public int getSides() {
        return sides;
    } // get method for side

    public int getCurrentSide() {
        return currentSide;
    } // get method for current side

    public void roll(){
        Random random = new Random();
        currentSide = random.nextInt(sides) + 1;
    } // this method is to roll die (will create generate new random number)

    public String toString(){
        return ("Die with " + sides + " sides, currently showing: " + currentSide);
    }
} // toString method for class die