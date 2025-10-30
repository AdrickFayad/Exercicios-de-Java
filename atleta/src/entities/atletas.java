package entities;

public class atletas {

	public String name;
	public char sexo;
	public double altura;
	public double peso;


public atletas (String name, char sexo, double altura, double peso) {

	this.name = name;
	this.sexo = sexo;
	this.altura = altura;
	this.peso = peso;
}	

   public String getName() {
	   return name;
   }
   public char getSexo() {
	   return sexo;
   }
   public double getAltura() {
	return altura;   
   }
   public double getPeso() {
	   return peso;
   }


}