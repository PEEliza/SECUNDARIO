
package examen_1ra_evaluacion_test_covid;

public class TestCovid {
 private int edad;
 private boolean Ecronica;
 private double peso;
 private double estatura;

 
 public TestCovid(){
     edad = 70;
     Ecronica = true; //No tiene una enfermedad crónica
     peso = 56.8;
     estatura = 1.75;
    
 }
 
 public void calcularPersonaRiesgo(){
    
     
     if ((edad >= 65) ||  (Ecronica = true) ||  (IMC > 30)){
         System.out.println("PERSONA DE RIESGO");
 }   else ((edad<=65) || (Ecronica = false) ||  (IMC < 30)){
     System.out.println("PERSONA SIN RIESGO");
 }
  
 
 }
 private void calcularIMC(){
     double IMC;
     IMC = peso / (estatura*estatura);
 }
 
 public int getEdad(){
     return edad;
 }
 public boolean getEcronica(){
     return Ecronica;
 }
 public double getPeso(){
     return peso; 
 }
 public double getEstatura(){
     return estatura;
 }
 public void setEdad(int valor){
     edad = valor;
 }
 public void setEcronica(boolean valor){
     Ecronica = valor;
 }
 public void setPeso(double valor){
     peso = valor;
 }
 public void setEstatura(double valor){
     estatura = valor;
 }
}
