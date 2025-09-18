/**
 * Country Service
 * Servicio para gestión de países
 */

class CountryService extends ApiService {
    constructor() {
        super();
        this.endpoint = '/countries';
    }

    /**
     * Obtener todos los países
     */
    async getAll() {
        return this.get(this.endpoint);
    }

    /**
     * Obtener un país por ID
     */
    async getById(id) {
        return this.get(`${this.endpoint}/${id}`);
    }

    /**
     * Crear nuevo país
     */
    async create(countryData) {
        return this.post(this.endpoint, countryData);
    }

    /**
     * Actualizar país
     */
    async update(id, countryData) {
        return this.put(`${this.endpoint}/${id}`, countryData);
    }

    /**
     * Eliminar país
     */
    async delete(id) {
        return this.delete(`${this.endpoint}/${id}`);
    }

    /**
     * Buscar países por continente
     */
    async getByContinent(continentId) {
        return this.get(`${this.endpoint}?continent=${continentId}`);
    }

    /**
     * Validar datos del país
     */
    validateCountryData(data) {
        const errors = [];
        
        if (!data.name || data.name.trim().length < 2) {
            errors.push('El nombre del país es requerido (mínimo 2 caracteres)');
        }
        
        if (!data.code || data.code.length !== 2) {
            errors.push('El código ISO debe tener exactamente 2 caracteres');
        }
        
        if (!data.continent_id) {
            errors.push('El continente es requerido');
        }
        
        if (!data.capital || data.capital.trim().length < 2) {
            errors.push('La capital es requerida');
        }
        
        if (data.population && data.population < 0) {
            errors.push('La población no puede ser negativa');
        }
        
        return errors;
    }
}

// Instancia global del servicio
window.countryService = new CountryService();
