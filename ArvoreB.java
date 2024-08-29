public class ArvoreB {
    No raiz;


    public ArvoreB() {
        this.raiz = null;
    }

    public void inserir(int dado){
        No newNo = new No(dado);
        if (raiz == null){
            raiz = newNo;
            raiz.ehFolha = true;
        } else {
            inserirArvore(getRaiz(), dado);
        }
    }

    public void inserirArvore(No no, int dado){
        if(no.ehFolha){
            for (int i = no.elementos.length - 1 ; i > 0; i--){
                if(no.elementos[i] > dado){
                    int aux = no.elementos[i];
                    no.elementos[i] = dado;
                    no.elementos[i+1] = aux;

                }
            }
        }
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}