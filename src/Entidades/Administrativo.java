package Entidades;

public class Administrativo extends Empleado {

		private int hsExtras;
		private int hsMes;
		
		
		public int getHsExtras() {
			return hsExtras;
		}
		public void setHsExtras(int hsExtras) {
			this.hsExtras = hsExtras;
		}
		public int getHsMes() {
			return hsMes;
		}
		public void setHsMes(int hsMes) {
			this.hsMes = hsMes;
		}
		@Override
		public double getSueldo(){
		//Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
			return (getSueldoBase()*((getHsExtras() * 1.5) + getHsMes()));
		}
		
		

		
}
