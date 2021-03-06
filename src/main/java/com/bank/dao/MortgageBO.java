package com.bank.dao;

public class MortgageBO {
	private double monthlyPrincipalAndInterest;
	private double monthlyTax;
	private double monthlyInsurance;
	private double totalPayment;
	
public double getMonthlyPrincipalAndInterest() {
		return monthlyPrincipalAndInterest;
	}

	public void setMonthlyPrincipalAndInterest(double monthlyPrincipalAndInterest) {
		this.monthlyPrincipalAndInterest = monthlyPrincipalAndInterest;
	}

	public double getMonthlyTax() {
		return monthlyTax;
	}

	public void setMonthlyTax(double monthlyTax) {
		this.monthlyTax = monthlyTax;
	}

	public double getMonthlyInsurance() {
		return monthlyInsurance;
	}

	public void setMonthlyInsurance(double monthlyInsurance) {
		this.monthlyInsurance = monthlyInsurance;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

public MortgageBO() {}
}
