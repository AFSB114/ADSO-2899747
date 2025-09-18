/**
 * Airport Service
 * Servicio para gestión de aeropuertos
 */

class AirportService extends ApiService {
    constructor() {
        super();
        this.endpoint = '/airports';
    }

    /**
     * Obtener todos los aeropuertos
     */
    async getAll() {
        return this.get(this.endpoint);
    }

    /**
     * Obtener un aeropuerto por ID
     */
    async getById(id) {
        return this.get(`${this.endpoint}/${id}`);
    }

    /**
     * Crear nuevo aeropuerto
     */
    async create(airportData) {
        return this.post(this.endpoint, airportData);
    }

    /**
     * Actualizar aeropuerto
     */
    async update(id, airportData) {
        return this.put(`${this.endpoint}/${id}`, airportData);
    }

    /**
     * Eliminar aeropuerto
     */
    async delete(id) {
        return this.delete(`${this.endpoint}/${id}`);
    }

    /**
     * Obtener aeropuertos por ciudad
     */
    async getByCity(cityId) {
        return this.get(`${this.endpoint}?city=${cityId}`);
    }

    /**
     * Obtener terminales de un aeropuerto
     */
    async getTerminals(airportId) {
        return this.get(`${this.endpoint}/${airportId}/terminals`);
    }

    /**
     * Validar datos del aeropuerto
     */
    validateAirportData(data) {
        const errors = [];
        
        if (!data.name || data.name.trim().length < 3) {
            errors.push('El nombre del aeropuerto es requerido (mínimo 3 caracteres)');
        }
        
        if (!data.iata_code || data.iata_code.length !== 3) {
            errors.push('El código IATA debe tener exactamente 3 caracteres');
        }
        
        if (data.icao_code && data.icao_code.length !== 4) {
            errors.push('El código ICAO debe tener exactamente 4 caracteres');
        }
        
        if (!data.city_id) {
            errors.push('La ciudad es requerida');
        }
        
        if (!data.type) {
            errors.push('El tipo de aeropuerto es requerido');
        }
        
        // Validar coordenadas si se proporcionan
        if (data.latitude && (data.latitude < -90 || data.latitude > 90)) {
            errors.push('La latitud debe estar entre -90 y 90');
        }
        
        if (data.longitude && (data.longitude < -180 || data.longitude > 180)) {
            errors.push('La longitud debe estar entre -180 y 180');
        }
        
        return errors;
    }
}

// Instancia global del servicio
window.airportService = new AirportService();
