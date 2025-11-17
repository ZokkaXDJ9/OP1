/* Level 1

    Schreiben Sie ein Java-Programm, das die folgende Funktionalität implementiert:

    Erstellen Sie ein zweidimensionales Array (Matrix) der Größe 3x3, das die folgenden Werte enthält:

    1 2 3
    4 5 6
    7 8 9

    Implementieren Sie eine Methode printMatrix, die das zweidimensionale Array in einer gut lesbaren Form auf der Konsole ausgibt.

    Implementieren Sie eine Methode transposeMatrix, die die gegebene Matrix transponiert. Die Transposition einer Matrix bedeutet, dass die Zeilen und Spalten vertauscht werden.

    Geben Sie die transponierte Matrix mit Hilfe der printMatrix-Methode auf der Konsole aus.

    Hinweise:
    Die Transposition einer Matrix bedeutet, dass das Element an Position (i, j) in der ursprünglichen Matrix an die Position (j, i) in der transponierten Matrix verschoben wird.
    Achten Sie darauf, dass Ihre Methode transposeMatrix das ursprüngliche Array nicht verändert, sondern ein neues Array zurückgibt.

    Erwartete Ausgabe:

    Original Matrix:
    1 2 3
    4 5 6
    7 8 9

    Transposed Matrix:
    1 4 7
    2 5 8
    3 6 9

*/

package aufgaben;

public class Lösung_5
{
	public static void main(String[] args)
	{
		int[][] array =
		{
			{1,2,3,1},
			{4,5,6,2},
			{7,8,9,3},
			{7,4,1,0}
		};

		printMatrix(array);
		System.out.println();
		int[][] transposed = transposeMatrix2(array);
		printMatrix(transposed);
	}

	private static int[][] transposeMatrix(int[][] matrix)
	{
		int[][] transposed = copyMatrix(matrix);

		for (int i = 0; i < transposed.length; i++)
		{
			for (int j = i; j < transposed.length; j++)
			{
				int temp = transposed[j][i];
				transposed[j][i] = transposed[i][j];
				transposed[i][j] = temp;
			}
		}

		return transposed;
	}

	// einfacher:
	private static int[][] transposeMatrix2(int[][] matrix)
	{
		int[][] transposed = new int[matrix.length][matrix.length];

		for (int i = 0; i < transposed.length; i++)
		{
			for (int j = 0; j < transposed.length; j++)
			{
				transposed[j][i] = matrix[i][j];
			}
		}

		return transposed;
	}

	private static int[][] copyMatrix(int[][] matrix)
	{
		int[][] transposed = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++)
		{
			System.arraycopy(matrix[i], 0, transposed[i], 0, matrix.length);
		}
		return transposed;
	}

	private static void printMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
