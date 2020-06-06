
public enum RoomType {
	Standard(2500),Deluxe(3500),Cottage(5500);

	private int fare;

	RoomType(int fare) {
		this.fare=fare;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public int getFare() {
		return fare;
	}
}
