
package diuf.sudoku.tools;

import java.util.*;

/**
 * Heart engine for the Naked Sets, Hidden Sets and N-Fishes rules.
 */
public class SetEngine {

	private CommpnTuples regular, light;
	
	public SetEngine(){
		this.regular = new CommonTuplesRegular();
		this.light = new CommonTuplesLight();
	}
	
	public BitSet searchRegular(BitSet[] candidates, int degree){
		return this.regular.searchCommonTuple(BitSet[] candidates, int degree);
	}
	
	public BitSet searchLight(BitSet[] candidates, int degree){
		return this.light.searchCommonTuple(BitSet[] candidates, int degree);
	}

}
