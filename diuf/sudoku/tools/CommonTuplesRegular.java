
package diuf.sudoku.tools;

import java.util.*;


public class CommonTuplesRegular implements CommonTuples {

    public BitSet searchCommonTuple(BitSet[] candidates, int degree) {
        BitSet result = new BitSet(16);
        for (BitSet candidate : candidates) {
            if (candidate.cardinality() <= 1)
                return null;
            result.or(candidate);
        }
        if (result.cardinality() == degree)
            return result;
        return null;
    }

}
