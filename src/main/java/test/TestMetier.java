package test;

import java.util.List;

import metier.Chaussure;
import metier.MetierImpl;

public class TestMetier {

	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Chaussure> chauss = metier.getChaussuresParMotCle("nike");
		for (Chaussure c : chauss)
		System.out.println(c.getNomChaussure());
		}
}
