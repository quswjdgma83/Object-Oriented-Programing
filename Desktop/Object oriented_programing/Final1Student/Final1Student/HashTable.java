import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable {
    // 4.1 
    private Map<Long, List<String>> hashTable;
    private ArrayList<String> lst;
    private String word;
    // 나머지 멤버 변수 선언

    public HashTable(int size) {
        // 코드 작성
        this.hashTable = new HashMap<>(size);
    }

    // 4.2
    public long power(long n1, int n2) {
        // 코드 작성
        long k = 1;
        for(int i = 0; i < n2; i++) {
            k *= n1;
        }
        return k;
    }

    // 4.3 
    // 인자부터 코드 작성
    private boolean isInList(lst, word) {
        //word가 lst리스트에 있는지 확인하고 true또는 false반환
        ArrayList<> llist = new ArrayList();
        llist = lst;
        return llist.contains(word);
    }

    // 4.4
    public long getHashValue(String word) {
        // 코드 작성
        long result = 0;
        for(int i = 0; i < word.length(); i++) {
            result += ((int)word.charAt(i)*(7**(word.length()-1)))%(hashTable.size());
        }
        return result;
    }

    // 4.5
    public void add(String word) {
        long hash = getHashValue(word);
        // 코드 작성
        if (hashTable.containsKey(hash)) {
            hashTable<hash, word>;
        }
        else {
        }
    }

    // 4.6
    public void print() {
        for (Map.Entry<Long, List<String>> entry : hashTable.entrySet()) {
            // 코드 작성
            System.out.println(hashTable.keySet() + ":" + hashTable.values());
        }

    }
}
