package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] data = {-4, 11, 7, -12, 6, 1};

        System.out.println("Selection sort: ");
        selectionSort(data);
        System.out.println ("Bubble sort: ");
        bubbleSort (data);
    }

    static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int indSmallest = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[indSmallest])
                    indSmallest = j;
            swap(array, i, indSmallest);
            for (int a : array)
                System.out.print(a + " ");
            System.out.println ();
        }
    }

    static void bubbleSort(int[] array)
    {
        final int N = array.length;
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i <= N - 2; i++)
            {
                if (array[i] > array[i + 1])
                {
                    swap(array, i, i + 1);
                    changed = true;
                    for (int a : array)
                        System.out.print(a + " ");
                    System.out.println ();
                }
            }
        }
    }

    static void swap (int[] array, int ind1, int ind2)
    {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
