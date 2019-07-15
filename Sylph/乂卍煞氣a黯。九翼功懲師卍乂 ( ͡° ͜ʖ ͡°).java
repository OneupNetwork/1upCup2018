/**
 * Accepted
 * 374 ms   3600 KB
 * Jul/13/2018 17:54 UTC+8
 */
import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> inputList = readInput();

        ArrayList<Integer> list = getIntListFromString(inputList.get(1));
        long sum1 = sum(list);
        if(sum1 % 2==0){
            System.out.println(sum1);
        }else{
            System.out.println(sum1-getMinOdd(list));
        }
    }

    private static long sum(ArrayList<Integer> list){
        long sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    private static int getMinOdd(ArrayList<Integer> list){
        Collections.sort(list, new Comparator<Integer>() {
            @Override public int compare(Integer p1, Integer p2) {
                return p1- p2; // Ascending
            }
        });

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)%2!=0){
                return list.get(i);
            }
        }

        return 0;
    }

    public static ArrayList<String> split(String left, int firstSplit, int secondSplit) {
        int indicator = firstSplit;
        ArrayList<String> resultList = new ArrayList();

        while (left.length() > 0) {
            resultList.add(left.substring(0, indicator));
            left = left.substring(indicator, left.length());
            int mod = left.length() % secondSplit;
            if (mod == 0 || left.length() < indicator) {
                indicator = secondSplit;
            }

            if (left.length() > 0 && left.length() < firstSplit && left.length() < secondSplit) {
                return null;
            }
        }
        return resultList;
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