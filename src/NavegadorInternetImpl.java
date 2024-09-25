public class NavegadorInternetImpl implements NavegadorInternet{

    @Override
    public String exibirPagina(String url) {
        return "ACESSANDO URL: " + url + "\nSite: " + url;
    }

    @Override
    public String criarNovaAba() {
        return "NOVA GUIA ABERTA...";
    }

    @Override
    public String atualizarPagina() {
        return "ATUALIZANDO A PAGINA... \nPAGINA ATUALIZADA";
    }
}
