
package newpackageListaEncadeada;

public class Lista {
    
    NoLIsta inicio;
    
    public void inserir(float valor){  
         
        if(this.inicio == null){  // verifica se tem algum elemento (nó) na lista
            this.inicio = new NoLIsta(valor); //insere o valor ao primeiro nó da lista
            
        }else{
            NoLIsta atual = this.inicio;
            
            while(atual.proximo != null){              
                atual = atual.proximo;
                
            }
            
            atual.proximo = new NoLIsta(valor);
            
        }
    }
              public void imprimir(){
            
            for(NoLIsta p = this.inicio; p != null; p = p.proximo){                
                System.out.println(p.info + "  ");
            }           
        }       
        boolean iguais(Lista l1, Lista l2){
            
            NoLIsta p,q;
            
            p = l1.inicio;
            q = l2.inicio;
            
            while(p.proximo != null){
                p = p.proximo;
                q = q.proximo;
                
                if(p.info != q.info){                   
                    return false;
                }              
            }           
            return true;          
        }
        
}

