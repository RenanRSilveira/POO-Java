package POO22;

public class App {
    public static void main(String[] args) {
        Lista listaUsuarios = new Lista();
        Usuario usuario1 = new Usuario("A");
        Usuario usuario2 = new Usuario("B");
        Usuario usuario3 = new Usuario("C");

        listaUsuarios.adicionarUsuario(usuario1);
        listaUsuarios.adicionarUsuario(usuario2);
        listaUsuarios.adicionarUsuario(usuario3);

        //listaUsuarios.getLista();

        ListaLigada listaUsuarios2 = new ListaLigada();
        
        listaUsuarios2.adicionarUsuario(usuario1);
        listaUsuarios2.adicionarUsuario(usuario2);
        listaUsuarios2.adicionarInicio(usuario3);

        listaUsuarios2.getLista();
        System.out.println();
        listaUsuarios2.getIndex(2);
        
    }
}
