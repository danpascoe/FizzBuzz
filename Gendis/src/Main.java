public class Main {

	public static void main(String args[]) {
		Main main = new Main();
		main.FizzBuzz();
	}
	
	public String intToString(int number) {
		return String.valueOf(number);
	}
	
	public void FizzBuzz() {
		for(int i = 1; i < 50; i++) {
			String number = checkFizzBuzz(i);
			System.out.println(number);
		}
	}
		
	public String checkFizzBuzz(int number) {
		
		String output = "";
		
		int param_1 = 3;
		int param_2 = 5;
		
		String output_1 = "Fizz";
		String output_2 = "Buzz";
		
		if(number % param_1 == 0) { output += output_1; }
		if(number % param_2 == 0) { output += output_2; }
		
		if(output.equals("")) {
			return String.valueOf(number);
		}
		return output;
	}	
}

/*
* To modify the code, it would be a case of changing the parameters variables and the outputs
* 
* In order to allow the user to select a particular game, the program could readline and 
* get a particular option, and then update the parameters accordingly
*
*/