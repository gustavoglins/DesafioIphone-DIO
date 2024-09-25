public class AparelhoEletronicoImpl implements AparelhoEletronico{

    @Override
    public String ligar(long numero) {
        return "LIGANDO PARA " + numero + "...";
    }

    @Override
    public String atender() {
        return "CHAMADA ATENDIDA...";
    }

    @Override
    public String desligar() {
        return "CHAMADA ENCERRADA...";
    }
}
