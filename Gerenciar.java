package aeroporto;


public class Gerenciar {
    

    
    Aeroporto aero = new Aeroporto();
        
    public void decolar(Aeroporto aeroporto){
        aeroporto.lista = null;
        aeroporto.nome = null;
        aeroporto.prefixo = null;
    }
    
    public void pousar(Aeroporto aeroporto, Aviao aviao){
        for(int i =0; i < 2; i++){
            if(aeroporto.lista[i]==null){
                aeroporto.lista[i] = aviao;
                break;
            }
        }
    }
    
     public void listar(){
        for(int i =0; i< 2; i ++){
            if(aero.lista[i]!= null && aero.lista[i].companhia != null){
                System.out.println("Companhia:" + aero.lista[i].companhia);
                System.out.println("Prefixo:" + aero.lista[i].prefixo);
                System.out.println("\n");
            }
            
            else {
                System.out.println("Espaço vazio\n");
            }
                    
        }
    
}

     public boolean aeroDisponiveis(Aeroporto aeroporto){
         boolean cheio = true;
         for(int i =0; i < 2; i++){
             if(aeroporto.lista[i]==null){
                 cheio = false;
                 break;
                 
             }
         }
         return cheio;
     }

     public boolean aeroNaoDisponiveis(Aeroporto aeroporto){
         boolean vazio = false;
         for(int i =0; i < 2; i++){
             if(aeroporto.lista[i]==null){
                 vazio = true;
                 break;
                 
             }
         }
         return vazio;
     }    
     
     
}
