package com.logindemo.login.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logindemo.login.entities.MachineDetails;
import com.logindemo.login.payload.PlantInfoPayload;
import com.logindemo.login.response.DepartmentResponse;
import com.logindemo.login.response.MachineListResponse;
import com.logindemo.login.response.PlantListResponse;
import com.logindemo.login.service.MainSelectionService;
import com.logindemo.login.service.helper.MachineListHelper;

@Service
public class MainSelectionServiceImpl implements MainSelectionService {
	
	String[] plants= new String[]{"GRGA","NYC"};
	List<String> list= Arrays.asList(plants);
	
	String[] grgaDepts= new String[]{"FEX1","FEX2"};
	List<String> grga = Arrays.asList(grgaDepts);
	
	String[] nycDepts= new String[]{"TEX1","TEX2"};
	List<String> nyc = Arrays.asList(nycDepts);
	
	@Autowired
	private MachineListHelper machineListHelper;
	
	@Override
	public PlantListResponse getPlantList() {
		PlantListResponse response = new PlantListResponse();
		response.setPlantList(list);
		return response;
	}


	@Override
	public DepartmentResponse getDepartment(String plant) {
		DepartmentResponse response = new DepartmentResponse();
		if(plant.equalsIgnoreCase("GRGA")) {
			response.setDeptNames(grga);
		}
		else {
			response.setDeptNames(nyc);
		}
		return response;
	}


	@Override
	public MachineListResponse getMachineList(PlantInfoPayload plantInfoPayload) {
		//TODO return the machine list according to the plant or dept
		MachineListResponse machineList = new MachineListResponse();
		List<MachineDetails> machineDetailsList = machineListHelper.getMachineList();
		machineList.setMachineList(machineDetailsList);
		return machineList;
	}

}
