--CREACION DE BASE DE DATOS
if not exists(select * from sys.databases where name = 'Proyecto')
    create database Proyecto
go

USE Proyecto
go

--CREACION DE TABLAS
if not exists (select * from sysobjects where name='TLGUSUA' and xtype='U')
    create table dbo.TLGUSUA (
    id_usuario	char(10) NOT NULL PRIMARY KEY,
	usuario	varchar(20),
	contraseña	varchar(25),
	estado	varchar(20)
    )
go

--CREACION DE PROCEDIMIENTOS ALAMACENADOS
--ACTUALIZAR ESTADO
create procedure [dbo].[actEstado]
	@usuario varchar(20),
	@estado varchar(10)
as
begin
update dbo.TLGUSUA set estado = @estado where usuario = @usuario	
end
go

--VALIDAR LOGUEO
CREATE PROCEDURE [dbo].[validaLogueo]
	@usuario varchar(20),
	@pass varchar(25)
AS
BEGIN
	if (select count(*) from dbo.TLGUSUA where usuario = @usuario) > 0			
		if (select estado from dbo.TLGUSUA where usuario = @usuario) = 'Activo'
			if(select count(*) from dbo.TLGUSUA where usuario = @usuario and contraseña = @pass and estado = 'Activo') > 0
				select 0 as resultado --DATOS_OK
			else
				select 1 as resultado --PASS_ERR
		else
			select 2 as resultado --DATOS_BLOQ			
	else
		 select 3 as resultado --USU_ERR
END