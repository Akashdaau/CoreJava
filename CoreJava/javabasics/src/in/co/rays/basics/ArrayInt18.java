package in.co.rays.basics;

public class ArrayInt18 {

		public static void main(String[] args) {
			int[] a = { 5, 4, 3, 2, 1 };

			ArrayInt18 e = new ArrayInt18();

			int z = e.position(a, 1);

			System.out.println(z);

		}

		public int position(int[] b, int c) {

			int k = 0;

			for (int i = 0; i < b.length; i++) {

				if (c == b[i]) {
					k = i;

					return k;
				}

			}
			if (k == 0) {

				return -1;
			}
			return k;
			
			

		}

	}