// Authors: Matthew Mccormick and Sophia Faucey
public class Burner {
	
	// Temperature Class
	public enum Temperature {
		BLAZING ("VERY HOT! DON'T TOUCH"), HOT ("CAREFUL"), WARM ("warm"), COLD ("cooool");
		private String value;
		
		Temperature (String aValue) {
			value = aValue;
		}
		
		public String toString() {
			return value;
		}
	}

	Setting mySetting;
	Temperature myTemperature;
	int timer = 0;
	public final int TIME_DURATION = 2;
	public Burner() {
		mySetting = Setting.OFF;
		myTemperature = Temperature.COLD;
	}
	// Methods
	
	public void plusButton() {
		switch (mySetting.value) {
			case "OFF": mySetting = Setting.LOW;
						break;
			case "LOW": mySetting = Setting.MEDIUM;
						break;
			case "MEDIUM": mySetting = Setting.HIGH;
						break;
		}
	}
	
	public void minusButton() {
		switch (mySetting.value) {
			case "OFF": mySetting = Setting.LOW;
						break;
			case "LOW": mySetting = Setting.MEDIUM;
						break;
			case "MEDIUM": mySetting = Setting.HIGH;
						break;
		}
	}
	public void updateTemperature() {
		timer++;
		
	}
}
