package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareArray {

	// centrale locatie size
	private int size = 5;
	private int[][] array2d = new int[size][size];
	private List<Integer> solutions = new ArrayList<>();
	private int numberOfSolutions;

	// methode uit StackOverflow
	public void permutingArray(List<Integer> arrayList, int element) {
		for (int i = element; i < arrayList.size(); i++) {
			java.util.Collections.swap(arrayList, i, element);
			permutingArray(arrayList, element + 1);
			java.util.Collections.swap(arrayList, element, i);
		}
		if (element == arrayList.size() - 1) {
			addSolution(arrayList);
			System.out.println(numberOfSolutions);
		}
	}

	// voegt som toe aan solution list
	public void addSolution(List<Integer> list) {
		int solution = 0;

		for (int i = 0; i < list.size(); i++) {
			int j = list.get(i);
			int value = array2d[i][j];
			solution += value;
		}

		solutions.add(solution);
	}

	// voorbeeldoplossing met array size = 5
	{
		array2d[0][0] = 7;
		array2d[0][1] = 53;
		array2d[0][2] = 183;
		array2d[0][3] = 439;
		array2d[0][4] = 863;
		array2d[1][0] = 497;
		array2d[1][1] = 383;
		array2d[1][2] = 563;
		array2d[1][3] = 79;
		array2d[1][4] = 973;
		array2d[2][0] = 287;
		array2d[2][1] = 63;
		array2d[2][2] = 343;
		array2d[2][3] = 169;
		array2d[2][4] = 583;
		array2d[3][0] = 627;
		array2d[3][1] = 343;
		array2d[3][2] = 773;
		array2d[3][3] = 959;
		array2d[3][4] = 943;
		array2d[4][0] = 767;
		array2d[4][1] = 473;
		array2d[4][2] = 103;
		array2d[4][3] = 699;
		array2d[4][4] = 303;
	}
}
