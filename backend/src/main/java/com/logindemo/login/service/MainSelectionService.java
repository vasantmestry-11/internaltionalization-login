package com.logindemo.login.service;

import java.util.List;

import com.logindemo.login.entities.MachineDetails;
import com.logindemo.login.payload.PlantInfoPayload;
import com.logindemo.login.response.DepartmentResponse;
import com.logindemo.login.response.MachineListResponse;
import com.logindemo.login.response.PlantListResponse;

public interface MainSelectionService {

	PlantListResponse getPlantList();

	DepartmentResponse getDepartment(String plant);

	MachineListResponse getMachineList(PlantInfoPayload plantInfoPayload);

}
