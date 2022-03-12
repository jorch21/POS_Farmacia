-------Procedimientos Almacenados

use SistemaFarmacia;
go

---P.A. Tabla Cliente
create procedure RegistrarCliente
	@dni varchar(12),
	@nom varchar(40),
	@dir varchar(100),
	@id_dis int,
	@sexo char(1),
	@tel varchar(9) ,
	@fec_reg date
as
begin 
	insert into Clientes (dni_ruc,nom_cli,dir_cli,cod_dis,sexo,telefono,fecha_registro)
	values(@dni,@nom,@dir,@id_dis,@sexo,@tel,@fec_reg);
end;
go

create procedure EliminarCliente
@id_cli int 
as
	if exists ( select *from Clientes where id_cli=@id_cli )
begin 
	update Clientes set estado = 0
	where id_cli = @id_cli;
end;
go

create procedure ModificarCliente
	@id_cli int,
	@dni varchar(12),
	@nom varchar(40),
	@dir varchar(100),
	@id_dis int,
	@sexo char(1),
	@tel varchar(9),
	@fecha date
as
BEGIN
	if exists (select *from Clientes where id_cli=@id_cli)
begin
	update Clientes set
		dni_ruc=@dni, 
		nom_cli=@nom,
		dir_cli=@dir, 
		cod_dis=@id_dis, 
		sexo=@sexo, 
		telefono=@tel,
		fecha_registro=@fecha
	where id_cli = @id_cli;
end;
	else 
		RAISERROR ('NO PUEDE MODIFICAR POR QUE NO EXISTE ESE CLIENTE',10,1)
END;
go

create procedure ListarClientes
as
begin
	Select cli.id_cli,cli.cod_cli,cli.dni_ruc,cli.nom_cli,cli.dir_cli,di.nom_dis,cli.sexo,cli.telefono,cli.fecha_registro
	from Clientes cli
	inner join Distritos di on cli.cod_dis = di.cod_dis
	where cli.estado = 1;
end;
go

create procedure BuscarCliente
@nomcli varchar(40)
as
begin
	Select cli.id_cli,cli.cod_cli,cli.dni_ruc,cli.nom_cli,cli.dir_cli,di.nom_dis,cli.sexo,cli.telefono,cli.fecha_registro
	from Clientes cli
	inner join Distritos di on cli.cod_dis = di.cod_dis
	WHERE cli.nom_cli like (@nomcli) and cli.estado=1;
end;
go

create procedure BuscarDniCliente
@dni varchar(12)
as
begin
	Select cli.id_cli,cli.cod_cli,cli.dni_ruc,cli.nom_cli,cli.dir_cli,di.nom_dis,cli.sexo,cli.telefono,cli.fecha_registro
	from Clientes cli
	inner join Distritos di on cli.cod_dis = di.cod_dis
	WHERE cli.dni_ruc like (@dni) and cli.estado=1;
end;
go

create procedure BuscarIdDistrito
@nom_dis varchar(50)
as
begin
	SELECT * from Distritos Where nom_dis = @nom_dis;
end;
go

create procedure BuscarNombreCliente
@dni_ruc varchar(12)
as
begin
	select * from Clientes where dni_ruc=@dni_ruc and estado=1
end;
go


--Procedimientos Empleados
create procedure ListarEmpleados
as
begin
	Select u.id_usu,u.cod_usu,r.nom_rol,u.dni_usu,u.nom_usu,u.ape_usu,u.dir_usu,d.nom_dis,u.edad,u.telefono,u.fecha_ingreso,u.sueldo,
		   u.correo,u.clave,u.dni_usu
	from Usuarios u
	inner join Roles r on u.cod_rol = r.cod_rol
	inner join Distritos d on u.cod_dis = d.cod_dis
	where u.estado = 1;
end;
go

create procedure RegistrarEmpleado
	@cod_rol int,
	@dni varchar(8),
	@nom varchar(30),
	@ape varchar(70),
	@dir varchar(100),
	@cod_dis int,
	@edad varchar(2),
	@telefono varchar(9),
	@fec_ing date,
	@sueldo decimal(10,2),
	@correo varchar(80)
as
begin 
	insert into Usuarios(cod_rol,dni_usu,nom_usu,ape_usu,dir_usu,cod_dis,edad,telefono,fecha_ingreso,sueldo,correo)
	values(@cod_rol,@dni,@nom,@ape,@dir,@cod_dis,@edad,@telefono,@fec_ing,@sueldo,@correo);
end;
go

create procedure ModificarEmpleado
	@id_usu int,
	@cod_rol int,
	@dni varchar(8),
	@nom varchar(30),
	@ape varchar(70),
	@dir varchar(100),
	@cod_dis int,
	@edad varchar(2),
	@telefono varchar(9),
	@fec_ing date,
	@sueldo decimal(10,2),
	@correo varchar(80)
as
BEGIN
	if exists (select *from Usuarios where id_usu=@id_usu)
