/**
 * Accepted
 * 155 ms   0 KB
 * Jul/13/2018 16:42 UTC+8
 */
import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> inputList = readInput();

        ArrayList<Integer> minuteList = getIntListFromString(inputList.get(0));
        ArrayList<Integer> failList = getIntListFromString(inputList.get(1));
        ArrayList<Integer> hackList = getIntListFromString(inputList.get(2));

        int[] score = {500,1000,1500,2000,2500};
        float finalScore = 0;
        for (int i=0; i<minuteList.size(); i++) {
            float a_score = calculateScore(minuteList.get(i), score[i], failList.get(i));
            float b_score = 0.3f *  score[i];
            finalScore+= (a_score > b_score ? a_score : b_score);
        }
        finalScore = finalScore + hackList.get(0) * 100 - hackList.get(1)*50;

        System.out.print((int)finalScore);
    }

    private static float calculateScore(int minute, int score, int failTime) {
        return (1 - (float) minute/ 250f) * score - (float) (50 * failTime);
    }

    public static void outputIntegerListResult(ArrayList<Integer> list){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static ArrayList<String> readInput(){
        ArrayList<String> inputList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            inputList.add(sc.nextLine());
        }
        return inputList;
    }

    public static ArrayList<Integer> getIntListFromString(String str){
        String[] strArray = str.split(" ");
        ArrayList<Integer> intList = new ArrayList();
        for(int i = 0; i < strArray.length; i++){
        intList.add(Integer.parseInt(strArray[i]));
        }
        return intList;
    }

    public static void printMap(HashMap map){
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            //Object key = entry.getKey();
            //Object val = entry.getValue();
            System.out.print(entry.getKey()+" ");
        }
    }


    public static void println() {
        System.out.println();
    }
}