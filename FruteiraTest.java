import java.util.Scanner;

public class FruteiraTest{

    static Scanner ent = new Scanner(System.in);

    public static void main(String args[]){
	exibirValorDaCompra();
    }
    public static void exibirValorDaCompra(){
	double valor = 0, peso = 0;
	try{
	    System.out.print("Kg de morango ");
	    double morango = ent.nextDouble();
	    System.out.print("Kg de maça ");
	    double maca = ent.nextDouble();
	    Fruteira frutas = new Fruteira(morango, maca);
	    System.out.printf("Preço total a pagar R$ %.2f%n", frutas.calcularValor(peso, valor));
	}catch(Exception y){
	    System.out.println(y);
	    ent.nextLine();
	}
    }

}
