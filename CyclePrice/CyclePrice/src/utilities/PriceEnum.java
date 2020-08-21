package utilities;

import java.util.Date;

public enum PriceEnum {

	PriceDate("30-11-2020"),
	alloySteel(200),
	chainAssembly(200),
	clincherRim(200),
	coastBrake(300),
	discBrake(300),
	fibreFrame(300),
	flatHandle(300),
	GearLess(200),
	twoGear(200),
	threeGear(400),
	fourGear(500),
	largeSeat(600),
	mediumSeat(400),
	plainCarbon(200),
	riserHandle(300),
	smallSeat(300),
	steelFrame(300),
	tabularRim(200),
	tubedTyre(300),
	tubelessTyre(400),
	spoke(100),
	StraightGaugespokes(100),
	SingleButtedSpoke(150),
	NA(0);

	 float componentPrice;
	public String PriceChangeDate;
	
	 PriceEnum(float componentPrice) {
		this.componentPrice = componentPrice;
	}

	public float getComponentPrice() {
		return this.componentPrice;
	}
	

	PriceEnum(String PriceChangeDate) {
		this.PriceChangeDate = PriceChangeDate;
	}

	public String getPriceChangeDate() {
		return this.PriceChangeDate;
	}


	public static PriceEnum getPrice(String component) {
		if (component.equalsIgnoreCase("alloySteel")) return PriceEnum.alloySteel;
		if (component.equalsIgnoreCase("chainAssembly")) return PriceEnum.chainAssembly;
		if (component.equalsIgnoreCase("clincherRim")) return PriceEnum.clincherRim;
		if (component.equalsIgnoreCase("coastBrake")) return PriceEnum.coastBrake;
		if (component.equalsIgnoreCase("discBrake")) return PriceEnum.discBrake;
		if (component.equalsIgnoreCase("fibreFrame")) return PriceEnum.fibreFrame;
		if (component.equalsIgnoreCase("flatHandle")) return PriceEnum.flatHandle;
		if (component.equalsIgnoreCase("GearLess")) return PriceEnum.GearLess;
		if (component.equalsIgnoreCase("twoGear")) return PriceEnum.twoGear;
		if (component.equalsIgnoreCase("threeGear")) return PriceEnum.threeGear;
		if (component.equalsIgnoreCase("fourGear")) return PriceEnum.fourGear;
		if (component.equalsIgnoreCase("largeSeat")) return PriceEnum.largeSeat;
		if (component.equalsIgnoreCase("mediumSeat")) return PriceEnum.mediumSeat;
		if (component.equalsIgnoreCase("plainCarbon")) return PriceEnum.plainCarbon;
		if (component.equalsIgnoreCase("riserHandle")) return PriceEnum.riserHandle;
		if (component.equalsIgnoreCase("smallSeat")) return PriceEnum.smallSeat;
		if (component.equalsIgnoreCase("steelFrame")) return PriceEnum.steelFrame;
		if (component.equalsIgnoreCase("tabularRim")) return PriceEnum.tabularRim;
		if (component.equalsIgnoreCase("tubedTyre")) return PriceEnum.tubedTyre;
		if (component.equalsIgnoreCase("tubelessTyre")) return PriceEnum.tubelessTyre;
		if (component.equalsIgnoreCase("spoke")) return PriceEnum.spoke;
		if (component.equalsIgnoreCase("StraightGaugespokes")) return PriceEnum.StraightGaugespokes;
		if (component.equalsIgnoreCase("SingleButtedSpoke")) return PriceEnum.SingleButtedSpoke;

		
		return PriceEnum.NA;
		

	}

	public PriceEnum getPrice() {
		return this;
	}

}





	
