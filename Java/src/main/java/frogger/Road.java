package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    /**
     * Checks if the position is occupied.
     *
     * @param position position to check
     * @return true if the position is occupied, else false.
     */
    public boolean isOccupied(int position) {
        return this.occupied[position];
    }

    /**
     * Checks if the position is valid.
     *
     * @param position position to check
     * @return true if the position is valid, else false.
     */
    public boolean isValid(int position) {
        if (position < 0) return false;
        return position < this.occupied.length;
    }

    public boolean[] getOccupied() {
        return this.occupied;
    }
}
