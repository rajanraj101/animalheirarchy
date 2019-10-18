package demo.asssigment.a;

public enum RoosterLanguage {

	Danish("kykyliky"),
	DUTCH("kukeleku");
	 
	String text;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	private RoosterLanguage(String t) {
		text = t;
	};
	
};
