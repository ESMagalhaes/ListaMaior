package controller;

import esmagalhaes.fateczl.edu.lista.ListaGenerica;

public class MaiorController {

	public static void ordenar(ListaGenerica<Integer> L) throws Exception {
		int n = L.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (L.get(j) > L.get(j + 1)) {

					int valorJ = L.get(j);
					int valorJ1 = L.get(j + 1);

					L.remove(j);

					L.addValor(valorJ1, j);

					L.remove(j + 1);

					L.addValor(valorJ, j + 1);
				}
			}
		}

	}
	
	public static void maiores(ListaGenerica<Integer> L) throws Exception{
		System.out.println("Maior valor: " + L.get(L.size() - 1));
		System.out.println("Segundo maiior valor: " + L.get(L.size() - 2));
	}
}
