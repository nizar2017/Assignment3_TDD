package tdd.assignment3.part3;

public class Roman {
	
	private String arabic;

	
		

	public Roman(String arabic) {
		this.arabic = arabic;
		
	}

	public int toArabic() {
			return RomanDigit.valueOf(arabic).arabic;
	
		
		
	}
	enum RomanDigit
	{
		I(1),II(2),III(3),IV(4),V(5),VI(6),VII(7),X(10);
		
		private final int arabic;
		
		RomanDigit(int arabic)
		{
			this.arabic=arabic;
		}
	}	

}
