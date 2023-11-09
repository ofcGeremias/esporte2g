public class esportista extends pessoa{
    private int idFederacao;
    public esportista(int idFederacao){
        this.idFederacao = idFederacao;
    }
    public esportista(){

    }
    public String sacar(){
        return "saque viagem";
    }
}
