/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupal.servicios;

import modelo.Usuario;

/**
 *
 * @author laboratorios
 */
public interface ServicioUsuario {

    public boolean validarusuario(String usuario, String contrtaseña);
    
    void save(Usuario Item);

    void update(Usuario Item);

    void delete(Usuario Item);
    
}
