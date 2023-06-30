import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Prac07 {
    public ArrayList<Double> readFile(String fileName) {
        try {
            ArrayList<Double> list = new ArrayList<Double>();
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
        Prac07 p = new Prac07();
        ArrayList<Double> list1 = p.readFile("P07Data1.txt");
        ArrayList<Double> list2 = p.readFile("P07Data2.txt");

        ArrayList<Double> mergeList = new ArrayList<Double>();
        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < list1.size() && idx2 < list2.size()) {
            double d1 = list1.get(idx1);
            double d2 = list2.get(idx2);
            if (d1 >= d2) {
                mergeList.add(d1);
                idx1++;
            } else {
                mergeList.add(d2);
                idx2++;
            }
        }
        if (idx1 < list1.size()) {
            for (int i = idx1; i < list1.size(); i++) {
                mergeList.add(list1.get(i));
            }
        }
        if (idx2 < list2.size()) {
            for (int i = idx2; i < list2.size(); i++) {
                mergeList.add(list2.get(i));
            }
        }
        System.out.printf("size = %d\n", mergeList.size());
        for (Double d : mergeList) {
            System.out.print(d + " ");
        }
    }
}
