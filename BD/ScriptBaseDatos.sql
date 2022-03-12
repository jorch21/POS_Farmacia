create database SistemaFarmacia;

use SistemaFarmacia;

create table Distritos(
cod_dis int identity not null primary key,
nom_dis varchar(50) not null);

create table Clientes(
id_cli int identity(1,1) not null primary key,
cod_cli as('CL'+RIGHT('000000'+CONVERT(VARCHAR, id_cli),(6))),
dni_ruc varchar(12) not null,
nom_cli varchar(40) not null,
dir_cli varchar(100) not null,
cod_dis int not null,
sexo char(1) not null,
telefono varchar(9) not null,
fecha_registro date not null,
estado bit default(1)
foreign key (cod_dis) references Distritos(cod_dis));

create table Roles(
cod_rol int identity(1,1) not null primary key,
nom_rol varchar(25) not null);

create table Usuarios(
id_usu int identity(1,1) not null primary key,
cod_usu as('US'+RIGHT('000000'+CONVERT(VARCHAR, id_usu),(6))),
cod_rol int not null,
dni_usu varchar(8) not null,
nom_usu varchar(30) not null,
ape_usu varchar(70) not null,
dir_usu varchar(100) not null,
cod_dis int not null,
edad varchar(2) not null,
telefono varchar(9) not null,
fecha_ingreso date not null,
sueldo decimal(10,2) not null,
correo varchar(80) not null,
clave as('D'+RIGHT(dni_usu,9)),
estado bit default(1),
foreign key (cod_rol) references Roles(cod_rol),
foreign key (cod_dis) references Distritos(cod_dis));

create table Categorias(
id_cat int identity(1,1) not null primary key,
cod_cat as('CT'+RIGHT('000000'+CONVERT(VARCHAR, id_cat),(6))),
nom_cat varchar(50) not null,
estado bit default(1));

create table Productos(
id_pro int identity(1,1) not null primary key,
cod_pro as('PR'+RIGHT('000000'+CONVERT(VARCHAR, id_pro),(6))),
id_cat int not null,
nom_pro varchar(50) not null,
pre_venta decimal(10,2) not null,
pre_compra decimal(10,2) not null,
fecha_venc date not null,
stock int not null default 0,
estado bit default(1),
foreign key (id_cat) references Categorias(id_cat));

create table Ventas(
id_ven int identity(1,1) not null primary key,
cod_ven as('VT'+RIGHT('000000'+CONVERT(VARCHAR, id_ven),(6))),
id_usu int not null,
id_cli int not null,
num_serie varchar(200) not null,
fecha_venta date not null,
igv decimal(10,2) not null,
total decimal(10,2) not null,
estado varchar(20) not null default 'ATENDIDO',
foreign key (id_usu) references Usuarios(id_usu),
foreign key (id_cli) references Clientes(id_cli));

create table DetalleVentas(
id_detalle int identity(1,1) not null primary key,
cod_detalle as('DV'+RIGHT('000000'+CONVERT(VARCHAR, id_detalle),(6))),
id_pro int not null,
id_ven int not null,
cantidad int not null,
precioTotal decimal(10,2) not null,
foreign key (id_pro) references Productos(id_pro),
foreign key (id_ven) references Ventas(id_ven));

create table Proveedores(
id_prov int identity(1,1) not null primary key,
cod_prov as('PV'+RIGHT('000000'+CONVERT(VARCHAR, id_prov),(6))),
ruc_prov varchar(11) not null,
nom_prov varchar(100) not null,
dir_prov varchar(100) not null,
telefono varchar(9) not null,
correo varchar(70) not null,
certificacion varchar(2) not null,
fecha_registro date not null,
estado bit default(1));

create table OrdenCompra(
id_ord int identity(1,1) not null primary key,
cod_ord as('OR'+RIGHT('000000'+CONVERT(VARCHAR, id_ord),(6))),
id_prov int not null,
id_usu int not null,
numSerie varchar(200) not null,
fecha_ord date not null,
igv decimal(10,2) not null,
total decimal(10,2) not null,
estado varchar(20) not null default 'RECIBIDO',
foreign key (id_prov) references Proveedores(id_prov),
foreign key (id_usu) references Usuarios(id_usu));

create table DetalleOrdenCompra(
id_det int identity(1,1) not null primary key,
cod_det as('DC'+RIGHT('000000'+CONVERT(VARCHAR, id_det),(6))),
id_ord int not null,
id_pro int not null,
cantidad int not null,
precioTotal decimal(10,2) not null,
foreign key (id_ord) references OrdenCompra(id_ord),
foreign key (id_pro) references Productos(id_pro));

