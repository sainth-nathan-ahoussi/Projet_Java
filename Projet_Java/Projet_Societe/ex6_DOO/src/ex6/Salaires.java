package ex6;

public class Salaires {
	public static void main (String[] args){
		Employee employee1 = new ConcreteManutentionnaires("Bezon","Stefan", 35, 2000, 300 ) ;
		Employee employee2 = new ConcreteReprésentant("Alton","Jhons", 49, 1998, 160 ) ;
		Employee employee3 = new ConcreteTechnicien("Johnson","Alice", 42, 2005, 500 ) ;
		Employee employee4 = new ConcreteVendeur("Bob","Williams", 38, 2008, 1000 ) ;
		
		EmployeàRisque employeàRisque1 = new ConcreteEmployeàRisque( "Mary", "Eloise", 30, 2012);
		EmployeàRisque employeàRisque2= new ConcreteEmployeàRisque( "Smith", "sam", 52, 1990);
		
		
		double salaire1 = employee1.calculSalaire(); 
		double salaire2 = employee2.calculSalaire(); 
		double salaire3 = employee3.calculSalaire(); 
		double salaire4 = employee4.calculSalaire(); 
		
		double salairerisque1 = employeàRisque1.calculSalaire();
		double salairerisque2 = employeàRisque2.calculSalaire();
		
		System.out.println(employee1.getNom() +" "+  "a pour Salaire : "+ salaire1);
		System.out.println(employee2.getNom() +" "+ "a pour Salaire : "+  salaire2);
		System.out.println(employee3.getNom() +" "+ "a pour Salaire : "+  salaire3);
		System.out.println(employee4.getNom() +" "+  "a pour Salaire : "+ salaire4);
		System.out.println(employeàRisque1.getNom() +" "+  "a pour Salaire : "+ salairerisque1);
		System.out.println(employeàRisque2.getNom() +" "+  "a pour Salaire : "+ salairerisque2);
		
		EmployeàRisque[] employerisque = new EmployeàRisque[]{employeàRisque1, employeàRisque2 };
		
		double totalSalairesrisque = CalcultotalSalaireRisque(employerisque );
		System.out.println("Total des salaires des employes à risque : "+" " +totalSalairesrisque);	
	}
		public static double CalcultotalSalaireRisque(EmployeàRisque[] employeàRisque) {
			double Salairetotal = 0;
			for (EmployeàRisque employee : employeàRisque ) {
				Salairetotal += employee.calculSalaire();
			}
			return Salairetotal;
			
		}
}
