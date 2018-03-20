package aeroporto;

public class Aeroporto {
    String prefixo;
    String nome;
    Aviao lista[] = new Aviao[2];
    
    public Aeroporto(){
        prefixo = "";
        nome = "";
        for(int i =0; i<2; i++){
            lista[i].companhia = null;
            lista[i].prefixo = null;
        }
}
    
}