insert into Distritos Values
('Barranco'),('Breña'),('Carabayllo'),('Chaclacayo'),('Cieneguilla'),('Comas'),('Miraflores'),('San Juan de Miraflores'),('Villa el Salvador'),('Villa Maria del Triunfo');

insert into Roles Values
('Administrador'),('Farmaceutico');

insert into Categorias(nom_cat) Values
('Analgesicos'),
('Antinflamatorios'),
('Aines'),
('Antibioticos'),
('Amoxicilna'),
('Cefalosporinas'),
('Eritromicina'),
('Quinolona'),
('Ampicilina'),
('Vancomicina'),
('Azitromicina'),
('Penicilinas');

insert into Productos(id_cat,nom_pro,pre_venta,pre_compra,fecha_venc,stock) Values
(1,'Asgesic 10mg',2,1.50,'01/02/2023',80),
(1,'Asgesic 20mg',3.50,3,'10/03/2023',95),
(1,'Asgesic 30mg',5,4.50,'15/02/2023',74),
(1,'Asgesic 60mg',8.50,8,'09/01/2023',65),
(1,'Dolalgial',3,2.50,'17/01/2023',76),
(1,'Naclodil',5,4.50,'11/12/2022',43),
(1,'Dolostop 20mg',6,5.50,'05/05/2022',54),
(1,'Aspirina',1,0.50,'25/11/2022',99),
(1,'Cafiaspirina',1,0.50,'13/04/2023',65),
(1,'Dolpiret Cmp',2,1.50,'29/03/2023',54),
(1,'Dolpiret Ssp',3,2.50,'21/01/2023',64),
(1,'Dontoflamon Cmp',2.50,2,'07/12/2022',13),
(1,'Dontoflamon Ssp',3.50,3,'16/09/2022',65),
(1,'Ibuflamar',6.50,6,'05/02/2023',75),
(1,'Piredol',5,4.50,'06/03/2023',48),-------------------------1ra categoria
(2,'Flamadin',3,2.50,'18/05/2023',46),
(2,'Diprofen Cmp',6,5.50,'23/11/2022',84),
(2,'Diprofen Ssp',7.50,7,'08/07/2022',46),
(2,'Ibupronal Forte',10,9,'19/10/2022',64),
(2,'Ceflex 200mg',4.50,3,'20/09/2022',76),
(2,'Flamax 15mg',2.50,2,'22/04/2023',56),
(2,'Flexidol 100mg',6.50,6,'15/01/2023',87),
(2,'Flexidol 200mg',11,10,'11/05/2023',46),
(2,'Sigma Bron 100mg',8.50,8,'07/04/2023',63),
(2,'Argifen 400mg',15,14,'09/05/2023',36),
(2,'Acefen',6,5.50,'01/10/2022',84),
(2,'Flamarion 60mg',9,8.50,'16/09/2022',86),
(2,'Analtin 200mg',7,6.50,'17/08/2022',46),
(2,'Medox',20,18,'18/02/2023',29),  -----------------------2da categoria
(3,'Dolpiret Ssp',6.50,6,'22/01/2023',65),
(3,'Dolpiret Cmp',5,4.50,'24/08/2022',55),
(3,'Asgesic 10mg',2.50,2,'26/07/2023',25),
(3,'Asgesic 20mg',4,3.50,'17/06/2023',44),
(3,'Ibupronal',6,5.50,'15/08/2022',54),
(3,'Ibupronal Forte',11,10,'06/09/2022',31),
(3,'Flamax 15mg',6.50,6,'05/10/2022',65),
(3,'Flexidol 100mg',2.50,2,'29/07/2023',25),
(3,'Flexidol 200mg',4.50,4,'31/05/2023',45),  ---------------3ra categoria
(12,'Terbocil 6 Benzatinica',20,18,'13/12/2022',100),
(12,'Terbocil 3 Procainica',15,14,'25/12/2022',10),
(12,'Terbocil 3 Sodica',15,14,'08/12/2022',30),
(12,'Terbocil Forte Benzatinica',30,25,'07/11/2022',100),
(12,'Terbocil Forte Procainica',20,18,'04/04/2023',50),
(12,'Terbocil Forte Sodica',20,18,'05/07/2023',45),
(12,'Terbocil 1.2MM Benzaticica',25,22,'28/07/2023',61),
(12,'Terbocil 2.4MM Benzatinica',35,30,'23/06/2023',43),
(12,'Ifacilina 6 Benzatinica',20,18,'17/06/2023',94),
(12,'ifacilina 3 Procainica',10,8,'02/05/2023',82),
(12,'Ifacilina 3 Sodica',10,8,'03/08/2022',65),
(12,'Ifacilina 12 Benzatinica',32,27,'07/07/2022',54),
(12,'Ifacilina 6 Procainica',20,18,'14/07/2022',65),
(12,'Ifacilina 6 Sodica',20,18,'19/07/2022',46),
(12,'Ifacilina 600',15,13,'23/08/2022',69),
(12,'Ifacilina 1.2M',25,22,'27/08/2022',35),
(12,'Ifacilina 2.4M',30,27,'14/02/2023',45),  ----------------12ava categoria
(5,'Moxilin Duo Cmp',5,4.50,'18/01/2023',64),
(5,'Moxilin Duo Ssp',6,5.50,'26/10/2022',84),
(5,'Moxilin Plus Duo 875mg',8,7.50,'25/09/2022',48),
(5,'Moxilin Plus Duo 125mg',8,7.50,'14/06/2023',64),
(5,'Moxilin Plus Duo 1000mg',12,11,'25/04/2023',54),
(5,'Moxilin Plus Duo250mg',12,11,'23/09/2022',64),
(5,'Plamodex 875mg',21,19,'11/11/2022',95),
(5,'Amoxidal Duo',25,22,'18/08/2022',75),
(5,'Amoxicilina IFA 125mg',12.50,11.50,'28/10/2022',54),
(5,'Amoxicilina IFA 250mg',25,22,'03/02/2023',51),
(5,'Amoxicilina IFA 500mg Ssp',30,27,'08/03/2023',54),
(5,'Amoxicilina IFA 500mg Cmp',25,22,'09/03/2023',64),
(5,'Amoxicilina IFA 1g',45,40,'13/04/2023',65),
(5,'Broxilin 1g',40,35,'15/07/2022',51),
(5,'Broxilin 250mg',25,22,'19/05/2023',64),   -------------5ta categoria
(9,'Ampicilina IFA 125mg',12,11,'20/12/2022',32),
(9,'Ampicilina IFA 250mg',20,18,'30/12/2022',45),
(9,'Ampicilina IFA 500mg Ssp',30,27,'01/01/2023',55),
(9,'Ampicilina IFA 500mg',25,22,'14/06/2023',31),
(9,'Neo Terbocilin 1g',30,27,'19/06/2023',15),   ----------9na categoria
(6,'Cefotrix 250mg',20,18,'21/07/2023',45),
(6,'Cefotrix 500mg',34,31,'23/04/2023',54),
(6,'Supracef 1g',35,30,'13/01/2023',55),
(6,'Terbodina 250mg',20,18,'24/01/2023',77),
(6,'Terbodina 500mg',45,40,'19/09/2022',66),
(6,'Ceftacef 1g',33,30,'03/11/2022',45),
(6,'Triacef 400mg',32,30,'17/10/2022',46),
(6,'Triacef 100mg',10,9,'01/05/2023',54),
(6,'Megacef 1g',40,35,'16/06/2023',66),   -----------6ta categoria
(7,'Eritrobol 500mg',45,40,'19/01/2023',65),
(7,'Eritrobol 250mg',26,23,'23/10/2022',48),   ---------7ma categoria
(10,'Vancobiotic 1g',35,32,'15/07/2022',46),
(10,'Vancobiotic 500mg',16,14,'28/08/2022',36),  --------10ma categoria
(8,'Quinil 500mg',45,40,'06/08/2022',99),
(8,'Quinol 750mg',60,55,'07/06/2023',61),   ----------8va categoria
(11,'Macrotron 200',20,18,'21/05/2023',56),
(11,'Macrotron Forte 500mg',55,50,'14/04/2023',64),
(11,'Macrotron 500mg',42,37,'27/10/2022',46),
(11,'Macrotron 1g',60,55,'21/09/2022',64),
(11,'Zitromin 500mg',39,36,'04/06/2023',31),   ----------11ava categoria
(4,'Laser',45,40,'17/03/2023',64),
(4,'Ciflox 500mg',36,32,'29/04/2023',65),
(4,'Ciprinol 500mg',40,35,'04/03/2023',64),
(4,'Dicloxin 500mg',37,33,'23/07/2023',64);   ---------4ta categoria
go

insert into Usuarios(cod_rol,dni_usu,nom_usu,ape_usu,dir_usu,cod_dis,edad,telefono,fecha_ingreso,sueldo,correo)
values(1,'70306380','Jorge','Benavides','jr los casanueces',1,45,'974586321','01/04/2021',1800,'jorge@email.com');

create table prueba(
id int identity(1,1) not null primary key,
dni varchar(8) not null,
nombre varchar(25) not null,
clave as ('D'+right(dni,9)) )