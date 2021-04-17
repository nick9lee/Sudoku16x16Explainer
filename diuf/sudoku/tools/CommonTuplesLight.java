
package diuf.sudoku.tools;

import java.util.*;


public class CommonTuplesLight {

    public BitSet searchCommonTuple(BitSet[] candidates, int degree) {
        BitSet result = new BitSet(16);
        for (BitSet candidate : candidates) {
            result.or(candidate);
            if (candidate.cardinality() == 0)
                return null;
        }
        if (result.cardinality() == degree)
            return result;
        return null;
    }

}
