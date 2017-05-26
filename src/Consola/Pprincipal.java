package Consola;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Administrativo;
import Entidades.Empleado;
import Entidades.Vendedor;

public class Pprincipal {
	private static Scanner scan;
	public static void main(String[] args)
	{
		scan= new Scanner(System.in);
		
		ArrayList<Empleado> emp = new ArrayList<Empleado>();
		String continuar="";
		Integer cont=0;
		do
		{
			System.out.println("el empleado es Administrativos? S/N");
			String rta=scan.nextLine();
			if(rta.equals("S"))
			{
				Administrativo adm = new Administrativo();
				cargaAdmin(adm);
				emp.add(adm);
			}
			else
			{				
				Vendedor ven = new Vendedor();
				cargaVendedor (ven);
				emp.add(ven);
			}
			cont++;
			System.out.println("¿Desea cargar un nuevo empleado? (S/N)");
			continuar=scan.nextLine();
		} 
		while(continuar.equals("S")^(cont.equals(20)));
		
	
	
    for(int x=0;x<emp.size();x++) {
    	System.out.println(emp.get(x).getDni());
    	System.out.println(emp.get(x).getNombre());
    	System.out.println(emp.get(x).getApellido());
    	System.out.println(emp.get(x).getEmail());
    	System.out.println(emp.get(x).getSueldo());
    }
}
		private static void cargaVendedor(Vendedor ven) {
		cargaDatosEmpleado(ven);
		
		System.out.print("ingrese total de ventas");
		ven.setTotalVentas(Double.parseDouble(scan.nextLine()));
		
		System.out.print("ingrese porcentaje de comision");
		ven.setPorcenComision(Integer.parseInt(scan.nextLine()));
	}


		private static void cargaAdmin(Administrativo adm) {
			cargaDatosEmpleado(adm);
			
			System.out.print("ingrese Hs extra: ");
			adm.setHsExtras(Integer.parseInt(scan.nextLine()));
			
			System.out.print("Hs del mes: ");
			adm.setHsMes(Integer.parseInt(scan.nextLine()));
		}
		
		
public static void cargaDatosEmpleado(Empleado emple) {
	
	System.out.print("DNI: ");
	
	emple.setDni(scan.nextLine());
	
	System.out.print("Nombre: ");
	emple.setNombre(scan.nextLine());
	
	System.out.print("Apellido: ");
	emple.setApellido(scan.nextLine());
	
	System.out.print("Email: ");
	emple.setEmail(scan.nextLine());
	
	System.out.print("Sueldo Base: ");
	emple.setSueldoBase(Double.parseDouble(scan.nextLine()));
	
	}

}
	
	

