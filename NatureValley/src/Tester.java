
public class Tester {

	public static void main(String[] args) {
		RoomDetails rd1 = new RoomDetails("Tharic", "Standard", 1, 2);

		System.out.println("BillId:___________________ " + rd1.getBillId());
		System.out.println("Customer Name:____________ " + rd1.getCustomerName());
		System.out.println("No. of days of Stay_______ " + rd1.getNoOfDaysOfStay());
		System.out.println("Total Bill________________ " + rd1.calculateBill());
		RoomDetails rd2 = new RoomDetails("Akram", "Cottage", 2, 3);

		System.out.println("BillId:___________________ " + rd2.getBillId());
		System.out.println("Customer Name:____________ " + rd2.getCustomerName());
		System.out.println("No. of days of Stay_______ " + rd2.getNoOfDaysOfStay());
		System.out.println("Total Bill________________ " + rd2.calculateBill());
	}

}
