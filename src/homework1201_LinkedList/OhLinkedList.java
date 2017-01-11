package homework1201_LinkedList;

/**
 * Created by 205-121 on 2016-12-02.
 */
public class OhLinkedList {

    //전역 변수로 size, haed, tail 정보 가져다 쓸 수 있게 함
    int size = 0;
    Node head;
    Node tail;

    //하나의 객체를 담당할 Node라는 클래스를 만듬
    public class Node{
        int data;
        Node next;
        //객체를 인스턴스화 시키는 순간 data설정  다음 값인 next 미정
        public Node(int data){
            this.data = data;
            this.next = null;
        }
}

    //-----------------------------------------------------------------------
    //처음 입력할 addFirst라는 메소드 생성
    public void addHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;            //이 작업이 없으면 기존 데이터를 가리키는 정보가 사라짐
        head = newNode;                 //head의 새로운 Node가 처음이라고 알려줌
        if(size == 0){
            tail = newNode;
        }
        size++;
    }

    //맨 끝에 입력할 addLast라는 메소드 생성
    public void addTail(int data){
        Node newNode = new Node(data);
        if(size == 0){
            addHead(data);
        }else {
            tail.next = newNode;        //이 작업이 없으면 tail 이전에 것이 tail 가리키는 정보가 없어짐
            tail = newNode;             //이제 tail은 방금 넣은 newNode라고 알려줌
            size++;
        }
    }

    //중간에 추가할 add메소드 생성
    public void add(int count, int data){
        if (count == 0){
            addHead(data);
        }else{
            Node newNode = new Node(data);
            newNode.next = find(count);     //== newNode.next = find(count-1).next;
            find(count-1).next = newNode;
            size++;
            if (newNode.next == null){
                tail = newNode;
            }
        }
    }

    //-------------------------------------------------------------
    //count메소드 생성 = 인덱스 찾아갈 방법
    public Node find(int count){
        Node x = head;
        for (int i = 0; i < count; i++) {
            x = x.next;
        }
        return x;
    }

    //list 값 모두 출력하는 메소드
    public void print(){
        Node x = head;
        for (; size != 0; ) {
            System.out.print("[" + x.data + "] ");
            x = x.next;
            if (x == null){
                break;
            }
        }
    }

    //----------------------------------------------------------------
    //head부 지우는 deleteHead메소드
    public void deleteHead(){
        head = head.next;
        size--;
        System.gc();                //쓸모없는 힙영역 메모리 삭제(단, 랜덤으로 지우기에 무조건 지워지는건 아님)
    }

    //tail부 지우는 deleteTail메소드
    public void deleteTail(){
        tail = find(size - 2);
        find(size-2).next = null;
        size--;
        System.gc();
    }

    //중간의 리스트 지우는 delete메소드
    public void delete(int count){
        if(count==0){
            deleteHead();
        }else{
            Node temp = find(count);
            find(count-1).next = temp.next;
            temp.next = null;
            size--;
            System.gc();
        }
    }
}
