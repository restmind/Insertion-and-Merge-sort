package com.company;

import com.company.manager.CombineManager;
import com.company.model.Combine;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {

    public static void main(String[] args) throws IOException {
        // открываем файл
        BufferedReader reader = new BufferedReader(new FileReader(
                "/Users/orest/IdeaProjects/Lab1/src/com/company/combines.csv"));

        // считываем построчно
        String line;
        //Scanner scanner = null;
        int index = 0, i = 0;
        Combine[] combines = new Combine[5];

        while ((line = reader.readLine()) != null) {
            Combine combine = new Combine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    combine.setModel(data);
                else if (index == 1)
                    combine.setCapacityOfGrainInKg(parseInt(data));
                else if (index == 2)
                    combine.setFuelConsumptionOnOneHectare(parseInt(data));
                else if (index == 3)
                    combine.setEnginePowerInHorsePower(parseInt(data));
                else
                    System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            combines[i++] = combine;
        }

        //закрываем наш ридер
        reader.close();

        for (Combine combine: combines) {
            System.out.println(combine.toString());
        }


        CombineManager combineManager = new CombineManager();
        combineManager.sortByCapacityOfGrainInKgASC(combines);
        System.out.println("--------INSERTION SORT-----------");
        for (Combine combine: combines) {
            System.out.println(combine.toString());
        }
        combineManager.sortByEnginePowerInHorsePowerDESC(combines);
        System.out.println("------------MERGE SORT-------");
        for (Combine combine: combines) {
            System.out.println(combine.toString());
        }
    }
}
