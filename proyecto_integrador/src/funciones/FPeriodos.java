package funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.Periodos;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Franco-Pc
 */
public class FPeriodos  implements Serializable {

    public static boolean Insertar(Periodos periodos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_insert_periodos(?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, periodos.getCodigo()));
            lstP.add(new Parametro(2, periodos.getNombre()));
            lstP.add(new Parametro(3, periodos.getFecha_inicio()));
            lstP.add(new Parametro(4, periodos.getFecha_fin()));
            lstP.add(new Parametro(5, periodos.getTipo()));
            lstP.add(new Parametro(6, periodos.getObservaciones()));
            lstP.add(new Parametro(7, periodos.getCodigo_sicoa()));
            lstP.add(new Parametro(8, periodos.getEstado()));
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
    public static ArrayList<Periodos> llenarPeriodos(ConjuntoResultado rs) throws Exception {
        ArrayList<Periodos> lst = new ArrayList<Periodos>();
        Periodos periodos = null;
        try {
            while (rs.next()) {
                periodos = new Periodos(rs.getInt("pcodigo"),rs.getString("pnombre"),rs.getDate("pfecha_inicio"),rs.getDate("pfecha_fin"),rs.getInt("ptipo"),rs.getString("pobservaciones"), rs.getInt("pcodigo_sicoa"), rs.getInt("pestado"));
                lst.add(periodos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Periodos> ObtenerPeriodos() throws Exception {
        ArrayList<Periodos> lst = new ArrayList<Periodos>();
        try {
            String sql = "select * from master.f_select_periodos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarPeriodos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Periodos ObtenerPeriodosDadoCodigo(int codigo) throws Exception {
        Periodos lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_periodos_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Periodos();
            lst = llenarPeriodos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Periodos periodos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_periodos(?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, periodos.getNombre()));
            lstP.add(new Parametro(2, periodos.getFecha_inicio()));
            lstP.add(new Parametro(3, periodos.getFecha_fin()));
            lstP.add(new Parametro(4, periodos.getTipo()));
            lstP.add(new Parametro(5, periodos.getObservaciones()));
            lstP.add(new Parametro(6, periodos.getCodigo_sicoa()));
            lstP.add(new Parametro(7, periodos.getEstado()));
            lstP.add(new Parametro(8, periodos.getCodigo()));
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

    public static boolean eliminar(Periodos periodos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_periodos(?)";
            lstP.add(new Parametro(1, periodos.getCodigo()));
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
    

