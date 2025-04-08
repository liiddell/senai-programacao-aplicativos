public class Main {
    public static void main(String[] args) {

        Capa capa = new Capa ("Verde", "Plastico", 25.00);
        Celular celular = new Celular("Samsung", "Cinza", "S25", 2500.0, capa);

        System.out.println(celular.calcularTotal());

    }
}