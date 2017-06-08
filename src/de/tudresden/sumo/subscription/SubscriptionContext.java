package de.tudresden.sumo.subscription;

import de.tudresden.sumo.config.Constants;

public enum SubscriptionContext {

	areal_detector(Constants.CMD_SUBSCRIBE_AREAL_DETECTOR_CONTEXT),	
	inductive_loop(Constants.CMD_SUBSCRIBE_INDUCTIONLOOP_CONTEXT),	
	me_detector(Constants.CMD_SUBSCRIBE_MULTI_ENTRY_EXIT_DETECTOR_CONTEXT),	
	lane(Constants.CMD_SUBSCRIBE_LANE_CONTEXT),
	vehicle(Constants.CMD_SUBSCRIBE_VEHICLE_CONTEXT),
	vehicleType(Constants.CMD_SUBSCRIBE_VEHICLETYPE_CONTEXT),
	poi(Constants.CMD_SUBSCRIBE_POI_CONTEXT),
	person(Constants.CMD_SUBSCRIBE_PERSON_CONTEXT),
	route(Constants.CMD_SUBSCRIBE_ROUTE_CONTEXT),
	simulation(Constants.CMD_SUBSCRIBE_SIM_CONTEXT),
	trafficlight(Constants.CMD_SUBSCRIBE_TL_CONTEXT),
	gui(Constants.CMD_SUBSCRIBE_GUI_CONTEXT),
	polygon(Constants.CMD_SUBSCRIBE_POLYGON_CONTEXT),
	junction(Constants.CMD_SUBSCRIBE_JUNCTION_CONTEXT),
	edge(Constants.CMD_SUBSCRIBE_EDGE_CONTEXT);
	
	int id;
	SubscriptionContext(int id){this.id = id;}
	
	public int getID(){return this.id;}
	
}
