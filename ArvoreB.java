public class ArvoreB {
    No raiz;


    public ArvoreB() {
        this.raiz = null;
    }

    public void inserir(Integer dado){
        No newNo = new No(dado);
        if (raiz == null){
            raiz = newNo;
            raiz.ehFolha = true;
        } else {
            inserirArvore(getRaiz(), dado);
        }
    }

    public void inserirArvore(No no, Integer dado){
        if(no.ehFolha){
            for (int i = no.elementos.length - 1 ; i >= 0; i--){

                if(no.elementos[i] != null && no.elementos[i].compareTo(dado) < 0){
                    int aux = no.elementos[i];
                    no.elementos[i] = dado;
                    no.elementos[i+1] = aux;

                    if(no.elementos.length > 3){
                        split(no, dado);
                    }
                }
            }
        }
    }

    public void split(No no, Integer dado){
        int valorQueVaiSubir = no.elementos[1];
        No newNo = new No(valorQueVaiSubir);

        no.elementos[1] = null;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}