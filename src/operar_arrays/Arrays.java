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
	
	public static int[][] suma(int[][] m1, int[][] m2) {

		int fila1 = m1.length;
		int colum2= m2[0].length;
		int suma [][] = new int [fila1][colum2];
		if (fila1==colum2) {
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m2[0].length; j++) {
					for (int h = 0; h < m1[0].length; h++) {
						suma[i][j] += m1[i][h]+m2[h][j];
					}
				}
			}
			imprimirMatriz(suma);
		}else {
			System.out.println("null");
		}
		
		return suma;
	}
	
	public void nuevometodo2() {
		
	}
	
	

}
