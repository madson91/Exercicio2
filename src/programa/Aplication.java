package programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("quantos funcionatios vc quer cadastrar?");
		int qtd = sc.nextInt();
		for (int i = 0; i < qtd; i++) {
			Funcionario func = new Funcionario();
			System.out.println("Digite o ID");
			func.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Digite o nome");
			func.setNome(sc.nextLine());
			System.out.println("Digite o salario");
			func.setSalario(sc.nextDouble());
			lista.add(func);
			
		}
		System.out.println("entre com o id do funciona rio para ter aumento do salario!!");
		int id  = sc.nextInt();
		Funcionario result = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(result == null ) {
			System.out.println("Funcionario nao identificado");
		}else {
			result.setSalario(result.getSalario()*10);
			imprimirTodos(lista);
			
		}
		
		sc.close();

	}

	private static void imprimirTodos(List<Funcionario> lista) {
		
		if(lista != null) {
			for (Funcionario funcionario : lista) {
				System.out.println(funcionario);
			}
		}
	}

}
