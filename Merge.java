import java.util.Arrays;

/**
 * @author Xavier Sherman
 *
 */
public class Merge {

	static int comparisons;

	public static <T extends Comparable<? super T>> void sort(T[] a) {

		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Comparable<?>[a.length];
		comparisons = 0;
		mergeSort(a, tempArray, 0, a.length - 1);
	}

	private static <T extends Comparable<? super T>> void mergeSort(T[] a, T[] tempArray, int first, int last) {

		if (first < last) {

			int mid = (first + last) / 2;

			mergeSort(a, tempArray, first, mid);
			mergeSort(a, tempArray, mid + 1, last);
			merge(a, tempArray, first, mid, last);

		}

	}

	private static <T extends Comparable<? super T>> void merge(T[] a, T[] tempArray, int first, int mid, int last) {

		int beginFirstHalf = first;
		int endFirstHalf = mid;
		int beginSecondHalf = mid + 1;
		int endSecondHalf = last;

		int index = first;
		while ((beginFirstHalf <= endFirstHalf) && (beginSecondHalf <= endSecondHalf)) {

			if (a[beginFirstHalf].compareTo(a[beginSecondHalf]) <= 0) {

				tempArray[index] = a[beginFirstHalf];
				beginFirstHalf++;
				comparisons++;

			} else {

				tempArray[index] = a[beginSecondHalf];
				beginSecondHalf++;
				comparisons++;

			}

			index++;
		}

		if (beginFirstHalf > endFirstHalf) {
			copyOf(a, tempArray, beginSecondHalf, endSecondHalf, index, last);
		} else if (beginSecondHalf > endSecondHalf) {
			copyOf(a, tempArray, beginFirstHalf, endFirstHalf, index, last);
		}

		for (int i = first; i <= last; i++)
			a[i] = tempArray[i];

	}

	/**
	 * Copies all contents of original starting at original[originalStartIndex] to
	 * original[originalEndIndex] into destination starting at
	 * destination[destinationIndex] to destination[destinationEndIndex]
	 * 
	 * @param original
	 * @param destination
	 * @param originalIndex
	 * @param destinationIndex
	 */
	private static <T extends Comparable<? super T>> void copyOf(T[] original, T[] destination, int originalStartIndex,
			int originalEndIndex, int destinationStartIndex, int destinationEndIndex) {

		if (original.length > destination.length)
			throw new IllegalArgumentException("original[].length > destination[].length");

		// Copies swapped contents into tempArray[].
		while ((originalStartIndex <= originalEndIndex) && (destinationStartIndex <= destinationEndIndex)) {

			destination[destinationStartIndex++] = original[originalStartIndex++];

		}

		originalStartIndex += 1;
		// Copies remaining entries from a[] into tempArray[].
		while ((originalStartIndex < original.length) && (destinationStartIndex < destination.length)) {

			destination[destinationStartIndex++] = original[originalStartIndex++];

		}

	}

}
