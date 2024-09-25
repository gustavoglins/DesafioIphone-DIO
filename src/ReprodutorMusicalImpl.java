public class ReprodutorMusicalImpl implements ReprodutorMusical{

    @Override
    public String tocarMusica(String musica) {
        return "TOCANDO " + musica + "...";
    }

    @Override
    public String pausarMusica() {
        return "MÚSICA PAUSADA...";
    }

    @Override
    public String proximaMusica() {
        return "PROXIMA MÚSICA...";
    }
}
