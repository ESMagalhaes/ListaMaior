package view;

import esmagalhaes.fateczl.edu.lista.ListaGenerica;
import controller.MaiorController;

public class MainLista {

	public static void main(String[] args) throws Exception {
		MaiorController oc = new MaiorController();

		ListaGenerica<Integer> L = new ListaGenerica<>();
		L.addLast(3);
		L.addLast(5);
		L.addLast(8);
		L.addLast(12);
		L.addLast(9);
		L.addLast(7);
		L.addLast(6);
		L.addLast(2);
		L.addLast(3);
		L.addLast(7);
		L.addLast(16);

		System.out.println("Lista original:");
		for (int i = 0; i < L.size(); i++) {
			System.out.print(L.get(i) + " ");
		}
		System.out.println();

		oc.ordenar(L);

		System.out.println("Lista ordenada:");
		for (int i = 0; i < L.size(); i++) {
			System.out.print(L.get(i) + " ");
		}
		System.out.println();

		oc.maiores(L);
	}

}
