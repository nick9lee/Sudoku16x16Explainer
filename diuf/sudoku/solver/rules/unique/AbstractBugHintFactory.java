import java.util.*;

import diuf.sudoku.*;
import diuf.sudoku.solver.*;
import diuf.sudoku.tools.*;

public abstract class AbstractBugHintFactory{
	public abstract BugHint getBugHing(IndirectHintProducer rule, Map<Cell, Bitset> removablePotentials,
            Cell[] cells1, int v1, Cell[] cells2, Map<Cell, BitSet> extraValues,
            BitSet allExtraValues, Grid.Region region);
            
    public intToBitSet(int v){
    	Bitset b = new BitSet();
    	int i = 0;
    	while(v != 0){
    		if(v %2 != 0)
    			b.set(i);
    		++i;
    		v = v >>> 1;
    	}
    	return b;
    }
}