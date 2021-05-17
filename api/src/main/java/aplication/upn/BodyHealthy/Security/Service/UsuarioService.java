package aplication.upn.BodyHealthy.Security.Service;


import aplication.upn.BodyHealthy.Security.Model.Usuario;
import aplication.upn.BodyHealthy.Security.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }
    public Usuario getUsuario(int id){
        return usuarioRepository.getUsuario(id);
    }
    public Usuario insert(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> getByRol(int idRol){
        return usuarioRepository.getByRol(idRol);
    }
    public Usuario findByCorreo(String s){
        return usuarioRepository.findByCorreo(s);
    }
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByCorreo(email);
    }
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }


}