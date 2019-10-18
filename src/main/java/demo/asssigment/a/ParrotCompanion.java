package demo.asssigment.a;

public enum ParrotCompanion {

	DOGS("Woof, woof"),
	CATS("Meow"),
	ROOSTER("Cock-a-doodle-doo");
	
	String voice;
	
	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	private ParrotCompanion(String v) {
		voice = v;
	}
}
