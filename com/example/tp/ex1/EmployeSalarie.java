package com.example.tp.ex1;

public class EmployeSalarie extends Employe {
	protected double salaireMensuel;

	public EmployeSalarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double calculerSalaire() {
		return salaireMensuel;
	}
}