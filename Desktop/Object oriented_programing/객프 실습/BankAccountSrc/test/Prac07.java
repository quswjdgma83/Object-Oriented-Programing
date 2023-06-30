package test;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Prac07 {

    public ArrayList<Double> readFile(String fileName) {
        try{
            ArrayList<Double> list = new ArrayList<~>();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                line = line.trim();
                double d = Double.parseDouble(line);
                list.add(d);
                line = reader.readLine();
            }
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        prac07 p = new Prac07();
        ArrayList<Double> list1 = p.readFile("P07Data1.txt");
        ArrayList<Double> list2 = p.readFile("P07Data2.txt");

        ArrayList<Double> mergeList = new ArrayList<~>();
        int idx1 = 0;
        int idx2 = 0;

        while
    }
}