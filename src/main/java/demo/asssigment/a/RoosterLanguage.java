package demo.asssigment.a;

public enum RoosterLanguage {

	DANISH("kykyliky"),
	DUTCH("kukeleku"),
	FINNISH("kukko kiekuu"),
	FRENCH("cocorico"),
	GERMAN("kikeriki"),
	GREEK("kikiriki"),
	HEBREW("coo-koo-ri-koo"),
	HUNGARIAN("kukuriku"),
	ITALIAN("chicchirichi"),
	JAPANESE("ko-ke-kok-ko-o"),
	PORTUGUESE("cucurucu"),
	RUSSIAN("kukareku"),
	SWEDISH("kuckeliku"),
	TURKISH("kuk-kurri-kuuu"),
	URDU("kuklooku");
	 
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
