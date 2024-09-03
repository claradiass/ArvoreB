import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArvoreB a = new ArvoreB();
        a.inserir(20);
        System.out.println(Arrays.toString(a.raiz.elementos));

        a.inserir(10);
        System.out.println(Arrays.toString(a.raiz.elementos));

        a.inserir(1);
        System.out.println(Arrays.toString(a.raiz.elementos));

        a.inserir(21);
        System.out.println(Arrays.toString(a.raiz.elementos));
    }
}
