package newpackage.exerccio03;

public class Principal {

    public static void main(String[] args) {

        Lista l1 = new Lista();
        Lista l2 = new Lista();

        System.out.println("Primeira Lista");

        l1.inserirNo(10);
        l1.inserirNo(20);
        l1.inserirNo(30);
        l1.inserirNo(40);
        l1.inserirNo(50);

        System.out.println("Segunda Lista");

        l2.inserirNo(10);
        l2.inserirNo(20);
        l2.inserirNo(30);
        l2.inserirNo(40);
        l2.inserirNo(50);

        Lista l3 = new Lista();

    }
}
