public class Principal {

    public static void main(String[] args) {

        ClienteLocal c1 = new ClienteLocal(1224,"Juan", 15);
        Cliente c2 = new Cliente(7654,"Maria");
        ClienteInternet c3 = new ClienteInternet(174, "Pedro", "pedro@gomez.com.ar", "15 de agosto 234");
        

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
