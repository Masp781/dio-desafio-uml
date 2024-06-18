public class NavegadorInternet {
    private void exibirPagina(){
        System.out.println("Exibindo a página...");
        System.out.println("Página exibida com sucesso.");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando uma nova aba...");
        atualizarPagina();
        exibirPagina();
    }
    private void atualizarPagina(){
        System.out.println("Atualizando a página...");
    }
}
