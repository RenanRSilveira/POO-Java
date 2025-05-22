package POO22.List;

import java.util.LinkedList;


public class ListaLigada {
    // É mais manipulável, ideal para quando você precisa de operações eficientes de inserção e remoção,
    // especialmente em posições específicas da lista.

    LinkedList<Usuario> usuarios = new LinkedList<>();

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void adicionarInicio(Usuario usuario){
        usuarios.addFirst(usuario);
    }
    
    public void adicionarFinal(Usuario usuario){
        usuarios.addLast(usuario);
    }

    public void getLista(){
        for(Usuario usuario : usuarios){
            System.out.println(usuario.getNome());
        }
    }

    public void getIndex(int index){
        Usuario valor = usuarios.get(index);
        System.out.println(valor.getNome());
    }


}
