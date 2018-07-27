
package funciones;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.Usuario;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Franco-Pc
 */
public class FUsuario implements Serializable {

    public static boolean Insertar(Usuario usuario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from  actividades.insertar_usuario(?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, usuario.getApellidos()));
            lstP.add(new Parametro(2, usuario.getNombres()));
            lstP.add(new Parametro(3, usuario.getIdentificacion()));
            lstP.add(new Parametro(4, usuario.getNombre_corto()));
            lstP.add(new Parametro(5, usuario.getClave()));
            lstP.add(new Parametro(6, usuario.getClave_pregunta()));
            lstP.add(new Parametro(7, usuario.getClave_respuesta()));
            lstP.add(new Parametro(8, usuario.getMail()));
            lstP.add(new Parametro(9, usuario.getUltima_ip()));
            lstP.add(new Parametro(10, usuario.getCodigo_salt()));
            lstP.add(new Parametro(11, usuario.getRuta_firma()));
            lstP.add(new Parametro(12, usuario .getCodigo()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static ArrayList<Usuario> llenarUsuarios(ConjuntoResultado rs) throws Exception {
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        Usuario usuario = null;
        try {
            while (rs.next()) {
                usuario = new Usuario(rs.getLong("pcodigo"), rs.getString("papellidos"), rs.getString("pnombres"),rs.getString("pidentificacion"), rs.getString("pnombre_corto"), rs.getString("pclave"), rs.getString("pclave_pregunta"), rs.getString("pclave_respuesta"), rs.getString("pmail"), rs.getInt("pestado"), rs.getTimeStamp("pprimer_acceso"), rs.getTimeStamp("putimo_acceso"), rs.getString("pultima_ip"), rs.getTimeStamp("pfecha_modificacion"), rs.getString("pcodigo_salt"), rs.getString("pruta_firma"));
                lst.add(usuario);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Usuario> ObtenerUsuarios() throws Exception {
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        try {
            String sql = "select * from actividades.obtener_usuario()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarUsuarios(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Usuario ObtenerUsuarioDadoCodigo(long codigo) throws Exception {
        Usuario lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.obtener_usuario_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Usuario();
            lst = llenarUsuarios(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Usuario usuario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.actualizar_usuario(?,?,?,?,?,?,?,?,?,?,?,?)";
             lstP.add(new Parametro(1, usuario .getApellidos()));
            lstP.add(new Parametro(2, usuario .getNombres()));
            lstP.add(new Parametro(3, usuario .getIdentificacion()));
            lstP.add(new Parametro(4, usuario .getNombre_corto()));
            lstP.add(new Parametro(5, usuario .getClave()));
            lstP.add(new Parametro(6, usuario .getClave_pregunta()));
            lstP.add(new Parametro(7, usuario .getClave_respuesta()));
            lstP.add(new Parametro(8, usuario .getMail()));
            lstP.add(new Parametro(9, usuario .getUltima_ip()));
            lstP.add(new Parametro(10, usuario .getCodigo_salt()));
            lstP.add(new Parametro(11, usuario .getRuta_firma()));
            lstP.add(new Parametro(12, usuario .getCodigo()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static boolean eliminar(Usuario usuario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.eliminar_usuario_usuario_rol_tutor(?)";
            lstP.add(new Parametro(1, usuario.getCodigo()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }}
    
    
    

