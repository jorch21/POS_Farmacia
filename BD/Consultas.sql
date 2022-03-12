-- Consultas SQL

use SistemaFarmacia

select SUM(total) Ventas
from Ventas
where estado = 'ATENDIDO'

select SUM(stock*pre_venta) Productos
from Productos
where estado = 1 and stock>0

select COUNT(*)
from Productos
where stock = 0 and estado=1

select COUNT(*)
from Productos
where estado=1

select SUM(stock) 'Total Inventario'
from Productos
where estado=1

select SUM(total)
from Ventas

select AVG(stock*pre_compra)
from Productos

SELECT TOP 5 p.nom_pro 'PRODUCTOS'
	 , SUM(v.total) 'VENDIDOS'
FROM   DetalleVentas dv
INNER JOIN Productos p on dv.id_pro = p.id_pro
inner join Ventas v on dv.id_ven = v.id_ven
GROUP  BY p.nom_pro
ORDER  BY SUM(v.total) DESC;
go

select
  Año,
  case when Enero Is not null then Enero else 0 end as Enero,
  case when Febrero Is not null then Febrero else 0 end as Febrero,
  case when Marzo Is not null then Marzo else 0 end as Marzo,
  case when Abril Is not null then Abril else 0 end as Abril,
  case when Mayo Is not null then Mayo else 0 end as Mayo,
  case when Junio Is not null then Junio else 0 end as Junio,
  case when Julio Is not null then Julio else 0 end as Julio,
  case when Agosto Is not null then Agosto else 0 end as Agosto,
  case when Setiembre Is not null then Setiembre else 0 end   as Setiembre,
  case when Octubre Is not null then Octubre else 0 end   as Octubre,
  case when Noviembre Is not null then Noviembre else 0 end   as Noviembre,
  case when Diciembre Is not null then Diciembre else 0 end   as Diciembre
 from
 (
	select YEAR(fecha_registro) Año,DATENAME(MM,fecha_registro) Mes,COUNT(*) Total
	from Clientes
	where estado = 1
	group by fecha_registro
 ) T
 PIVOT (SUM(T.Total) FOR T.Mes IN ([Enero],[Febrero],[Marzo]
,[Abril],[Mayo],[Junio],[Julio],[Agosto],[Setiembre],
[Octubre],[Noviembre],[Diciembre]))PVT
go

Select SUM(v.total) 'Total Ventas'
from Ventas v
where v.fecha_venta = '20/03/2021'
group by v.fecha_venta
go

SELECT CONCAT(MONTH(fecha_registro), '/', Year(fecha_registro)) from Clientes
go

select count(*) Activos
from Clientes 
where estado=1;

Select count(*) Totales
from Clientes

Select COUNT(*) 'Proveedores Certificados'
from Proveedores
where certificacion = 'si' and estado=1;

Select COUNT(*) 'Total Proveedores'
from Proveedores;

select count(*) from clientes
where estado = 1 and fecha_registro between '01/01/1900' and '01/01/2025'

select FORMAT(fecha_registro,'MM/yyyy') Fecha,count(*) as 'Total Registros' from Clientes 
where estado = 1 and year(fecha_registro) = 2021 and month(fecha_registro) = 3
group by fecha_registro

select DATENAME(MM,fecha_registro) Mes,DAY(fecha_registro) Dia,COUNT(*) Total
from Clientes
where estado = 1
group by fecha_registro

select DATENAME(MM,fecha_registro) Mes,DATEPART(DAY,fecha_registro) Dia,COUNT(*) Total from Clientes
where estado = 1 and YEAR(fecha_registro) = 2021
group by fecha_registro

select DATENAME(MM,fecha_registro) Mes,COUNT(certificacion) Certificados,COUNT(*) Total
from Proveedores
where estado = 1 and certificacion = 'SI'
group by fecha_registro