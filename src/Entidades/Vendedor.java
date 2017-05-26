package Entidades;

public class Vendedor extends Empleado {
	
		private double porcenComision;
		private double totalVentas;
		
		
		public double getPorcenComision() {
			return porcenComision;
		}
		public void setPorcenComision(int porcenComision) {
			this.porcenComision = porcenComision;
		}
		public double getTotalVentas() {
			return totalVentas;
		}
		public void setTotalVentas(double todalVentas){
			this.totalVentas = totalVentas;
		}
		@Override
		//sueldoBase + (porcenComision*totalVtas/100)
		public double getSueldo(){
			return getSueldoBase() + (getPorcenComision()*getTotalVentas()/100);			
		}

	
}