begin
	update Usuarios set
		cod_rol=@cod_rol, 
		dni_usu=@dni,
		nom_usu=@nom,
		ape_usu=@ape,
		dir_usu=@dir, 
		cod_dis=@cod_dis, 
		edad=@edad, 
		telefono=@telefono,
		fecha_ingreso=@fec_ing,
		sueldo=@sueldo,
		correo=@correo
	where id_usu = @id_usu;
end;
	else 
		RAISERROR ('NO PUEDE MODIFICAR POR QUE NO EXISTE ESE USUARIO',10,1)
END;
go

create procedure EliminarEmpleado
@id_usu int 
as
	if exists ( select *from Usuarios where id_usu=@id_usu )
begin 
	update Usuarios set estado = 0
	where id_usu = @id_usu;
end;
go

create procedure BuscarEmpleados
@nom_usu varchar(30)
as
begin
	Select u.id_usu,u.cod_usu,r.nom_rol,u.dni_usu,u.nom_usu,u.ape_usu,u.dir_usu,d.nom_dis,u.edad,u.telefono,u.fecha_ingreso,u.sueldo,
		   u.correo,u.clave
	from Usuarios u
	inner join Roles r on u.cod_rol = r.cod_rol
	inner join Distritos d on u.cod_dis = d.cod_dis
	where u.nom_usu like (@nom_usu) and u.estado = 1;
end;
go

create procedure BuscarNombreEmpleado
@dni varchar(8)
as
begin
	select * from Usuarios where dni_usu=@dni and estado=1
end;
go

--Procedimientos Medicamentos
create procedure ListarMedicamentos
as
begin
	Select p.id_pro,p.cod_pro,c.nom_cat,p.nom_pro,p.pre_venta,p.pre_compra,p.fecha_venc,p.stock
	from Productos p
	inner join Categorias c on p.id_cat = c.id_cat
	where p.estado = 1;
end;
go

create procedure ListarMedicamentosStock
as
begin
	Select p.id_pro,p.cod_pro,c.nom_cat,p.nom_pro,p.pre_venta,p.pre_compra,p.fecha_venc,p.stock
	from Productos p
	inner join Categorias c on p.id_cat = c.id_cat
	where p.stock=0 and p.estado = 1;
end;
go

create procedure BuscarMedicamento
@cod varchar(8)
as
begin
	select * from Productos where cod_pro=@cod and estado=1
end;
go

create procedure RegistrarMedicamento
@idcat int,
@nompro varchar(50),
@preventa decimal(10,2),
@precompra decimal(10,2),
@fechaven date
as
begin
	insert into Productos(id_cat,nom_pro,pre_venta,pre_compra,fecha_venc)
	values(@idcat,@nompro,@preventa,@precompra,@fechaven);
end;
go

create procedure ModificarMedicamento
@idpro int,
@idcat int,
@nompro varchar(50),
@preventa decimal(10,2),
@precompra decimal(10,2),
@fechaven date
as
BEGIN
	if exists (select *from Productos where id_pro=@idpro)
begin
	update Productos set
		id_cat=@idcat,
		nom_pro=@nompro,
		pre_venta=@preventa,
		pre_compra=@precompra,
		fecha_venc=@fechaven
	where id_pro = @idpro;
end;
	else 
		RAISERROR ('NO PUEDE MODIFICAR POR QUE NO EXISTE ESE MEDICAMENTO',10,1)
END;
go

create procedure EliminarMeciamento
@idpro int 
as
	if exists ( select *from Productos where id_pro=@idpro )
begin 
	update Productos set estado = 0
	where id_pro = @idpro;
end;
go

create procedure BuscarNombreMedicamento
@nom_pro varchar(100)
as
begin
	Select p.id_pro,p.cod_pro,c.nom_cat,p.nom_pro,p.pre_venta,p.pre_compra,p.fecha_venc,p.stock
	from Productos p
	inner join Categorias c on p.id_cat = c.id_cat
	where p.nom_pro like (@nom_pro) and p.estado = 1;
end;
go

--Procedimientos Proveedores
create procedure ListarProveedores
as
begin
	Select pr.id_prov,pr.cod_prov,pr.ruc_prov,pr.nom_prov,pr.dir_prov,pr.telefono,pr.correo,pr.certificacion,pr.fecha_registro
	from Proveedores pr
	where pr.estado = 1;
end;
go

create procedure RegistrarProveedor
	@ruc varchar(11),
	@nom varchar(100),
	@dir varchar(100),
	@tel varchar(9),
	@correo varchar(70),
	@cert varchar(2),
	@fecha date
as
begin 
	insert into Proveedores(ruc_prov,nom_prov,dir_prov,telefono,correo,certificacion,fecha_registro)
	values(@ruc,@nom,@dir,@tel,@correo,@cert,@fecha);
end;
go

create procedure ModificarProveedor
	@id_prov int,
	@ruc varchar(11),
	@nom varchar(100),
	@dir varchar(100),
	@tel varchar(9),
	@correo varchar(70),
	@cert varchar(2),
	@fecha date
