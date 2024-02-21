package frogger;

import java.util.HashSet;
import java.util.Set;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final Set<FroggerID> records;

    public Records() {
        this.records = new HashSet<>();
    }

    /**
     * Adds a frogger's record.
     * 
     * @param froggerID the frogger's record to add
     * @return true if the record is added, else false.
     */
    public boolean addRecord(FroggerID froggerID) {
        return this.records.add(froggerID);
    }
}