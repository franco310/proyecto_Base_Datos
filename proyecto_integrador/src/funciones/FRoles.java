
package funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.Roles;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class FRoles  implements Serializable {

    public static boolean Insertar(Roles roles) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_insert_roles(?,?,?,?,?)";
            lstP.add(new Parametro(1, roles.getCodigo()));
            lstP.add(new Parametro(2, roles.getNombre()));
            lstP.add(new Parametro(3, roles.getDescripcion()));
            lstP.add(new Parametro(4, roles.getEstado()));
            lstP.add(new Parametro(5, roles.getCodigo_modulo()));
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
    public static ArrayList<Roles> llenarRoles(ConjuntoResultado rs) throws Exception {
        ArrayList<Roles> lst = new ArrayList<Roles>();
        Roles roles = null;
        try {
            while (rs.next()) {
                roles = new Roles(rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("pdescripcion"),rs.getInt("pestado"), rs.getInt("pcodigo_modulo"));
                lst.add(roles);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Roles> ObtenerRoleses() throws Exception {
        ArrayList<Roles> lst = new ArrayList<Roles>();
        try {
            String sql = "select * from master.f_select_roles()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarRoles(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Roles ObtenerRolesDadoCodigo(int codigo) throws Exception {
        Roles lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_roles_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Roles();
            lst = llenarRoles(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Roles roles) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_roles(?,?,?,?,?)";
            lstP.add(new Parametro(1, roles.getNombre()));
            lstP.add(new Parametro(2, roles.getDescripcion()));
            lstP.add(new Parametro(3, roles.getEstado()));
            lstP.add(new Parametro(4, roles.getCodigo_modulo()));
            lstP.add(new Parametro(5, roles.getCodigo()));
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

    public static boolean eliminar(Roles roles) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_roles(?)";
            lstP.add(new Parametro(1, roles.getCodigo()));
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
}
