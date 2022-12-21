package edu.jean.thirdweek;

public class Methods {
    public static void main(String[] args) throws Exception{

    System.out.println("Soma = "+realizaSoma(3,4));
    System.out.println("Saudação: " +saudacao(8));
    }

    public static int realizaSoma(int numero1, int numero2){
        return numero1+numero2;
   }
   public static String saudacao(int hora) {
   
        if(hora<7) {
        return "Boa madrugada";    
    } else if(hora<13) {
        return "Bom dia";    
    } else if(hora<18) {
        return "Boa tarde";    
    } else if(hora<24) {
        return "Boa noite";    
    } else {
        return "Hora inválida";
   }
    }


}
