package com.logindemo.login.service.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.logindemo.login.entities.MachineDetails;

@Service
public class MachineListHelper {
	
	public List<MachineDetails> getMachineList(){
		List<MachineDetails> list = new ArrayList<MachineDetails>();
		MachineDetails md1 = new MachineDetails();
		md1.setMachine("FEX407001");
		md1.setItem("1458902");
		md1.setWorkOrder("81349037");
		md1.setSandS("TASG4569851");
		md1.setDowntime(2);
		md1.setRuntime(6);
		md1.setProduction(456982);
		
		MachineDetails md2 = new MachineDetails();
		md2.setMachine("FEX407002");
		md2.setItem("1458912");
		md2.setWorkOrder("81349047");
		md2.setSandS("TASG4569852");
		md2.setDowntime(3);
		md2.setRuntime(5);
		md2.setProduction(356982);
		
		list.add(md1);
		list.add(md2);
		
		return list;
		
		
	}

}
