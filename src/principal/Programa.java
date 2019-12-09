package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empresa;
import entidades.Individual;
import entidades.Pagante;

public class Programa {

	public static void main(String[] args) {
	   
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		
        List<Pagante> lista = new ArrayList<>();
        
        System.out.println("Digite o número de pagantes : ");
        int n = sc.nextInt();
        
        for (int i=1;i<=n;i++) {
           System.out.println("Pagante #" + i + " dados : ");
           System.out.println("Individual ou empresa (i/e)?: " );
           char tipo = sc.next().charAt(0);
           System.out.println("Nome : ");
           String nome = sc.next();
           System.out.println("Renda anual : ");
           double rendaanual = sc.nextDouble();
           if (tipo == 'i') {
        	 System.out.println("Despesa com Saúde : ");
        	 double despsaude = sc.nextDouble();
        	 lista.add(new Individual(nome, rendaanual, despsaude));
           }
           if (tipo == 'e') {
        	 System.out.println("Número de empregados : ");
        	 int numempreg = sc.nextInt();
        	 lista.add(new Empresa(nome, rendaanual, numempreg));
           }
        }
        
        double soma = 0.0;
        System.out.println();
        System.out.println("Gastos Pagos : ");
        
        for (Pagante pagante : lista) {
          double imposto = pagante.imposto();
          System.out.println(pagante.getNome() + " : $ " + pagante.imposto());
          soma += imposto;
        }
        
        System.out.println();
        System.out.println("Gastos totais : " + soma);
		
	    sc.close();
	}

}
