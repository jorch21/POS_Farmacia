use neptuno

select pe.FechaPedido,de.preciounidad,de.cantidad,de.preciounidad*de.cantidad Total
from detallesdepedidos de
inner join Pedidos pe on de.idpedido = pe.IdPedido
where year(pe.FechaPedido) = 1994 and MONTH(pe.FechaPedido) = 09 and DAY(pe.FechaPedido) = 01

select sum(de.preciounidad*de.cantidad) Suma
from detallesdepedidos de
inner join Pedidos pe on de.idpedido = pe.IdPedido
where year(pe.FechaPedido) = 1994 and MONTH(pe.FechaPedido) = 08 --and DAY(pe.FechaPedido) = 01
--group by pe.FechaPedido

select pe.FechaPedido,de.idpedido,pr.nombreProducto,de.preciounidad,de.cantidad,de.descuento
from detallesdepedidos de
inner join productos pr on de.idproducto = pr.idproducto
inner join Pedidos pe on de.idpedido = pe.IdPedido
where year(pe.FechaPedido) = 1994 and MONTH(pe.FechaPedido) = 09 and DAY(pe.FechaPedido) = 01;
go

create procedure sp_suma_total
@año int,@mes int
as
	select sum(de.preciounidad*de.cantidad) Suma
	from detallesdepedidos de
	inner join Pedidos pe on de.idpedido = pe.IdPedido
	where year(pe.FechaPedido) = @año and MONTH(pe.FechaPedido) = @mes;
go

execute sp_suma_total 1994,10


select * from proveedores