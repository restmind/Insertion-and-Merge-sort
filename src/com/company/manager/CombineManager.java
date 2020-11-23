package com.company.manager;

import com.company.model.Combine;

public class CombineManager {

    //Insertion Sort
    public void sortByCapacityOfGrainInKgASC(Combine[] arrayOfCombines) {
        for (int iteration = 1; iteration < arrayOfCombines.length; iteration++) {
            Combine selectedItem = arrayOfCombines[iteration];
            int comparativeItem = iteration - 1;
            for( ;(comparativeItem >= 0) && (arrayOfCombines[comparativeItem].capacityOfGrainInKg > selectedItem.capacityOfGrainInKg); comparativeItem--) {
                arrayOfCombines[comparativeItem+1] = arrayOfCombines[comparativeItem];
            }
            arrayOfCombines[comparativeItem+1] = selectedItem;
        }
    }

    //Merge Sort
    public void sortByEnginePowerInHorsePowerDESC(Combine[] arrayOfCombines) {
        int length = arrayOfCombines.length;
        if (length <= 1) {
            return;
        }
        int middle = length / 2;

        Combine [] left = new Combine[middle];
        Combine [] right = new Combine[length - middle];

        for (int i=0; i < left.length; i++)
        {
            left[i] = arrayOfCombines[i];
        }
        for (int j=0; j < right.length; j++)
        {
            right[j] = arrayOfCombines[j + left.length];
        }
        sortByEnginePowerInHorsePowerDESC(left);
        sortByEnginePowerInHorsePowerDESC(right);

        merge(arrayOfCombines, left, right);
    }

    public static void merge(Combine[] sortedArrayOfCombines, Combine[] left, Combine[] right) {
        int leftIterator = 0, rightIterator = 0, iterator = 0;

        while (leftIterator < left.length && rightIterator < right.length)
            sortedArrayOfCombines[iterator++] = left[leftIterator].enginePowerInHorsePower>=right[rightIterator].enginePowerInHorsePower?
                    left[leftIterator++] : right[rightIterator++];

        while (leftIterator < left.length)
            sortedArrayOfCombines[iterator++] = left[leftIterator++];

        while (rightIterator < right.length)
            sortedArrayOfCombines[iterator++] = right[rightIterator++];

    }
}
