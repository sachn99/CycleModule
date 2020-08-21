package com.main;

public enum PriceEnum {

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
	
	 PriceEnum(float componentPrice) {
		this.componentPrice = componentPrice;
	}

	public float getComponentPrice() {
		return this.componentPrice;
	}

	public static PriceEnum getPrice(String component) {
		if (component.equalsIgnoreCase("fibreFrame")) return PriceEnum.fibreFrame;
		return PriceEnum.NA;
		

	}

	public PriceEnum getPrice() {
		return this;
	}

}





	
