import java.util.Arrays;
class cumulativesum{
    public static void main(String[] args) {
        int[] arrNum = {25, 35, 12, 4, 36, 48};
        //int n = arrNum.length;
        for (int i = 1; i < arrNum.length; i++) {
            arrNum[i] += arrNum[i - 1];
            
        }
        System.out.println( Arrays.toString(arrNum));
        
    }
}