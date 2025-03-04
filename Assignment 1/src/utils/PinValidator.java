package utils;

public class PinValidator{

	
	public class Rules{

		public boolean isValid(String pin){

			if (pin.length() == 4 && pin.matches("\\d+")){
				return true;
			}
			else {
				System.out.println("Password is not 4 characters long!");
				return false;
			}			

		}

	}

}
