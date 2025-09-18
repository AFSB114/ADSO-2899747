/**
 * State Service - API management for states
 * Handles CRUD operations for state entities
 * Model: id, code, name, description, country_id
 */

class StateService extends ApiService {
    constructor() {
        super();
        this.endpoint = '/states';
    }

    /**
     * Get all states
     * @returns {Promise<Array>} List of states
     */
    async getAll() {
        try {
            return await this.get(this.endpoint);
        } catch (error) {
            console.error('Error fetching states:', error);
            throw error;
        }
    }

    /**
     * Get state by ID
     * @param {number} id - State ID
     * @returns {Promise<Object>} State data
     */
    async getById(id) {
        try {
            return await this.get(`${this.endpoint}/${id}`);
        } catch (error) {
            console.error(`Error fetching state ${id}:`, error);
            throw error;
        }
    }

    /**
     * Get states by country
     * @param {number} countryId - Country ID
     * @returns {Promise<Array>} List of states in the country
     */
    async getByCountry(countryId) {
        try {
            return await this.get(`${this.endpoint}/country/${countryId}`);
        } catch (error) {
            console.error(`Error fetching states for country ${countryId}:`, error);
            throw error;
        }
    }

    /**
     * Get cities for a state
     * @param {number} stateId - State ID
     * @returns {Promise<Array>} List of cities in the state
     */
    async getCities(stateId) {
        try {
            return await this.get(`${this.endpoint}/${stateId}/cities`);
        } catch (error) {
            console.error(`Error fetching cities for state ${stateId}:`, error);
            throw error;
        }
    }

    /**
     * Create new state
     * @param {Object} stateData - State data to create
     * @returns {Promise<Object>} Created state
     */
    async create(stateData) {
        try {
            const validationResult = this.validateStateData(stateData);
            if (!validationResult.isValid) {
                throw new Error(`Validation error: ${validationResult.errors.join(', ')}`);
            }

            return await this.post(this.endpoint, stateData);
        } catch (error) {
            console.error('Error creating state:', error);
            throw error;
        }
    }

    /**
     * Update existing state
     * @param {number} id - State ID
     * @param {Object} stateData - Updated state data
     * @returns {Promise<Object>} Updated state
     */
    async update(id, stateData) {
        try {
            const validationResult = this.validateStateData(stateData, true);
            if (!validationResult.isValid) {
                throw new Error(`Validation error: ${validationResult.errors.join(', ')}`);
            }

            return await this.put(`${this.endpoint}/${id}`, stateData);
        } catch (error) {
            console.error(`Error updating state ${id}:`, error);
            throw error;
        }
    }

    /**
     * Delete state
     * @param {number} id - State ID
     * @returns {Promise<boolean>} Success status
     */
    async delete(id) {
        try {
            await this.delete(`${this.endpoint}/${id}`);
            return true;
        } catch (error) {
            console.error(`Error deleting state ${id}:`, error);
            throw error;
        }
    }

    /**
     * Validate state data
     * @param {Object} data - State data to validate
     * @param {boolean} isUpdate - Whether this is an update operation
     * @returns {Object} Validation result
     */
    validateStateData(data, isUpdate = false) {
        const errors = [];

        // Required fields validation
        if (!data.code || typeof data.code !== 'string') {
            errors.push('Code is required and must be a string');
        } else if (data.code.length < 2 || data.code.length > 10) {
            errors.push('Code must be between 2 and 10 characters');
        }

        if (!data.name || typeof data.name !== 'string') {
            errors.push('Name is required and must be a string');
        } else if (data.name.length < 2 || data.name.length > 100) {
            errors.push('Name must be between 2 and 100 characters');
        }

        if (!data.country_id || !Number.isInteger(Number(data.country_id))) {
            errors.push('Country ID is required and must be a valid integer');
        }

        // Optional fields validation
        if (data.description && typeof data.description !== 'string') {
            errors.push('Description must be a string');
        } else if (data.description && data.description.length > 500) {
            errors.push('Description must not exceed 500 characters');
        }

        // Update-specific validation
        if (isUpdate && data.id && !Number.isInteger(Number(data.id))) {
            errors.push('ID must be a valid integer for updates');
        }

        return {
            isValid: errors.length === 0,
            errors: errors
        };
    }

    /**
     * Search states by name or code
     * @param {string} query - Search query
     * @returns {Promise<Array>} Matching states
     */
    async search(query) {
        try {
            return await this.get(`${this.endpoint}/search?q=${encodeURIComponent(query)}`);
        } catch (error) {
            console.error('Error searching states:', error);
            throw error;
        }
    }

    /**
     * Get state statistics
     * @returns {Promise<Object>} State statistics
     */
    async getStatistics() {
        try {
            return await this.get(`${this.endpoint}/statistics`);
        } catch (error) {
            console.error('Error fetching state statistics:', error);
            throw error;
        }
    }
}

// Create and export service instance
const stateService = new StateService();

// Export for module systems
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { StateService, stateService };
}
