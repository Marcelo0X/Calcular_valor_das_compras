public class Fruteira{

    private double morango;
    private double maca;

    public Fruteira(double morango, double maca){
	setMorango(morango);
	setMaca(maca);
    }
    public void setMorango(double morango){
	this.morango = morango;
    }
    public double getMorango(){
	return morango;
    }
    public void setMaca(double maca){
	this.maca = maca;
    }
    public double getMaca(){
	return maca;
    }
    public double calcMorango(){
	if(morango <= 5){
	    return morango * 2.50;
	}else{
	    return morango * 2.20;
	}
    }
    public double calcMaca(){
	if(maca <= 5){
	    return maca * 1.80;
	}else{
	    return maca * 1.50;
	}
    }
    public double calcularValor(double peso, double valor){
	peso = maca + morango;
	valor = calcMorango() + calcMaca();
	if(peso > 8 || valor > 25.00){
	    return valor * (1 - 0.1);
	}else{
	    return valor;
	}
    }

}