as
BEGIN
	if exists (select *from Proveedores where id_prov=@id_prov)
begin
	update Proveedores set
		ruc_prov=@ruc, 
		nom_prov=@nom,
		dir_prov=@dir, 
		telefono=@tel, 
		correo=@correo, 
		certificacion=@cert,
		fecha_registro=@fecha
	where id_prov = @id_prov;
end;
	else 
		RAISERROR ('NO PUEDE MODIFICAR POR QUE NO EXISTE ESE PROVEEDOR',10,1)
END;
go

create procedure EliminarProveedor
@id_prov int 
as
	if exists ( select *from Proveedores where id_prov=@id_prov )
begin 
	update Proveedores set estado = 0
	where id_prov = @id_prov;
end;
go

create procedure BuscarProveedor
@nom_prov varchar(100)
as
begin
	Select pr.id_prov,pr.cod_prov,pr.ruc_prov,pr.nom_prov,pr.dir_prov,pr.telefono,pr.correo,pr.certificacion,pr.fecha_registro
	from Proveedores pr
	where pr.nom_prov like (@nom_prov) and pr.estado = 1;
end;
go

create procedure BuscarNombreProveedor
@ruc_prov varchar(11)
as
begin
	select * from Proveedores where ruc_prov=@ruc_prov and estado=1
end;
go

---Procedimientos Venta
create procedure RegistrarVenta
	@id_usu int,
	@id_cli int,
	@serie varchar(200),
	@fecha_venta date,
	@igv decimal(10,2),
	@total decimal(10,2)
as
begin
	insert into Ventas (id_usu,id_cli,num_serie,fecha_venta,igv,total)
	values (@id_usu,@id_cli,@serie,@fecha_venta,@igv,@total)
end;
go

--Procedimiento Detalle Venta
CREATE PROCEDURE RegistrarDetalleVenta
@id_pro int,
@cantidad int,
@total decimal(10,2)
AS
declare @idven int
BEGIN
	SELECT  @idven = MAX(id_ven) from Ventas
	insert into DetalleVentas(id_pro,id_ven,cantidad,precioTotal)
	values(@id_pro,@idven,@cantidad,@total)
	UPDATE Productos SET stock = stock-@cantidad where id_pro = @id_pro;
END;
go

--procedimiento Orden de Compra
create procedure RegistrarCompra
	@id_prov int,
	@id_usu int,
	@serie varchar(200),
	@fecha_ord date,
	@igv decimal(10,2),
	@total decimal(10,2)
as
begin
	insert into OrdenCompra(id_prov,id_usu,numSerie,fecha_ord,igv,total)
	values (@id_prov,@id_usu,@serie,@fecha_ord,@igv,@total)
end;
go

--procedimiento Detalle Orden de Compra
create procedure RegistarDetalleCompra
@id_pro int,
@cantidad int,
@total decimal(10,2)
AS
declare @id_compra int
BEGIN
	SELECT  @id_compra = MAX(id_ord) from OrdenCompra
	insert into DetalleOrdenCompra values(@id_compra,@id_pro,@cantidad,@total)
	UPDATE Productos SET stock = stock+@cantidad where id_pro = @id_pro;
END;
go

--PROCEDIMIENTO CATEGORIAS
create procedure RegistrarCategoria
	@nombre varchar(50)
as
begin 
	insert into Categorias(nom_cat)
	values (@nombre)
end;
go

create procedure EliminarCategoria
@id_cat int
as
	if exists (select *from Categorias where id_cat=@id_cat)

begin
	Update Categorias set estado=0
	where id_cat=@id_cat
end;
go

create procedure ModificarCategoria
@id_cat int,
@nombre varchar(30)
as
begin 
	if exists (select *from Categorias where id_cat=@id_cat)
	begin 
		update Categorias set
		nom_cat=@nombre
		where id_cat = @id_cat;
	end;
	else
		RAISERROR ('IMPOSIBLE MODIFICA, CATEGORIA NO EXISTE',30,10)
end;
go

create procedure ListarCategoria
as
begin
	Select * from Categorias
	where estado=1;
end;
go

create procedure ProductoVendidos
@fecha date
as
begin
	Select SUM(dv.cantidad) 'Total Productos'
	from DetalleVentas dv
	inner join Ventas v on dv.id_ven = v.id_ven
	where v.fecha_venta = @fecha
	group by v.fecha_venta
end;
go

create procedure VentasTotales
@fecha date
as
begin
	Select SUM(v.total) 'Total Ventas'
	from Ventas v
	where v.fecha_venta = @fecha
	group by v.fecha_venta
end;
go

create procedure ListarTop
as
begin
	SELECT TOP 5 p.nom_pro 'PRODUCTOS'
	 , SUM(v.total) 'VENDIDOS'
	FROM   DetalleVentas dv
	INNER JOIN Productos p on dv.id_pro = p.id_pro
	inner join Ventas v on dv.id_ven = v.id_ven
	GROUP  BY p.nom_pro
	ORDER  BY SUM(v.total) DESC
end;
go

select * from Usuarios