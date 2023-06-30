import java.sql.SQLOutput;

class Preposition {
    String preposition; // 전치사 문자열
    int count; // preposition이 문자열에 나타난 횟수 저장

    // 전치사 문자열로 초기화
    // 횟수 초기화
    Preposition(String preposition) {
        this.preposition = preposition;
        count = 0;
    }

    // 주어진 word가 멤버 변수에 저장되어 있는
    // 전치사와 일치하면 true 아니면 false 반환
    boolean equals(String word) {
        if(preposition.contains(word.toLowerCase())) {
            return true;
        }
        return false;
    }

    // "전치사: 개수" 형태로 화면에 출력
    void print() {
            System.out.println(preposition + ": " + count);
    }

    // 전치사가 나타난 횟수를 1 증가시킴
    void increaseCount() {
        count++;
    }

    //; 전치사가 나타난 횟수 반환
    int getCount() {
        return count;
    }
}

class Verb {
    String[] verbs; // 0: 현재형, 1: 과거형, 2: 과거완료형
    int count; // 동사가 문자열에 나타난 횟수 저장

    // 동사의 현재형, 과거형, 과거 분사형을 받아서 초기화
    // 횟수 초기화
    Verb(String present, String past, String pp) {
        verbs = new String[3];
        verbs[0] = present;
        verbs[1] = past;
        verbs[2] = pp;

        count = 0;
    }

    // 주어진 단어가 동사의 현재형, 과거형, 또는 과거 분사형과 일치하면 true,
    // 아니면 false 반환
    boolean equals(String word) {
        for(int i = 0; i < verbs.length; i++) {
            if(verbs[i].equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    // "동사_현재_원형: 개수" 형태로 화면에 출력
    void print() {
        System.out.println(verbs[0]+": "+count);
    }

    // 동사가 나타난 횟수를 1 증가시킴
    void increaseCount() {
        count++;
    }

    // 동사가 나타난 횟수 반환
    int getCount() {
        return count;
    }
}

class Noun {
    String[] nouns; // 0: 단수, 1: 복수
    int count; // 명사가 문자열에 나타난 횟수 저장

    // 명사의 단수형, 복수형 문자열로 초기화
    Noun(String singular, String plural) {
        nouns = new String[2]; //틀림
        nouns[0] = singular;
        nouns[1] = plural;
        count = 0;
    }

    // 주어진 단어가 명사의 단수형 또는 복수형과 일치하면 true,
    // 아니면 false 반환
    boolean equals(String word) {
        for(int i = 0; i < nouns.length; i++) {
            if(nouns[i].equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    // "명사_단수형: 개수" 형태로 화면에 출력
    void print() {
        System.out.println(nouns[0] + ": " + count);
    }

    // 명사가 나타난 횟수를 1 증가시킴
    void increaseCount() {
        count ++;
    }

    // 명사가 나타난 횟수 반환
    int getCount() {
        return count;
    }
}

public class Words {
    Noun[] nouns; // 검색하고 나타난 횟수를 셀 명사들을 저장
    Verb[] verbs; // 검색하고 나타난 횟수를 셀 동사들을 저장
    Preposition[] prepositions; // 전치사들을 저장
    int curIdxNouns; // 명사를 추가할 때 다음에 저장할 위치 기록
    int curIdxVerbs; // 동사를 추가할 때 다음에 저장할 위치 기록
    int curIdxPrepositions; // 전치사 추가용 저장 위치 기록

    // 검색할 명사, 동사, 전치사 개수를 입력으로 전달 받고
    // 배열 생성
    // 그 밖에 다른 초기화 작업
    Words(int numNouns, int numVerbs, int numPrepositions) {
        nouns = new Noun[numNouns];
        verbs = new Verb[numVerbs];
        prepositions = new Preposition[numPrepositions];

        curIdxNouns = 0;
        curIdxVerbs = 0;
        curIdxPrepositions = 0;
    }
    //틀림
    // 배열에 검색할 명사 추가
    void addNoun(Noun noun) {
            nouns[curIdxNouns] = noun;
            curIdxNouns++;
    }
    //틀림
    // 배열에 검색할 동사 추가
    void addVerb(Verb verb) {
            verbs[curIdxVerbs] = verb;
            curIdxVerbs++;
    }
    //틀림
    // 배열에 검색할 전치사 추가
    void addPreposition(Preposition preposition) {
            prepositions[curIdxPrepositions] = preposition;
            curIdxPrepositions++;
    }

    // 주어진 단어 word가 명사 배열에 있으면 횟수를 1 증기시키고, true 반환
    // 아니면 false 반환
    boolean countIfInNouns(String word) {
        for(int i = 0; i < curIdxNouns; i++) {
            if(nouns[i].equals(word)) {
                nouns[i].increaseCount();
                return true;
            }
        }
        return false;
    }

    // 주어진 단어 word가 동사 배열에 있으면 횟수를 1 증기시키고, true 반환
    // 아니면 false 반환
    boolean countIfInVerbs(String word) {
        for(int i = 0; i < curIdxVerbs; i++) {
            if(verbs[i].equals(word)) {
                verbs[i].increaseCount();
                return true;
            }
        }
        return false;
    }

    // 주어진 단어 word가 전치사 배열에 있으면 횟수를 1 증기시키고, true 반환
    // 아니면 false 반환
    boolean countIfInPrepositions(String word) {
        for(int i = 0; i < curIdxPrepositions; i++) {
            if(prepositions[i].equals(word)) {
                prepositions[i].increaseCount();
                return true;
            }
        }
        return false;
    }

    // 모든 명사와 개수를 화면에 출력
    // "명사"를 먼저 화면에 출력한 후,
    // 다음 줄부터 명사를 각각 한 줄에 한 개씩 화면에 출력
    // 예:
    // 명사
    // hope: 3
    // application: 2
    // ...
    void printNounCounts() {
        System.out.println("명사");
        int count = 0;
        for(int i=0; i < curIdxNouns; i++) {
            //System.out.println(nouns[i]+": "+nouns[i].getCount());
            nouns[i].print();
            count += nouns[i].getCount();
        }
        System.out.println("Num of nouns found="+count);
    }

    // 모든 동사와 개수를 화면에 출력
    // "동사"를 먼저 화면에 출력한 후,
    // 다음 줄부터 동사의 현재형과 개수를 한 줄에 한 개씩 화면에 출력
    void printVerbCounts() {
        System.out.println("동사");
        int count = 0;
        for(int i=0; i < curIdxVerbs; i++) {
            //System.out.println(verbs[i]+": "+verbs[i].getCount());
            verbs[i].print();
            count += verbs[i].getCount();
        }
        System.out.println("Num of verbs found="+count);
    }

    // 모든 명사와 개수를 화면에 출력
    // "동사"를 먼저 화면에 출력한 후,
    // 다음 줄부터 동사의 현재형과 개수를 한 줄에 한 개씩 화면에 출력
    void printPrepositionCounts() {
        System.out.println("전치사");
        int count = 0;
        for(int i=0; i < curIdxPrepositions; i++) {
            //System.out.println(prepositions[i]+": "+prepositions[i].getCount());
            prepositions[i].print();
            count += prepositions[i].getCount();
        }
        System.out.println("Num of prepositions found="+ count);
    }

    // printNounCounts(), printVerbCounts(),
    // printPrepositionCounts() 함수를 순차적으로 호출하는 유틸리티 함수
    void print() {
        printNounCounts();
        printVerbCounts();
        printPrepositionCounts();
    }
}
