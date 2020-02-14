package Cajero;

import java.util.List;

public class Cliente extends Cuenta{

	
		private String rut;
		private String nombre;
		private String apellido;
		private List<Cuenta> cut; 
		
		
		public Cliente() {
			super();
		}

		
		public Cliente(String rut, String nombre, String apellido, List<Cuenta> cut) {
			super();
			this.rut = rut;
			this.nombre = nombre;
			this.apellido = apellido;
			this.cut = cut;
		}


		
		public String getRut() {
			return rut;
		}



		public void setRut(String rut) {
			this.rut = rut;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellido() {
			return apellido;
		}



		public void setApellido(String apellido) {
			this.apellido = apellido;
		}



		public List<Cuenta> getCut() {
			return cut;
		}



		public void setCut(List<Cuenta> cut) {
			this.cut = cut;
		}



		public void abonar() {

		}
		public void retirar() {
			
		}
		
		public void consultar() {
			
		}
		
		public void cambiarclave() {		

		}
		
}	
