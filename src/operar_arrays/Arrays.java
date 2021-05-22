package operar_arrays;

public class Arrays {

	public static void main(String[] args) {
		int matriz[][] = null;
		rellenarMatriz(matriz);
		imprimirMatriz(matriz);

	}

	public static int[][] rellenarMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = (int) (Math.random() * 9 + 1);
			}
		}
		return m;
	}

	public static void imprimirMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print("[");
			for (int j = 0; j < m[0].length; j++) {
				if (j == m.length - 1) {
					System.out.print(m[i][j]);
				} else {
					System.out.print(m[i][j] + ", ");
				}
			}
			System.out.println("]");
		}
	}

}
