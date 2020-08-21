package cycle;

import java.util.ArrayList;

import cycle.component.HandleBrakePlanner;
import utilities.PriceEnum;
import utilities.Utility;

public class HandleBrake implements HandleBrakePlanner {
	String brakeType;
	String handleType;

	public HandleBrake(String brakeType, String handleType) {
		super();
		this.brakeType = brakeType;
		this.handleType = handleType;
	}

	public String getBrakeType() {
		return brakeType;
	}

	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	@Override
	public float getPrice(String orderDate) {
		
		float brakePrice=PriceEnum.getPrice(brakeType).getComponentPrice();
		float handlePrice=PriceEnum.getPrice(handleType).getComponentPrice();
		ArrayList<Long> dateDiif = new Utility().getDateDiff(PriceEnum.PriceDate.PriceChangeDate, orderDate);

		if (dateDiif.get(0) > 0) {

			brakePrice += 30 * dateDiif.get(0);
			handlePrice += 30 * dateDiif.get(0);

		}

		if (dateDiif.get(1) > 0) {
			brakePrice += 30;
			handlePrice += 30;


		}
		// TODO Auto-generated method stub
		return brakePrice+handlePrice;
	}

	public HandleBrake() {
		super();
		// TODO Auto-generated constructor stub
	}
}
