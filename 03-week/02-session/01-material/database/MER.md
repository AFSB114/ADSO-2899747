Vuelos nacionales e internacionales

- continente 
	id
	nombre
	descripcion
- pais 
	id
	nombre
	descripcion
	continente_id
- departamento 
	id
	nombre
	descripcion
	pais_id
- cuidad  
	id
	nombre
	descripcion
	departamento_id
	
------------------------------------------
aeropuerto
	id
	nombre
	direccion
	cuidad_id 
	
terminal
	id	
	codificaicon
	nombre
	aeropuerto_id 
	
puerta_embarque
	id	
	codificaicon
	nombre
	terminal_id 
	
------------------------------------------
tipo_aeronave
	id
	codigo
	nombre

areonave
	id
	fabricante
	matricula
	hora_uso
	tipo_aeronave 
	

------------------------------------------
persona
	id
	tipo_documento
	numero_documento
	nombre
	apellido
	fecha_nacimiento
	correo
	numero_celular

empleado
	id
	salario
	rol
	persona_id

tripulacion
	id
	empleado_id
	programacion_id

pasajero
	id
	persona_id
	boleto_id
	
equipaje
	id
	codigo
	pasajero_id
	
------------------------------------------
programacion
	id
	fecha_vuelo
	hora_salida
	hora_llegada
	tipo_vuelo
	oriegen_puerta_embarque_id
	destino_puerta_embarque_id
	areonave_id
	
boleto
	id
	codigo
	programacion