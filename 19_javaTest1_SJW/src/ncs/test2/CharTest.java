package ncs.test2;

public class CharTest {

	public static void main(String[] args) {
		char[] chs=new char[args.length];
		chs=args[0].toCharArray();
		
		for(int i=0; i<chs.length; i++) {
			chs[i]=(char)(chs[chs.length-1-i]);
//			if(chs[chs.length-1-i]>='a'||chs[chs.length-1-i]<='z') {
//				chs[i]=(char)(chs[chs.length-1-i]);				
//			} else {
//				chs[i]=(char)(chs[chs.length-1-i]);
//			}
		}
		
		for(char c:chs) {
			System.out.print(c);
		}
	}

}
