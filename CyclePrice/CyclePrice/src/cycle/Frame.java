package cycle;

import java.util.ArrayList;

import cycle.component.FramePlanner;
import utilities.PriceEnum;
import utilities.Utility;

public class Frame implements FramePlanner {

	String frameType;
	

	public String getFrameType() {
		return frameType;
	}

	public void setFrameType(String frameType) {
		this.frameType = frameType;
	}

	@Override
	public float getPrice(String orderDate) {
		float framePrice= PriceEnum.getPrice(frameType).getComponentPrice();
		ArrayList<Long> dateDiif = new Utility().getDateDiff(PriceEnum.PriceDate.PriceChangeDate, orderDate);

		if (dateDiif.get(0) > 0) {

			framePrice += 30 * dateDiif.get(0);
			
		}

		if (dateDiif.get(1) > 0) {
			framePrice += 30;
			

		}

		return framePrice;
	}
	
	
	
}
