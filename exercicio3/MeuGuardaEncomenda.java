public class MeuGuardaEncomenda implements GuardaEncomenda{ 
    
    private Encomenda[] encomendas = new Encomenda[1000];
    private int tamanho = 0;

    // adiciona uma nova encomenda (não aceita
    // encomenda duplicada)
    @Override
    public void adiciona(Encomenda e){
        if(tamanho == 1000)
            return;
        
        int i;
        for(i = 0; i < tamanho; ++i)
            if(encomendas[i].compareTo(e) == 0)
                return;
        
        encomendas[tamanho] = e;
        tamanho++;
    }
    
    // retorna o númerodeEncomendas (não nulas)
    @Override
    public int getSize(){
        return tamanho;
    } 
    
    // ordena as Encomendas (ponteiros para null vêm por último)
    @Override
    public void ordena(){
        
        boolean troca;

        do{
            troca = false;

            int i;
            for(i = 0; i < tamanho-1; ++i){
                if(encomendas[i].compareTo(encomendas[i+1])>0){
                    Encomenda tmp = encomendas[i];
                    encomendas[i] = encomendas[i+1];
                    encomendas[i+1] = tmp;
                    troca = true;
                }
            }
        }while(troca);
    }

    @Override
    public String toString(){
        String ret = "";
        int i;
        for(i = 0; i < tamanho; ++i){
            ret = ret + encomendas[i] + ", ";
        }
        return ret;
    }
    
}