package cycle;

public class Cycle {

	private Frame frame;
	private wheel wheel;
	private ChainAssembly chainAssembly;
	private Seat seat;
	private HandleBrake handleBrake;

	public Cycle(Frame frame, cycle.wheel wheel, ChainAssembly chainAssembly, Seat seat, HandleBrake handleBrake) {
		super();
		this.frame = frame;
		this.wheel = wheel;
		this.chainAssembly = chainAssembly;
		this.seat = seat;
		this.handleBrake = handleBrake;
	}

	public Cycle() {
		// TODO Auto-generated constructor stub
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public wheel getWheel() {
		return wheel;
	}

	public void setWheel(wheel wheel) {
		this.wheel = wheel;
	}

	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}

	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public HandleBrake getHandleBrake() {
		return handleBrake;
	}

	public void setHandleBrake(HandleBrake handleBrake) {
		this.handleBrake = handleBrake;
	}

	public float getCyclePrice(String orderDate) {

		float framePrice = frame.getPrice(orderDate);
		float wheelPrice = wheel.getPrice(orderDate);
		float chainAssemblyPrice = chainAssembly.getPrice(orderDate);
		float seatPrice = seat.getPrice(orderDate);
		float handleBrakePrice = handleBrake.getPrice(orderDate);

		System.out.println("Frame Price: " + framePrice + " Rs \n" + "Wheel Price: " + wheelPrice + " Rs \n"
				+ "ChainAssembly Price: " + chainAssemblyPrice + " Rs \n" + "Seat Price: " + seatPrice + " Rs \n"
				+ "Handle and Brakes Price: " + handleBrakePrice + "Rs \n");

		float cyclePrice = wheelPrice + framePrice + chainAssemblyPrice + handleBrakePrice + seatPrice;
		return cyclePrice;

	}

}
