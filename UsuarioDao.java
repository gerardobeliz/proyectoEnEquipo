/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupal.dao;

import modelo.Usuario;

/**
 *
 * @author luca
 */
public interface UsuarioDao {

  Usuario get(Long id);

    void save(Usuario item);

    void update(Usuario item);

    void delete(Usuario item);
}
