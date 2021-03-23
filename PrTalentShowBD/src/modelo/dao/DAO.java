package modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Interface de Acceso a Datos
 * Created by Jesus on 15/04/2019.
 */
public interface DAO {
    Connection getConexion() throws SQLException;
    void close() throws SQLException;
}
