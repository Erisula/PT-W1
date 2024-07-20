package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		int planeSeatsLeft = 6;
		double costOfGroceries = 23.45;
		char middleInitial = 'J';
		boolean isItHot = true;
		String customerFirstName = "Jenn";
		String streetAddress = "4864 Old Chicago St Meridian, ID 83646";
		System.out.println("The number of plane seats left is " + planeSeatsLeft);
		System.out.println("The cost of the groceries was $" + costOfGroceries);
		System.out.println("Her middle initial is " + middleInitial);
		System.out.println("Is it hot today = " + isItHot);
		int newAvailableSeatsLeft = planeSeatsLeft - 2;
		double newGrocerybill = costOfGroceries + 2.15;
		char newMiddleInitial = 'L';
		boolean isItHotNow = false;
		String customersFullName = "Jennifer Elizabeth Underhill";
		System.out.println("My customer's name is " + customersFullName + " and she lives at " + streetAddress);
		
		
	}

}
