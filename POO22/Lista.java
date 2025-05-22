package POO22;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void getLista(){
        for(Usuario usuario : usuarios){
            System.out.println(usuario.getNome());
        }
    }
}