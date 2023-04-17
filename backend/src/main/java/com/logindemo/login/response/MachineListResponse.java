package com.logindemo.login.response;

import java.util.List;

import com.logindemo.login.entities.MachineDetails;

public class MachineListResponse {
	
	private List<MachineDetails> machineList;

	public List<MachineDetails> getMachineList() {
		return machineList;
	}

	public void setMachineList(List<MachineDetails> machineList) {
		this.machineList = machineList;
	}
	
	

}
