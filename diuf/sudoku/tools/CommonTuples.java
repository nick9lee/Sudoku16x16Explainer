/*
 * Project: Sudoku Explainer
 * Copyright (C) 2006-2007 Nicolas Juillerat
 * Available under the terms of the Lesser General Public License (LGPL)
 */
package diuf.sudoku.tools;

import java.util.*;

/**
 * Heart engine for the Naked Sets, Hidden Sets and N-Fishes rules.
 */
public interface CommonTuples {

	public static BitSet searchCommonTuple(BitSet[] candidates, int degree);
}
