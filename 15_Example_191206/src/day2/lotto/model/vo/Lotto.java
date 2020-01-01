package day2.lotto.model.vo;

public class Lotto {

	private int[] lotto;
	
	public Lotto() {}

	{
		lotto=new int[6];
		lotto[0]=(int)Math.random()*45+1;
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	public void infomation(String s) {
		
		
	}
	
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	
}
