package homework170207_biggerSentence;

import java.util.Scanner;

/**
 * Created by dhgof_000 on 2017-02-06.
 * 알파벳 소문자로만 이루어진 문자열 w가 있다. w의 문자들을 재 조합해서 또다른 문자열 s를 만드는데 s는 w보다 그 크기가 크다.
 (크기가 크다는 것은 사전 편찬 식으로 정렬했을 때 s가 w보다 뒤에 위치하게 된다는 의미이다.)

 입력
 첫출에 테스트할 횟수 t를 입력받는다.
 그 다음 줄 부터 문자열 w를 입력받는다.

 출력
 각각의 테스트 케이스에 대해서 s를 출력한다. s가 여러개일 경우 그 중 가장 작은 것을 출력한다.
 답이 존재하지 않으면 "no answer"를 출력한다.

 제한
 1 <= t <= 10^5
 1 <= (w의 길이) <= 100
 w는 알파벳 소문자로만 이루어져있으며, 길이가 100을 초과하지 않는다.

 입력 예제 #1
 3
 ab
 bb
 hefg

 출력 예제 #1
 ba
 no answer
 hegf

 입력 예제 #2
 15
 zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgmw
 zyyxwwtrrnmlggfeb
 ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlcf
 biehzcmjckznhwrfgglverxsezxuqpj
 rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmsym
 unpzhmbgrrs
 jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqpxg
 ywsfmynmiylcjgrfrrmtyeeykffzkuphpajndwxjteyjba
 dkuashjzsdq
 gwakhcpkolybihkmxyecrdhsvycjrljajlmlqgpcnmvvkjlkvdowzdfikh
 nebsajjbbuifimjpdcqfygeitief
 qetpicxagjkydehfnvfxrtigljlheulcsfidjjozbsnomygqbcmpffwswptbgkzrbgqwnczrcfynjmhebfbgseuhckbtuynvbo
 xuqfobndhsnsztifmqpnencxkllnpmbfqihtgdgxjhsvitlgtodhcydfb
 xqdwkjpkmrvkfnztozzlqtuxzxyxwowf
 yewluyxiwiprnajrtkeilolkmqidazhiar

 출력 예제 #2
 zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgwm
 no answer
 ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlfc
 biehzcmjckznhwrfgglverxsjepquxz
 rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmyms
 unpzhmbgrsr
 jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqxgp
 ywsfmynmiylcjgrfrrmtyeeykffzkuphpajndwxjtjabey
 dkuashjzsqd
 gwakhcpkolybihkmxyecrdhsvycjrljajlmlqgpcnmvvkjlkvdowzdfkhi
 nebsajjbbuifimjpdcqfygeitife
 qetpicxagjkydehfnvfxrtigljlheulcsfidjjozbsnomygqbcmpffwswptbgkzrbgqwnczrcfynjmhebfbgseuhckbtuynvob
 xuqfobndhsnsztifmqpnencxkllnpmbfqihtgdgxjhsvitlgtodhcyfbd
 xqdwkjpkmrvkfnztozzlqtuxzxyxwwfo
 yewluyxiwiprnajrtkeilolkmqidazhira
 */
public class BiggerSentence {
    public static void main(String[] args) {
        //초기값 입력 받을 준비
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        String[] w = new String[testCase];

        //초기 문자열 입력
        for (int i = 0; i < testCase; i++) {
            w[i] = scan.next();
        }

        for (int i = 0; i < testCase; i++) {
            String check = sortArray(w[i]);
            //새로 정렬 받은것이 기존 것보다 크다면 그거 출력하고 아니면 "no answer"
            if (w[i].compareTo(check) < 0){
                System.out.println(check);
            }else {
                System.out.println("no answer");
            }
        }
    }

    //배열 좀 더 크게 만들어서 반환 해주기
    private static String sortArray(String sentence) {
        //문장을 한단어별로 쪼개서 저장한 다음 하나씩 비교해서 조금이라도 큰 숫자로 만들어서 반환 할 예정
        Character[] temp = new Character[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            temp[i] = sentence.charAt(i);
        }

        for (int i = temp.length-1; i > 0 ; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if (temp[i] > temp[j]){
                    char change = temp[i];
                    temp[i] = temp[j];
                    temp[j] = change;

                    //바뀐 것을 그대로 문자열로 바꾸자
                    String returnSentence = "";
                    for (int k = 0; k < temp.length; k++) {
                        returnSentence = returnSentence + temp[k];
                    }
                    return returnSentence;
                }
            }
        }
        return sentence;
    }
}
