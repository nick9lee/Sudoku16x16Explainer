import java.util.*;

import diuf.sudoku.*;
import diuf.sudoku.solver.*;
import diuf.sudoku.tools.*;

public class SimpleBugHintFactory extends AbstractBugHintFactory{
	@Override
	publid BugHint getBugHint(int type, IndirectHintProducer rule, Map<Cell, Bitset> removablePotentials,
            Cell[] cells1, int v1, Cell[] cells2 = null, Map<Cell, BitSet> extraValues = null,
            BitSet allExtraValues = null, Grid.Region region = null) {
		if (type == 1)
			return new Bug1Hint(rule, removablePotentials, cells1[0], intToBitSet(v1));
		else if (type == 2)
			return new Bug2Hint(rule, removablePotentials, cells1, v1);
		else
			return null;
	}
}