/**
 * Terminal Service
 * Servicio para gestión de terminales aeroportuarias
 */

class TerminalService extends ApiService {
    constructor() {
        super();
        this.endpoint = '/terminals';
    }

    /**
     * Obtener todos los terminales
     */
    async getAll() {
        return this.get(this.endpoint);
    }

    /**
     * Obtener un terminal por ID
     */
    async getById(id) {
        return this.get(`${this.endpoint}/${id}`);
    }

    /**
     * Crear nuevo terminal
     */
    async create(terminalData) {
        return this.post(this.endpoint, terminalData);
    }

    /**
     * Actualizar terminal
     */
    async update(id, terminalData) {
        return this.put(`${this.endpoint}/${id}`, terminalData);
    }

    /**
     * Eliminar terminal
     */
    async delete(id) {
        return this.delete(`${this.endpoint}/${id}`);
    }

    /**
     * Obtener terminales por aeropuerto
     */
    async getByAirport(airportId) {
        return this.get(`${this.endpoint}?airport=${airportId}`);
    }

    /**
     * Obtener puertas de embarque de un terminal
     */
    async getBoardingGates(terminalId) {
        return this.get(`${this.endpoint}/${terminalId}/boarding-gates`);
    }

    /**
     * Validar datos del terminal
     */
    validateTerminalData(data) {
        const errors = [];
        
        if (!data.name || data.name.trim().length < 2) {
            errors.push('El nombre del terminal es requerido (mínimo 2 caracteres)');
        }
        
        if (!data.code || data.code.trim().length < 1) {
            errors.push('El código del terminal es requerido');
        }
        
        if (!data.airport_id) {
            errors.push('El aeropuerto es requerido');
        }
        
        if (!data.type) {
            errors.push('El tipo de terminal es requerido');
        }
        
        if (data.capacity && data.capacity < 0) {
            errors.push('La capacidad no puede ser negativa');
        }
        
        if (data.area && data.area < 0) {
            errors.push('El área no puede ser negativa');
        }
        
        if (data.floors && data.floors < 1) {
            errors.push('El número de pisos debe ser al menos 1');
        }
        
        return errors;
    }
}

// Instancia global del servicio
window.terminalService = new TerminalService();
