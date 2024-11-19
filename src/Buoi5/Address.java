package Buoi5;

import java.util.Scanner;

public class Address {
	private String commune;
	private String district;
	private String city;
	
	public Address() {

	}

	public Address(String commune, String district, String city) {
		this.commune = commune;
		this.district = district;
		this.city = city;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap xa: ");
		commune = sc.nextLine();
		System.out.println("Nhap quan: ");
		district = sc.nextLine();
		System.out.println("Nhap thanh pho: ");
		city = sc.nextLine();	
	}
	void xuat() {
		System.out.printf(String.format("%-10s %-10s %-10s", commune, district, city));
	}
}
