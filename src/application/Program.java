package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.println("Quantos contribuintes?");
		int nr = sc.nextInt();
		
		for(int  i=0; i<nr;i++) {
			System.out.println("Nome:");
			sc.nextLine();			
			String nome = sc.nextLine();
			System.out.println("Renda:");
			double renda = sc.nextDouble();
			sc.nextLine();
			System.out.println("Pessoa fisica?y/n");
			char ch = sc.next().charAt(0);
			if (ch == 'y') {
				System.out.println("Gastos com saude");
				double gastos = sc.nextDouble();
				lista.add(new Fisica(nome,renda,gastos));				
			}
			else {
				System.out.println("Quantos funcionarios?");
				int funcionarios = sc.nextInt();
				lista.add(new Juridica(nome,renda,funcionarios));
			}
			
			
		}
		double batata = 0.0;
		for (Contribuinte con : lista) {
			System.out.println(con.imppago());
			batata += con.imppago();
		}
		System.out.println(batata);
		
		sc.close();

	}

}
