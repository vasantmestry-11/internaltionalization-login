package com.logindemo.login.entities;

public class MachineDetails {
	
	private String machine;
	private String workOrder;
	private String item;
	private String sandS;
	private float runtime;
	private float downtime;
	private int production;
	
	
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	public String getWorkOrder() {
		return workOrder;
	}
	public void setWorkOrder(String workOrder) {
		this.workOrder = workOrder;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getSandS() {
		return sandS;
	}
	public void setSandS(String sandS) {
		this.sandS = sandS;
	}
	
	
	
	public float getRuntime() {
		return runtime;
	}
	public void setRuntime(float runtime) {
		this.runtime = runtime;
	}
	public float getDowntime() {
		return downtime;
	}
	public void setDowntime(float downtime) {
		this.downtime = downtime;
	}
	public int getProduction() {
		return production;
	}
	public void setProduction(int production) {
		this.production = production;
	}
	@Override
	public String toString() {
		return "MachineDetails [machine=" + machine + ", workOrder=" + workOrder + ", item=" + item + ", sandS=" + sandS
				+ "]";
	}
	
	

}
