package com.main;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import cycle.ChainAssembly;
import cycle.Cycle;
import cycle.Frame;
import cycle.HandleBrake;
import cycle.Seat;
import cycle.wheel;

public class WorkerThread implements Runnable {
  
    private String command;
    private JSONObject orderObject;
    public WorkerThread(JSONObject orderObject, String command){
        this.command=command;
        this.orderObject=orderObject;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
    	cycleOrder(orderObject);

        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }
    
    private static void cycleOrder(JSONObject orderObject) {
		if (orderObject.containsKey("frame") && orderObject.containsKey("wheel") && orderObject.containsKey("seat")
				&& orderObject.containsKey("handleAndBrake") && orderObject.containsKey("chainAssembly")
				&& orderObject.containsKey("orderDate")) {

			Cycle cycle = new Cycle();
			Frame frame = new Frame();
			wheel wheel= new wheel();
			ChainAssembly chainAssembly = new ChainAssembly();
			Seat seat = new Seat();
			HandleBrake handleBrake = new HandleBrake();
			JSONArray frameArray = (JSONArray) orderObject.get("frame");
			JSONArray wheelArray = (JSONArray) orderObject.get("wheel");
			JSONArray seatArray = (JSONArray) orderObject.get("seat");
			JSONArray handleAndBrakeArray = (JSONArray) orderObject.get("handleAndBrake");
			JSONArray chainAssemblyArray = (JSONArray) orderObject.get("chainAssembly");

			String orderDate= orderObject.get("orderDate").toString();

			for (int i = 0; i < frameArray.size(); i++) {

				JSONObject object = (JSONObject) frameArray.get(i);
				frame.setFrameType(object.get("frameType").toString());

			}
			for (int i = 0; i < wheelArray.size(); i++) {

				JSONObject object = (JSONObject) wheelArray.get(i);

				wheel.setTyreType(object.get("tyreType").toString());
				wheel.setSpokeType(object.get("spokeType").toString());
				wheel.setRimType(object.get("rimsType").toString());

			}
			for (int i = 0; i < seatArray.size(); i++) {

				JSONObject object = (JSONObject) seatArray.get(i);
				seat.setSeatType(object.get("seatSize").toString());

			}
			for (int i = 0; i < handleAndBrakeArray.size(); i++) {

				JSONObject object = (JSONObject) handleAndBrakeArray.get(i);
				handleBrake.setHandleType(object.get("handleType").toString());
				handleBrake.setBrakeType(object.get("brakeType").toString());

			}
			for (int i = 0; i < chainAssemblyArray.size(); i++) {

				JSONObject object = (JSONObject) chainAssemblyArray.get(i);
				chainAssembly.setGearType(object.get("gear").toString());
				chainAssembly.setChainType(object.get("chainType").toString());

			}
			cycle.setFrame(frame);
			cycle.setHandleBrake(handleBrake);
			cycle.setSeat(seat);
			cycle.setWheel(wheel);
			cycle.setChainAssembly(chainAssembly);
			System.out.println("Cycle Price: "+cycle.getCyclePrice(orderDate)+" Rs" );

		}			
		else {
			System.out.println("Invalid JsonFile");
		}
	}

}