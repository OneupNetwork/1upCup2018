/**
 * Accepted
 * 171 ms   0 KB
 * Jul/13/2018 17:31 UTC+8
 */
import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> inputList = readInput();

        ArrayList<Integer> list = getIntListFromString(inputList.get(0));
        String str = inputList.get(1);

        int strLength = list.get(0);
        int firstSplit = list.get(1);
        int secondSplit = list.get(2);

        ArrayList<String>resultList = new ArrayList();
        String left=str;

        if (str.length() < firstSplit || str.length() < secondSplit) {
        System.out.print(-1+"");
        return;
        }

        int indicator = firstSplit;
        boolean canSplit = true;

        resultList = split(left, firstSplit, secondSplit);
        if (resultList == null) {
            resultList = split(left, secondSplit, firstSplit);
        }

        System.out.println(resultList == null ? -1 : resultList.size());
        if (resultList != null) {
            for (int i=0;i<resultList.size();i++){
                System.out.println(resultList.get(i));
            }
        }
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