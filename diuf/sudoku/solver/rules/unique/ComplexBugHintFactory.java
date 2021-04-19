import java.util.*;

import diuf.sudoku.*;
import diuf.sudoku.solver.*;
import diuf.sudoku.tools.*;

public class ComplexBugHintFactory extends AbstractBugHintFactory{
	@Override
	publid BugHint getBugHint(int type, IndirectHintProducer rule, Map<Cell, Bitset> removablePotentials,
            Cell[] cells1, int v1, Cell[] cells2, Map<Cell, BitSet> extraValues,
            BitSet allExtraValues, Grid.Region region) {
		if (type == 3)
			return new Bug1Hint(rule, removablePotentials, cells1, cells2, extraValues, allExtraValues, intToBitSet(v1), region);
		else if (type == 4)
			return new Bug2Hint(rule, removablePotentials, cells1[0], cells2[0], extraValues, allExtraValues, v1, region);
		else
			return null;
	}
}