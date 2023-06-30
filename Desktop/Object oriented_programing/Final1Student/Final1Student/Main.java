//201810879 변정흠

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map<K, V>;

public class Main {
    // 5.1 멤버 변수 선언
    private String chars;
    private String filename;
    private Map<Long, List<String>> hashTable;
    public Main(String chars) {
        // 5.1 멤버 함수 구현
        this.chars = chars;
        this.hashTable = new HashMap<>(20);
    }

    // 5.2
    public void print() {
        System.out.println(hashTable);
    }

    // 5.3
    public boolean readFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String lines = br.readLine();
            // 중간 코드 작성
            String str;
            for(String line:lines) {
                if(str = line.split(chars)){

                }
            }





        catch (Exception e) {
            System.out.printf("파일 %s를 읽는 과정에서 오류가 발생했습니다",filename);
            return false;
        }
    }


    // 5.4 
    public static void main(String[] args) {
        Main m = new Main("[\t\n :.,;!\"]");
        // 나머지 코드 작성
            BufferedReader reader = new BufferedReader(new FileReader("final1data.txt"));
            if(!readFile(reader)) {
                HashTable hsh = new HashTable();
                print();
            }
            else{
                System.out.println("오류 발생");
            }

    }
}
