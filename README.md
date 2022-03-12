# Sistema de Ventas

## Descripcion
Contiene los siguientes módulos:
* Empleados
* Compras
* Ventas
* Productos
* Categorias
* Proveedores
* Clientes
* Reportes
* Indicadores

![Screen principal](https://github.com/jorch21/POS_Farmacia/blob/main/screen.jpg)

---
---

### INSTRUCCIONES DE CONEXION A LA BD
Abrir el archivo de ConexionBD que se encuentra en el paquete Modelo.
* database = **Nombre de Base de datos**
* user = **Usuario del Motor SQL Server**
* password = **Contraseña del Motor SQL Server**

```java
public static Connection getConexion() {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=SistemaFarmacia;"
                + "user=sa;"
                + "password=sise2021;"
                + "loginTimeout=30";
        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
```

