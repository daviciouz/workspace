/* Amount = P(1+R)^n */

class compInt{
	public static void main(String[] args){
		double amount;
		double principal = 10000;
		double rate = 0.05;

		for(int year=1; year<=20; year++){
			amount = principal*Math.pow(1 + rate, year);
			System.out.println(year + "  "+ amount);
		}

	}
}