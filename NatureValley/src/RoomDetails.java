
public class RoomDetails implements RoomBillComponent {

	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPersons;
	private int noOfDaysOfStay;
	public static int counter = 100;

	public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDaysOfStay = noOfDaysOfStay;
		counter++;
	}

	public int getBillId() {
		return counter;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}

	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}

	public boolean validateNoOfExtraPerson() {
		if (this.getNoOfExtraPersons() >= 0 && this.getNoOfExtraPersons() <= 2) {
			return true;
		}
		System.out.println(" The number of Extra Persons shoul be between 0 to 2");
		return false;
	}

	public boolean validateTypeOfRoom() {
		if (this.typeOfRoom == RoomType.Deluxe.toString() || this.typeOfRoom == RoomType.Cottage.toString()
				|| this.typeOfRoom == RoomType.Standard.toString()) {
			return true;
		}
		System.out.println("The Room types available are Standard,Deluxe and Cottage");
		return false;
	}

	public boolean validateNoOfDaysStay() {
		if (this.noOfDaysOfStay >= 1 && this.noOfDaysOfStay <= 15) {
			return true;
		}
		System.out.println("The number days of stay should be between 1 and 15");
		return false;
	}

	public int getRoomBasefare() {
		if (validateTypeOfRoom()) {
			for (RoomType rt : RoomType.values()) {
				if (this.typeOfRoom == rt.name()) {
					return rt.getFare();
				}
			}
		}
		return 0;
	}

	@Override
	public float calculateBill() {
		double baseFare,totalBill;
		if(validateTypeOfRoom() && validateNoOfDaysStay() && validateNoOfExtraPerson()) {
			baseFare=getRoomBasefare();
			totalBill=(this.getNoOfDaysOfStay()*baseFare)+(this.getNoOfDaysOfStay()*foodCharge)+(extra_person_charge*this.getNoOfExtraPersons());
			totalBill=totalBill+tax;
			return (float) totalBill;
		}
		return 0;
	}

}
