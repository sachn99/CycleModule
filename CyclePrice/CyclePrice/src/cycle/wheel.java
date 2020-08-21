package cycle;

import java.util.ArrayList;

import cycle.component.WheelPlanner;
import utilities.PriceEnum;
import utilities.Utility;

public class wheel implements WheelPlanner {

	public wheel() {
		super();
		// TODO Auto-generated constructor stub
	}


	String tyreType;
	String rimType;
	String spokeType;
	public wheel(String tyreType, String rimType, String spokeType) {
		super();
		this.tyreType = tyreType;
		this.rimType = rimType;
		this.spokeType = spokeType;
	}

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	public String getRimType() {
		return rimType;
	}

	public void setRimType(String rimType) {
		this.rimType = rimType;
	}

	public String getSpokeType() {
		return spokeType;
	}

	public void setSpokeType(String spokeType) {
		this.spokeType = spokeType;
	}


	@Override
	public float getPrice(String orderDate) {
		// TODO
		float rimPrice = PriceEnum.getPrice(rimType).getComponentPrice();
		float spokePrice = PriceEnum.getPrice(spokeType).getComponentPrice();
		float tyrePrice = PriceEnum.getPrice(tyreType).getComponentPrice();

		ArrayList<Long> dateDiif = new Utility().getDateDiff(PriceEnum.PriceDate.PriceChangeDate, orderDate);

		if (dateDiif.get(0) > 0) {

			rimPrice += 30 * dateDiif.get(0);
			spokePrice += 30 * dateDiif.get(0);
			tyrePrice += 30 * dateDiif.get(0);

		}

		if (dateDiif.get(1) > 0) {
			rimPrice += 30;
			spokePrice += 30;
			tyrePrice += 30;

		}

		return tyrePrice + spokePrice + rimPrice;
	}

}
