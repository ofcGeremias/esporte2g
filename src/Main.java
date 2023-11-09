public class Main {
    public static void main(String[] args) {

        pessoa qualquer = new pessoa();
        qualquer.setNome(("Geremias Macedo"));
        System.out.println(qualquer.getNome());

        esportista jogadora = new esportista();
        esportista surfista = new esportista(345);
        jogadora.setNome("gabriel do volei");
        System.out.println(jogadora.getNome());

        pessoa outra = new pessoa();
        String retorno = outra.sacar();
        System.out.println(retorno);
        outra = new esportista();
        retorno = outra.sacar();
        System.out.println(retorno);
    }
}