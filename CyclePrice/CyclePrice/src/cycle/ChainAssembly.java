package cycle;

import java.util.ArrayList;

import cycle.component.ChainAssemblyPlanner;
import utilities.PriceEnum;
import utilities.Utility;

public class ChainAssembly implements ChainAssemblyPlanner {

	String gearType;
	String chainType;

	public ChainAssembly(String gearType, String chainType) {
		super();
		this.gearType = gearType;
		this.chainType = chainType;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public String getChainType() {
		return chainType;
	}

	public void setChainType(String chainType) {
		this.chainType = chainType;
	}

	@Override
	public float getPrice(String orderDate) {

		float chainPrice = PriceEnum.getPrice(chainType).getComponentPrice();
		float gearPrice = PriceEnum.getPrice(gearType).getComponentPrice();
		ArrayList<Long> dateDiif = new Utility().getDateDiff(PriceEnum.PriceDate.PriceChangeDate, orderDate);

		if (dateDiif.get(0) > 0) {

			chainPrice += 30 * dateDiif.get(0);
			gearPrice += 30 * dateDiif.get(0);

		}

		if (dateDiif.get(1) > 0) {
			chainPrice += 30;
			gearPrice += 30;

		}
		// TODO Auto-generated method stub
		return gearPrice + chainPrice;
	}

	public ChainAssembly() {
		super();
		// TODO Auto-generated constructor stub
	}
}
