package by.belarusian.farmer.utils;

import by.belarusian.farmer.model.Harvest;
import by.belarusian.farmer.model.fruits.Apple;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class PrintUtil {
    public static void print(List<Harvest> list) {
        for (Harvest i : list) {
            String string = i.getType().getRusName();
            string = string + " - " + i.getClass().getSimpleName() + " " + i.getWeight() + " грамм, цвет - " + i.getColor();
            System.out.println(string);
            try (FileWriter writer = new FileWriter("src/by/belarusian/farmer/log/log.txt", true)) {
                writer.write(string);
                writer.append('\n');
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileWriter writer = new FileWriter("src/by/belarusian/farmer/log/log.txt", true)) {
            Date now = new Date();
            writer.write(now.toString());
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

