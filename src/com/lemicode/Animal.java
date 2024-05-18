package com.lemicode;

public class Animal {

	private String species;
	private int age;
	private String healthStatus;
	
	
	public Animal(String species, int age, String healthStatus) {
		this.species = species;
		this.age = age;
		this.healthStatus = healthStatus;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
		
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getHealthStatus() {
		return healthStatus;
	}
	
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}	
	
	// 動物の情報を表示するメソッド
    public void displayInfo() {
        System.out.println( species + "(年齢: " + age + ", 健康状態: " + healthStatus);
    }
}
