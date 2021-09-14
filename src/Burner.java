// Authors: Matthew Mccormick and Sophia Fausey
public class Burner {

	// Temperature Class
	public enum Temperature {
		BLAZING ("VERY HOT! DON'T TOUCH"), HOT ("CAREFUL"), WARM ("warm"), COLD ("cooool");
		private String value;

		Temperature (String aValue) {
			value = aValue;
		}

		// getter
		public String getTemp() {
			return value;
		}
	}

	// Burner variables
	Setting mySetting;
	Temperature myTemperature;
	int timer = 0;
	public final int TIME_DURATION = 2;
	// Burner Constructor
	public Burner() {
		mySetting = Setting.OFF;
		myTemperature = Temperature.COLD;
	}
	
	// Methods

	public void plusButton() {
		timer = TIME_DURATION;
		switch (mySetting) {
		case OFF: mySetting = Setting.LOW;
		break;
		case LOW: mySetting = Setting.MEDIUM;
		break;
		case MEDIUM: mySetting = Setting.HIGH;
		break;
		}
	}

	public void minusButton() {
		timer = TIME_DURATION;
		switch (mySetting) {
		case LOW: mySetting = Setting.OFF;
		break;
		case MEDIUM: mySetting = Setting.LOW;
		break;
		case HIGH: mySetting = Setting.MEDIUM;
		break;
		}
	}
	public void updateTemperature() {
		// Temperature updates according to current Setting, as well as current temperature using embedded switch statements
		if(timer == 1) {
			switch (mySetting) {
			case LOW: 
				switch(myTemperature) {
				case BLAZING:
					myTemperature= Temperature.HOT;
					break;
				case HOT:
					myTemperature= Temperature.WARM;
					break;
				case COLD: 
					myTemperature= Temperature.WARM;
					break;
				}
				break;

			case MEDIUM: 
				switch(myTemperature) {
				case BLAZING:
					myTemperature= Temperature.HOT;
					break;
				case WARM:
					myTemperature= Temperature.HOT;
					break;
				case COLD: 
					myTemperature= Temperature.WARM;
					break;
				}
				break;

			case HIGH: 
				switch(myTemperature) {
				case HOT:
					myTemperature= Temperature.BLAZING;
					break;
				case WARM:
					myTemperature= Temperature.HOT;
					break;
				case COLD: 
					myTemperature= Temperature.WARM;
					break;
				}
				break;
			case OFF: 
				switch(myTemperature) {
				case HOT:
					myTemperature= Temperature.WARM;
					break;
				case WARM:
					myTemperature= Temperature.COLD;
					break;
				case BLAZING: 
					myTemperature= Temperature.HOT;
					break;
				}

			}

		}else {
			timer--;
		}


	}
}
