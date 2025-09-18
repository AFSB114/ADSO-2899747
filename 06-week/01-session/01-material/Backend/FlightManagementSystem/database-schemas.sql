-- Script para crear los esquemas necesarios en PostgreSQL
-- Ejecutar este script antes de correr la aplicación

-- Crear esquemas si no existen
CREATE SCHEMA IF NOT EXISTS geolocation;
CREATE SCHEMA IF NOT EXISTS parameterization;
CREATE SCHEMA IF NOT EXISTS aircraft_management;
CREATE SCHEMA IF NOT EXISTS flight;
CREATE SCHEMA IF NOT EXISTS human_resources;
CREATE SCHEMA IF NOT EXISTS infrastructure;
CREATE SCHEMA IF NOT EXISTS notifications;
CREATE SCHEMA IF NOT EXISTS passengers_services;
CREATE SCHEMA IF NOT EXISTS security;

-- Verificar que los esquemas se crearon correctamente
SELECT schema_name FROM information_schema.schemata 
WHERE schema_name IN (
    'geolocation', 
    'parameterization', 
    'aircraft_management',
    'flight',
    'human_resources',
    'infrastructure',
    'notifications',
    'passengers_services',
    'security'
);

COMMENT ON SCHEMA geolocation IS 'Esquema para datos geográficos (continentes, países, estados, ciudades)';
COMMENT ON SCHEMA parameterization IS 'Esquema para parámetros del sistema (tipos de aeronaves, roles, etc.)';
COMMENT ON SCHEMA aircraft_management IS 'Esquema para gestión de aeronaves';
COMMENT ON SCHEMA flight IS 'Esquema para gestión de vuelos';
COMMENT ON SCHEMA human_resources IS 'Esquema para recursos humanos';
COMMENT ON SCHEMA infrastructure IS 'Esquema para infraestructura';
COMMENT ON SCHEMA notifications IS 'Esquema para notificaciones';
COMMENT ON SCHEMA passengers_services IS 'Esquema para servicios de pasajeros';
COMMENT ON SCHEMA security IS 'Esquema para seguridad';
