package homework1207_binarySearch;

/**
 * Created by dhgof_000 on 2016-12-08.
 */
public class BinarySearch {
    public int findIndex(int[] array, int number){
        int halfIndex = array.length/2; //초기 반절인덱스 설정해주기 위해 세팅
        int startIndex = 0;             //배열의 첫부분 세팅
        int endIndex = array.length;    //배열의 끝부분 세팅
        int searchCount = array.length; //배열 검사를 배열 수만큼 해보고 없으면 반환값으로 -1주기 위해 설정
        //받은 배열에 가운데를 기점으로 좌우로 왔다 갔다 하면서 찾기
        while(array[halfIndex] != number){
            //중앙에서 오른쪽 부분으로 가거라
            if (array[halfIndex] < number){
                startIndex = halfIndex + 1;
                halfIndex = (halfIndex + (endIndex-halfIndex)/2) + 1;
            //중앙에서 왼쪽 부분으로 가거라
            }else{
                endIndex = halfIndex;
                halfIndex = (halfIndex - (halfIndex-startIndex)/2) -1;
            }
            searchCount--;
            //찾고자 하는 값이 없으면 아래를 실행
            if (searchCount == 0){
                System.out.println("찾고자 하는 수가 없습니다");
                return -1;
            }
        }
        return halfIndex;
    }
}
