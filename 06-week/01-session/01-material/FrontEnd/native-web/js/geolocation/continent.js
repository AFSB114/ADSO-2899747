/**
 * Continent Service
 * Servicio para gestión de continentes
 */

class ContinentService extends ApiService {
    constructor() {
        super();
        this.endpoint = '/continents';
    }

    /**
     * Obtener todos los continentes
     */
    async getAll() {
        return this.get(this.endpoint);
    }

    /**
     * Obtener un continente por ID
     */
    async getById(id) {
        return this.get(`${this.endpoint}/${id}`);
    }

    /**
     * Crear nuevo continente
     */
    async create(continentData) {
        return this.post(this.endpoint, continentData);
    }

    /**
     * Actualizar continente
     */
    async update(id, continentData) {
        return this.put(`${this.endpoint}/${id}`, continentData);
    }

    /**
     * Eliminar continente
     */
    async delete(id) {
        return this.delete(`${this.endpoint}/${id}`);
    }

    /**
     * Obtener países de un continente
     */
    async getCountries(continentId) {
        return this.get(`${this.endpoint}/${continentId}/countries`);
    }

    /**
     * Validar datos del continente
     */
    validateContinentData(data) {
        const errors = [];
        
        if (!data.name || data.name.trim().length < 2) {
            errors.push('El nombre del continente es requerido (mínimo 2 caracteres)');
        }
        
        if (!data.code || data.code.length < 2) {
            errors.push('El código del continente es requerido');
        }
        
        if (data.area && data.area < 0) {
            errors.push('El área no puede ser negativa');
        }
        
        return errors;
    }
}

// Instancia global del servicio
window.continentService = new ContinentService();
