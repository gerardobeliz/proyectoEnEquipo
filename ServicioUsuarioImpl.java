/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupal.servicios;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import proyectogrupal.dao.UsuarioDao;
import proyectogrupal.dao.UsuarioDaoImpl;

/**
 *
 * @author laboratorios
 */
public class ServicioUsuarioImpl implements ServicioUsuario {

    private final UsuarioDao UsuarioDao;

    public ServicioUsuarioImpl() {

        UsuarioDao = new UsuarioDaoImpl();
    }

    @Override
    public boolean validarusuario(String usuario, String contraseña) {

        try {
            //ACA ME CONECTO A LA BASE DE DATOS Y TRAIGO EL USUSARIO Y EL HAS
            String usuariodb = "admin";
            HashSalt hs = PasswordUtil.getHash("root");

            Logger.getLogger(ServicioUsuarioImpl.class.getName());

            //ACA VA MI LOGICA
            boolean esValido = PasswordUtil.ValidatePass(contraseña, hs.getHash(), hs.getSalt());
            if (usuariodb.equals(usuario) && esValido == true) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(ServicioUsuarioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Usuario get(Long id) {
        return UsuarioDao.get(id);
    }

    @Override
    public void save(Usuario item) {
        // aplicarLogica(item);
        UsuarioDao.save(item);
    }

    @Override
    public void update(Usuario item) {
        //aplicarLogica(item);
        UsuarioDao.update(item);
    }

    @Override
    public void delete(Usuario item) {
        UsuarioDao.delete(item);
    }
}
