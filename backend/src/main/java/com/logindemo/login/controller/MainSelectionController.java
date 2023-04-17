package com.logindemo.login.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logindemo.login.entities.MachineDetails;
import com.logindemo.login.payload.PlantInfoPayload;
import com.logindemo.login.response.DepartmentResponse;
import com.logindemo.login.response.MachineListResponse;
import com.logindemo.login.response.PlantListResponse;
import com.logindemo.login.service.MainSelectionService;


@RestController
@RequestMapping("/main")
public class MainSelectionController {
	
	@Autowired
	private MainSelectionService selectionService;
	
	
	
	@GetMapping("/plants")
	public ResponseEntity<PlantListResponse> getPlantsList(){
		PlantListResponse plantList= selectionService.getPlantList();
		return ResponseEntity.status(HttpStatus.OK).body(plantList); 
		
	}
	
	@GetMapping("department/{plant}")
	public ResponseEntity<DepartmentResponse> getDepartment(@PathVariable String plant){
		DepartmentResponse department = selectionService.getDepartment(plant);
		return ResponseEntity.status(HttpStatus.OK).body(department);
	}
	
	@PostMapping("/machinelist")
	public ResponseEntity<MachineListResponse> getMachineList(@RequestBody PlantInfoPayload plantInfoPayload){
		return ResponseEntity.status(HttpStatus.OK).body(selectionService.getMachineList(plantInfoPayload));
	}
	

}
