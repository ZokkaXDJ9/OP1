import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortierenUndSuchen
{
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(100);

        bubblesort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.print("Bitte gesuchte Zahl eingeben: ");
        int gesucht = Integer.parseInt(scanner.nextLine());

        //int index = lineareSuche(arr, gesucht);
        int index = binäreSuche(arr, gesucht, 0, arr.length);
        //int index = binäreSucheIterativ(arr, gesucht);
        //int index = Arrays.binarySearch(arr, gesucht);
        System.out.println("Gefunden an Index " + index);

    }

    private static void bubblesort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    private static int lineareSuche(int[] arr, int gesucht)
    {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == gesucht)
                return i;

        return -1;
    }

    private static int binäreSuche(int[] arr, int gesucht, int start, int ende)
    {
        int mitte = start + (ende - start) / 2;

        if (arr[mitte] == gesucht)
            return mitte;
        else if (start == mitte || ende == mitte)
            return (mitte + 1) * -1;
        else
        {
            if (arr[mitte] > gesucht)
                return binäreSuche(arr, gesucht, start, mitte);
            else
                return binäreSuche(arr, gesucht, mitte, ende);
        }
    }

    private static int binäreSucheIterativ(int[] arr, int gesucht)
    {
        int links = 0;
        int rechts = arr.length - 1;

        while (links <= rechts)
        {
            int mitte = links + (rechts - links); // # Bereich halbieren
            if (arr[mitte] == gesucht)
                return mitte;

            if (arr[mitte] > gesucht)
                rechts = mitte - 1;  // im linken Abschnitt weitersuchen
            else
                links = mitte + 1;  //im rechten Abschnitt weitersuchen
        }

        return (links+1) * -1;
    }
}
