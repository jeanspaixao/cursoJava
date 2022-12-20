package edu.jean.secondweek;

public class Usuario {
    public static void main(String[] args) throws Exception {

    SmartTV smartTv = new SmartTV();
    
    
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();


    System.out.println("Canal atual: "+smartTv.canal);
    System.out.println("Volume atual: "+smartTv.volume);
    System.out.println("TV ligada? "+smartTv.ligada);
}
}
