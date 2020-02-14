package Cajero;

public class Cuenta {

	
		private int numerodecuenta;
		private String tipodecuenta;
		private String clave;
		private long saldo;
		
		public enum Tipodecuenta {
			ahorro, corriente, vista
		}
		
		public Cuenta() {
			this.saldo = 0;
			this.numerodecuenta = (int) (Math.random() * 2000000) + 1;

		}


		public Cuenta(int numerodecuenta, String tipodecuenta, String clave, int saldo) {
			super();
			this.numerodecuenta = numerodecuenta;
			this.tipodecuenta = tipodecuenta;
			this.clave = clave;
			this.saldo = saldo;
		}

		public int getNumerodecuenta() {
			return numerodecuenta;
		}


		public void setNumerodecuenta(int numerodecuenta) {
			this.numerodecuenta = numerodecuenta;
		}


		public String getTipodecuenta() {
			return tipodecuenta;
		}


		public void setTipodecuenta(String tipodecuenta) {
			this.tipodecuenta = tipodecuenta;
		}


		public String getClave() {
			return clave;
		}


		public void setClave(String clave) {
			this.clave = clave;
		}


		public long getSaldo() {
			return saldo;
		}


		public void setSaldo(long saldo) {
			this.saldo = saldo;
		}


		public void crearcuenta() {
		
		}
		
		public void ingresarrut () {
			
		}

		public void crearclave() {
			
		}

		public void consultarmovimientos() {
	
		}


		@Override
		public String toString() {
			return "Cuenta [numerodecuenta=" + numerodecuenta + ", tipodecuenta=" + tipodecuenta + ", clave=" + clave
					+ ", saldo=" + saldo + "]";
		}
		
		
}
