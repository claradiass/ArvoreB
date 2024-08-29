public class No {
    int[] elementos;
    No[] filhos;
    No pai;
    boolean ehFolha;

    public No(int dado) {
        this.elementos = new int[3];
        elementos[0] = dado;
        this.filhos = new No[4];
        this.pai = null;
        this.ehFolha = false;

    }

    public int[]  getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public No[] getFilhos() {
        return filhos;
    }

    public void setFilhos(No[] filhos) {
        this.filhos = filhos;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public boolean isEhFolha() {
        return ehFolha;
    }

    public void setEhFolha(boolean ehFolha) {
        this.ehFolha = ehFolha;
    }

    @Override
    public String toString() {
        return "Dados:" + getElementos();
    }
}
