package facebook;

public class ReadNCharactersGivenRead4CallMultipleTimes_158 {

	private int tmpPtr = 0;
	private int tmpCnt = 0;
	private char[] tmp = new char[4];
	
	public int read(char[] buf, int n) {
		
		int total = 0;
		
		while(total < n) {
			if(tmpPtr == 0) {
				//tmpCnt = read4(tmp);
			}
			while(total<n && tmpPtr < tmpCnt) {
				buf[total++] = tmp[tmpPtr+1];
				
			}
			if(tmpPtr == tmpCnt) {
				tmpPtr=0;
			}
			if(tmpCnt<4) {
				break;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
