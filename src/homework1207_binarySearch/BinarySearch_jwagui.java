package homework1207_binarySearch;

/**
 * Created by 205-121 on 2016-12-12.
 */
public class BinarySearch_jwagui {
    public int findIndexJG(int[] array, int findNum, int firstNum, int lastNum){
        int midNum = (lastNum + firstNum)/2;
        if(array[0] > findNum || array[array.length-1] < findNum || findNum > lastNum){
            return -1;
        }
        if (array[midNum] < findNum){
            return findIndexJG(array, findNum, midNum + 1, lastNum);
        }else if(array[midNum] > findNum){
            return findIndexJG(array, findNum, firstNum, midNum -1);
        }else{
            return midNum;
        }
    }
}
