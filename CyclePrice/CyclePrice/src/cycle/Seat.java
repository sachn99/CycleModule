package cycle;

import java.util.ArrayList;

import cycle.component.SeatPlanner;
import utilities.PriceEnum;
import utilities.Utility;

public class Seat implements SeatPlanner {

	String seatType;

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	@Override
	public float getPrice(String orderDate) {

		float seatPrice = PriceEnum.getPrice(seatType).getComponentPrice();
		ArrayList<Long> dateDiif = new Utility().getDateDiff(PriceEnum.PriceDate.PriceChangeDate, orderDate);

		if (dateDiif.get(0) > 0) {

			seatPrice += 30 * dateDiif.get(0);

		}

		if (dateDiif.get(1) > 0) {
			seatPrice += 30;

		}

		return seatPrice;
	}

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
}
