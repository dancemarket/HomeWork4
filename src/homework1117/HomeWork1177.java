package homework1117;

/**
 * Created by ola on 2016. 11. 17..
 */
public class HomeWork1177 {

	public static void main(String[] args) {
		System.out.println(check("uf{}u[]iyg[]iug"));
	}

	public static boolean check(String data) {
		String nget = "";
        int a = 0, b = 0, A = 0, B = 0;
        //필요한 괄호 정렬
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == '{' || data.charAt(i) == '}' || data.charAt(i) == '[' || data.charAt(i) == ']'){
				nget = nget + data.charAt(i);
                switch (data.charAt(i)){
                    case '{' :
                        a++;
                        break;
                    case '[' :
                        b++;
                        break;
                    case '}' :
                        A++;
                        break;
                    case ']' :
                        B++;
                        break;
                    default:
                        break;
                }
			}
		}

		if ((a == A && b == B)&&(nget.charAt(0)=='{'||nget.charAt(0)=='[')&&(nget.charAt(nget.length()-1)=='}'||nget.charAt(nget.length()-1)==']')){
            for(int i = 1; i < nget.length();i++){
                if((nget.charAt(i-1)=='['&&nget.charAt(i)=='}')||(nget.charAt(i-1)=='{'&&nget.charAt(i)==']')) {
                    break;
                }else if(i == nget.length()-1){
                    return true;
                }
            }
        }
        return false;
    }
}
