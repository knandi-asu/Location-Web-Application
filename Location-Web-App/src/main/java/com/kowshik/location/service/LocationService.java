package com.kowshik.location.service;

import java.util.List;

import com.kowshik.location.entities.Location;

public interface LocationService {
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationbyId(int id);
	List<Location> getAllLocations();
}
