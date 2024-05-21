package com.lemicode.JAVA57;

public class Main {

	public static void main(String[] args) {
		//「スマートライト」、「スマートサーモスタット」のインスタンスを生成
		SmartLight light = new SmartLight();
		SmartThermostat thermostat  = new SmartThermostat();
		
		//スマートデバイスの情報と、オン/オフの状態を出力します。
		light.displayDeviceInfo();
		light.deviceControll();
		
		thermostat.displayDeviceInfo();
		thermostat.deviceControll();
	}

}
