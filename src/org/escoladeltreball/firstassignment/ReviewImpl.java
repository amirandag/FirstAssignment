/**
 * 
 */
package org.escoladeltreball.firstassignment;

/**
 * @author Pep Méndez
 *
 */
public final class ReviewImpl implements Review {

	
	
	/**
	 * 
	 * @param values and array of unordered integers
	 * @param n the value to check out
	 * @return the frequency of n in values
	 */
	private int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.escoladeltreball.firstassignment.Utils#frequencyPercentage(int[],
	 * int)
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		return values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Utils#merge(int[], int)
	 */
	@Override
	public int[] merge(int[] values, int n) {
		int[] nMerged = new int[values.length + 1];
		int i = 0;
		while (i < values.length && values[i] <= n) {
			nMerged[i] = values[i];
			i++;
		}
		nMerged[i] = n;
		for (int j = i; j < values.length; j++) {
			nMerged[j + 1] = values[j];
		}
		return nMerged;
	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and
	 * row 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	@Override
	public int[][] split(int[] values) {
		return null;
	}

}
