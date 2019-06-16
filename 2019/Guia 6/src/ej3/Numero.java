package ej3;

public class Numero implements IRelaciones {

	private int n;

	public Numero(int num) {
		n = num;
	}
	
	public int getN() {
		return n;
	}

	@Override
	public boolean esMayor(Object b) {
		if (b instanceof Integer) {
			Integer temp = (Integer) b;

			if (temp.intValue() > n) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

	@Override
	public boolean esMenor(Object b) {
		if (b instanceof Integer) {
			Integer temp = (Integer) b;

			if (temp.intValue() < n) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

	@Override
	public boolean esIgual(Object b) {
		if (b instanceof Integer) {
			Integer temp = (Integer) b;

			if (temp.intValue() != n) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

}
