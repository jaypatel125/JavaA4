//Author: Jay Patel, 000881881
class DiceCollection {
    private Die[] dice;

    public DiceCollection(int[]sides) {
        dice = new Die[sides.length];
        for (int i = 0; i < sides.length; i++ ) {
            dice[i] = new Die(sides[i]);
        }
    }

    // to get sum of current side of each dice
    public int getCurrentSum(){
        int sum = 0;
        for (Die die : dice) {
            sum += die.getCurrentSide();
        }
        return sum;
    }

    // to count minimum possible sum (total die)
    public int getMinPossibleSum() {
        int sum = 0;
        for (Die die : dice) {
            sum += 1;
        }
        return sum;
    }

    // to count maximum possible sum (sum of sides of each die)
    public int getMaxPossibleSum() {
        int sum = 0;
        for (Die die : dice) {
            sum += die.getSides();
        }
        return sum;
    }

    // to roll all die
    public void rollAll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    // histogram method
    public int[] histogram ( int num ) {
        int[] counts = new int[num];
            for (int i = 0; i < num; i++){
                rollAll();
                counts[getCurrentSum()]++; // to add count each time on one index. index location depends on current sum
            }
        return counts;
    }

    // tostring method for dicecollection
    public String toString(){

        String string = ("\nDice collection: \n");

        for (Die die : dice) {
            string += (die.toString() + "\n");
        }

        string += ("Current total sum: " + getCurrentSum() +
                "\nMinimum possible sum: " + getMinPossibleSum() +
                "\nMaximum possible sum: " + getMaxPossibleSum());

        return string;
    }

}
