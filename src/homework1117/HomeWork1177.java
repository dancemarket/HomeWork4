package homework1117;

/**
 * Created by ola on 2016. 11. 17..
 */
public class HomeWork1177 {

	//
	// 열기닫기 검사하기 툴
	// {} => 성공
	// {}} => 실패
	// {[]} => 성공
	// {[}] => 실패
	// stack을 이용하면 돼
	public static void main(String[] args) {
		System.out.println(check("df{{,,...}}}d"));
	}

	public static String check(String data) {
		String iget = data;
		iget = iget.replaceAll("[^{,^},^[,^]]", "");
		return iget;
	}
}
