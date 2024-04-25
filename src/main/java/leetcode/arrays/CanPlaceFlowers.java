package leetcode.arrays;

public class CanPlaceFlowers {
	public static void main(String[] args) {
		int[] flowerbed = {1,0,0,0,1};
		boolean cPf = canPlaceFlowers(flowerbed, 1);
		if (cPf) {
			System.out.println("Pode plantar");
		} else {
			System.out.println("Não pode plantar");
		}
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		/*
		 *  ver numero do array, se for par, o numero de flores vai ser metade desse numero
		 * se for impar, vai ser o módulo
		 * 
		 * verificar quantos 1ns tem no array.
		 * 
		 * pra saber o boolean, verificar se o numero que tem + o n dá igual o numero inicial
		 * 
		 */

		 int tamanho = flowerbed.length;

		 int floresQueCabe = tamanho % 2 == 0 ? tamanho / 2 : tamanho / 2 + 1;

		 int count = 0;
		 for (int i = 0; i < tamanho; i++) {
			if (flowerbed[i] == 1) {
				count++;
			}
		 }

		 if ( count + n  == floresQueCabe) return true;
		 return false;
	}
}
