import java.util.*;

import diuf.sudoku.*;
import diuf.sudoku.solver.*;
import diuf.sudoku.tools.*;

public class BugHintProducer{
	public static AbstractBugHintFactory getFactory(boolean isSimple) {
		if(isSimple)
			return new SimpleBugHintFactory();
		else
			return new ComplexBugHintFactory();
	}
}