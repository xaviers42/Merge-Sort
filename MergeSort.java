import java.util.Random;

/**
 * @author Xavier Sherman
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] array = { "C", "B", "A", "T", "W", "U", "P", "X", "Y", "Z", "V" };
		System.out.println("unsorted: \t");
		printArray(array);
		System.out.println();

		Merge.sort(array);
		System.out.println("sorted: \t");
		printArray(array);
		System.out.println("comparisons = " + Merge.comparisons);

		Random randomGen = new Random();
		
		Integer[] tenThousandArray = new Integer[10000];
		int index = 0;
		while (index < tenThousandArray.length) {

			tenThousandArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(tenThousandArray);
		System.out.println();
		System.out.println("comparisons for 10,000 = " + Merge.comparisons);

		Integer[] fiftyThousandArray = new Integer[10000];
		index = 0;
		while (index < fiftyThousandArray.length) {

			fiftyThousandArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(fiftyThousandArray);
		System.out.println();
		System.out.println("comparisons for 50,000 = " + Merge.comparisons);

		Integer[] oneHundredThousandArray = new Integer[10000];
		index = 0;
		while (index < oneHundredThousandArray.length) {

			oneHundredThousandArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(oneHundredThousandArray);
		System.out.println();
		System.out.println("comparisons for 100,000 = " + Merge.comparisons);

		Integer[] fiveHundredThousandArray = new Integer[10000];
		index = 0;
		while (index < fiveHundredThousandArray.length) {

			fiveHundredThousandArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(fiveHundredThousandArray);
		System.out.println();
		System.out.println("comparisons for 500,000 = " + Merge.comparisons);

		Integer[] oneMillionArray = new Integer[10000];
		index = 0;
		while (index < oneMillionArray.length) {

			oneMillionArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(oneMillionArray);
		System.out.println();
		System.out.println("comparisons for 1,000,000 = " + Merge.comparisons);

		Integer[] fiveMillionArray = new Integer[10000];
		index = 0;
		while (index < fiveMillionArray.length) {

			fiveMillionArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(fiveMillionArray);
		System.out.println();
		System.out.println("comparisons for 5,000,000 = " + Merge.comparisons);

		Integer[] tenMillionArray = new Integer[10000];
		index = 0;
		while (index < tenMillionArray.length) {

			tenMillionArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(tenMillionArray);
		System.out.println();
		System.out.println("comparisons for 10,000,000 = " + Merge.comparisons);

		Integer[] twentyMillionArray = new Integer[10000];
		index = 0;
		while (index < twentyMillionArray.length) {

			twentyMillionArray[index] = randomGen.nextInt();
			index++;

		}

		Merge.sort(twentyMillionArray);
		System.out.println();
		System.out.println("comparisons 20,000,000 = " + Merge.comparisons);

	}

	public static <T> void printArray(T[] array) {

		int index = 0;
		while (index < array.length) {

			System.out.println(array[index]);
			index++;

		}

	}

}
