package kiki.SpringBoot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import kiki.SpringBoot.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    

}