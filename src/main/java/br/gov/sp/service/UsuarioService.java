import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.Usuario;
import br.gov.sp.fatec.springtopicos20231.exception.UsuarioNaoEncontradoException;
import br.gov.sp.fatec.springtopicos20231.repository.UsuarioRepository;

@Service

public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;
@@ -31,7 +32,7 @@ public List<Usuario> buscarTodosUsuarios() {
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isEmpty()) {
                     throw new UsuarioNaoEncontradoException("Usuário não existe!");
        }
        return usuarioOp.get();
    }