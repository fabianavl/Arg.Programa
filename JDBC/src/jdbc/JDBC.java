package jdbc;

import java.sql.*;

public class JDBC {

    
    public static void main(String[] args) {
        
        try {
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022", "root", "jyngrch4");
            Statement stm = conexion.createStatement();
            
            String db = "select * from empleado";
            ResultSet rs = stm.executeQuery(db);
            System.out.println("Id\t DNI\t \tNombre\tApellido\tNacionalidad\tDepartamento");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2) + "\t " + rs.getString(3)
                + "\t "+ rs.getString(4)+ "  \t "+ rs.getString(5)+ "   \t "+ rs.getString(6));
            }
            
            db = "select * from departamento";
            rs= stm.executeQuery(db);
            System.out.println("Id\t Nombre\t\t Descripción");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+ "\t " + rs.getString(2)+"  \t "+ rs.getString(3));
            }
            
            //3.a:
            String ingresarSQL  = "insert into empleado values(id, '39548762','Sofia', 'Ramirez','Argentina','Recursos Humanos')";
            stm.executeUpdate(ingresarSQL);
            System.out.println("Ingreso de datos correctamente");
            
            //3.b:
            ingresarSQL = "update empleado set nacionalidad = 'Honduras' where id = 4";
            stm.executeUpdate(ingresarSQL);
            System.out.println("Ingreso de datos correctamente");
            
            //3.c:
            ingresarSQL = "delete from departamento where id = 5";
            stm.executeUpdate(ingresarSQL);
            System.out.println("Ingresos de datos correctamente");
            
            //3.d:
            db = "select * from empleado where departamento = 'Logística'";
            rs = stm.executeQuery(db);
            System.out.println("Id\t DNI\t \tNombre\tApellido\tNacionalidad\tDepartamento");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2) + "\t " + rs.getString(3)
                + "\t "+ rs.getString(4)+ "  \t "+ rs.getString(5)+ "   \t "+ rs.getString(6));
            }
            
            //3.e:
            db = "select * from departamento order by nombreDepartamento asc";
            rs= stm.executeQuery(db);
            System.out.println("Id\t Nombre\t\t Descripción");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+ "\t " + rs.getString(2)+"  \t "+ rs.getString(3));
            }
            
            
        } catch (Exception e) {
            System.out.println("No se puede realizar la conexion ");
            e.printStackTrace();
        }
        
    }
    
}
