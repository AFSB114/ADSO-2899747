# Native Web System - Documentación Técnica

## ADSO-2899747 - Proyecto de Aplicación Web Nativa

### Descripción General

Native Web System es una aplicación web completa desarrollada aplicando las mejores prácticas de desarrollo frontend moderno. El sistema gestiona datos geográficos e infraestructura aeroportuaria con una arquitectura modular y escalable.

---

## Arquitectura del Proyecto

### Estructura de Directorios

```
native-web/
├── asset/
│   └── library/
│       └── bootstrap-config.html    # Configuración y pruebas de librerías
├── css/
│   └── main.css                     # Estilos principales con variables CSS
├── doc/
│   └── documentacion.md             # Este archivo
├── js/
│   ├── common.js                    # Utilidades compartidas
│   ├── continent.js                 # Gestión de continentes
│   ├── country.js                   # Gestión de países
│   ├── state.js                     # Gestión de estados/provincias
│   ├── city.js                      # Gestión de ciudades
│   ├── airport.js                   # Gestión de aeropuertos
│   ├── terminal.js                  # Gestión de terminales
│   └── boarding-gate.js             # Gestión de puertas de embarque
└── view/
    ├── index.html                   # Página de inicio
    ├── dashboard.html               # Panel de control
    ├── continent.html               # Vista de continentes
    ├── country.html                 # Vista de países
    ├── state.html                   # Vista de estados
    ├── city.html                    # Vista de ciudades
    ├── airport.html                 # Vista de aeropuertos
    ├── terminal.html                # Vista de terminales
    └── boarding-gate.html           # Vista de puertas de embarque
```

---

## Tecnologías Utilizadas

### Frontend Framework & Libraries

- **HTML5**: Estructura semántica con elementos modernos
- **CSS3**: Variables CSS, Flexbox, Grid, Responsive Design
- **Bootstrap 5.3.3**: Framework UI responsive
- **Bootstrap Icons 1.11.3**: Iconografía consistente
- **JavaScript ES6+**: Sintaxis moderna, async/await, módulos

### Características Técnicas

- **Responsive Design**: Adaptable a dispositivos móviles y desktop
- **Progressive Enhancement**: Mejora progresiva de funcionalidades
- **Accessibility**: Cumplimiento de estándares WCAG
- **SEO Optimizado**: Meta tags, estructura semántica
- **Performance**: Optimización de carga y recursos

---

## Módulos del Sistema

### 1. Gestión Geográfica

#### Continentes (`continent.js`)
- **Funcionalidades**: CRUD completo, búsqueda, filtros, paginación
- **Campos**: Nombre, código, países, población, área, estado
- **API Endpoints**: 
  - GET `/api/continents` - Listar continentes
  - POST `/api/continents` - Crear continente
  - PUT `/api/continents/{id}` - Actualizar continente
  - DELETE `/api/continents/{id}` - Eliminar continente

#### Países (`country.js`)
- **Funcionalidades**: Gestión completa con relación a continentes
- **Campos**: Nombre, código ISO, capital, población, área, moneda, idioma, bandera
- **Características especiales**: 
  - Visualización de banderas
  - Filtrado por continente
  - Validación de códigos ISO

#### Estados/Provincias (`state.js`)
- **Funcionalidades**: Gestión jerárquica con países
- **Campos**: Nombre, código, tipo, capital, población, área, zona horaria
- **Características especiales**:
  - Clasificación por tipo (estado, provincia, región)
  - Navegación por parámetros URL
  - Filtrado jerárquico

#### Ciudades (`city.js`)
- **Funcionalidades**: Gestión completa con relaciones jerárquicas
- **Campos**: Nombre, tipo, población, área, coordenadas, código postal, elevación
- **Características especiales**:
  - Integración con mapas (coordenadas)
  - Selección jerárquica país/estado
  - Búsqueda geográfica

### 2. Infraestructura Aeroportuaria

#### Aeropuertos (`airport.js`)
- **Funcionalidades**: Gestión de infraestructura aeroportuaria
- **Campos**: Nombre, códigos IATA/ICAO, tipo, terminales, pistas, coordenadas
- **Características especiales**:
  - Validación de códigos aeroportuarios
  - Gestión de información operacional
  - Integración con ciudades

#### Terminales (`terminal.js`)
- **Funcionalidades**: Gestión de terminales aeroportuarias
- **Campos**: Nombre, número, tipo, capacidad, facilidades, área, pisos
- **Características especiales**:
  - Control de capacidad (actual vs máxima)
  - Gestión de facilidades
  - Relación con aeropuertos

#### Puertas de Embarque (`boarding-gate.js`)
- **Funcionalidades**: Gestión operacional de puertas
- **Campos**: Nombre, número, capacidad, utilización, equipamiento, vuelos
- **Características especiales**:
  - Asignación de vuelos
  - Control de equipamiento
  - Monitoreo de utilización
  - Estados operacionales

---

## Patrones de Desarrollo

### Arquitectura JavaScript

Todos los módulos JavaScript siguen un patrón consistente:

```javascript
// 1. Configuración de API
const API_CONFIG = {
    baseURL: 'http://localhost:3000/api',
    endpoints: {
        list: '/entities',
        create: '/entities',
        update: '/entities',
        delete: '/entities'
    }
};

// 2. Variables de estado
let currentPage = 1;
let itemsPerPage = 10;
let totalItems = 0;
let currentSort = { field: 'name', direction: 'asc' };
let currentFilters = {};

// 3. Funciones principales
async function loadEntities() { /* ... */ }
async function saveEntity() { /* ... */ }
async function deleteEntity() { /* ... */ }

// 4. Event listeners
document.addEventListener('DOMContentLoaded', initializeModule);
```

### Gestión de Estado

- **Estado local**: Variables JavaScript para cada módulo
- **Persistencia**: localStorage para configuraciones de usuario
- **Sincronización**: Patrón async/await para operaciones asíncronas

### Manejo de Errores

```javascript
try {
    const result = await makeAPIRequest(url, method, data);
    if (result.success) {
        showSuccess('Operación exitosa');
        return result.data;
    } else {
        throw new Error(result.message);
    }
} catch (error) {
    console.error('Error:', error);
    showError('Error en la operación: ' + error.message);
    return null;
}
```

---

## Sistema de Estilos

### Variables CSS

El sistema utiliza un conjunto completo de variables CSS para mantener consistencia:

```css
:root {
    /* Colores principales */
    --primary-color: #0d6efd;
    --secondary-color: #6c757d;
    --success-color: #198754;
    
    /* Espaciado */
    --spacing-xs: 0.25rem;
    --spacing-sm: 0.5rem;
    --spacing-md: 1rem;
    
    /* Tipografía */
    --font-family-sans: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto;
    --font-size-base: 1rem;
    
    /* Sombras */
    --shadow-sm: 0 1px 2px 0 rgba(0, 0, 0, 0.05);
    --shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.1);
}
```

### Tema Oscuro

Soporte completo para tema oscuro con variables específicas:

```css
[data-bs-theme="dark"] {
    --bs-body-bg: var(--gray-900);
    --bs-body-color: var(--gray-100);
    /* ... más variables */
}
```

### Componentes Personalizados

- **Cards mejoradas**: Sombras, transiciones, hover effects
- **Tablas responsivas**: Adaptación móvil, ordenamiento
- **Formularios**: Validación visual, estilos mejorados
- **Navegación**: Estados activos, transiciones suaves

---

## API y Comunicación

### Estructura de Endpoints

Todos los módulos siguen el patrón RESTful:

```
GET    /api/{resource}              # Listar recursos
POST   /api/{resource}              # Crear recurso
GET    /api/{resource}/{id}         # Obtener recurso específico
PUT    /api/{resource}/{id}         # Actualizar recurso
DELETE /api/{resource}/{id}         # Eliminar recurso
```

### Parámetros de Consulta

```javascript
// Paginación
?page=1&limit=10

// Ordenamiento
?sort=name&direction=asc

// Filtros
?filter[status]=active&filter[type]=international

// Búsqueda
?search=keyword
```

### Respuestas de API

```javascript
// Respuesta exitosa
{
    "success": true,
    "data": [...],
    "pagination": {
        "page": 1,
        "limit": 10,
        "total": 150,
        "pages": 15
    }
}

// Respuesta de error
{
    "success": false,
    "message": "Descripción del error",
    "code": "ERROR_CODE"
}
```

---

## Funcionalidades Comunes

### Sistema de Notificaciones

```javascript
// Tipos de notificación
showSuccess('Operación exitosa');
showError('Error en la operación');
showWarning('Advertencia importante');
showInfo('Información relevante');
```

### Estados de Carga

```javascript
// Carga global
showLoading(true);

// Carga específica en elemento
showLoading(true, 'data-table');
```

### Paginación

```javascript
function setupPagination(totalItems, currentPage, itemsPerPage) {
    const totalPages = Math.ceil(totalItems / itemsPerPage);
    // Genera controles de paginación
}
```

### Búsqueda y Filtros

```javascript
// Búsqueda con debounce
const debouncedSearch = debounce(performSearch, 300);

// Aplicar filtros
function applyFilters() {
    currentFilters = {
        status: document.getElementById('statusFilter').value,
        type: document.getElementById('typeFilter').value,
        search: document.getElementById('searchInput').value
    };
    loadEntities();
}
```

---

## Responsive Design

### Breakpoints

- **xs**: < 576px (móviles)
- **sm**: ≥ 576px (móviles grandes)
- **md**: ≥ 768px (tablets)
- **lg**: ≥ 992px (desktop)
- **xl**: ≥ 1200px (desktop grande)

### Adaptaciones Móviles

```css
@media (max-width: 576px) {
    /* Tablas en formato de cards */
    .table thead { display: none; }
    .table tbody tr { display: block; }
    
    /* Formularios en columna única */
    .form-row > div { width: 100% !important; }
}
```

---

## Accesibilidad

### Características Implementadas

- **Navegación por teclado**: Focus visible, orden lógico
- **Lectores de pantalla**: ARIA labels, roles semánticos
- **Contraste**: Cumplimiento WCAG AA
- **Texto alternativo**: Imágenes y iconos descriptivos

### Código de Ejemplo

```html
<!-- Botón accesible -->
<button type="button" 
        class="btn btn-primary" 
        aria-label="Editar continente"
        data-bs-toggle="tooltip" 
        title="Modificar información del continente">
    <i class="bi bi-pencil" aria-hidden="true"></i>
</button>
```

---

## Performance

### Optimizaciones Implementadas

- **Lazy Loading**: Carga diferida de componentes
- **Debounce**: Optimización de búsquedas
- **Compresión**: Minificación de assets
- **Cache**: Estrategias de almacenamiento local

### Métricas Objetivo

- **First Contentful Paint**: < 1.5s
- **Largest Contentful Paint**: < 2.5s
- **Cumulative Layout Shift**: < 0.1
- **First Input Delay**: < 100ms

---

## Instalación y Configuración

### Requisitos

- Navegador moderno con soporte ES6+
- Servidor web local (Apache, Nginx, o similar)
- Conexión a internet (para CDN de Bootstrap)

### Pasos de Instalación

1. **Clonar/Descargar** el proyecto
2. **Configurar servidor web** apuntando a la carpeta del proyecto
3. **Abrir navegador** en la URL local
4. **Verificar librerías** en `/asset/library/bootstrap-config.html`

### Configuración de API

Editar la configuración en cada módulo JavaScript:

```javascript
const API_CONFIG = {
    baseURL: 'http://tu-servidor.com/api', // Cambiar URL
    endpoints: {
        // Mantener endpoints
    }
};
```

---

## Testing

### Pruebas Funcionales

Para cada módulo, verificar:

- [ ] Carga inicial de datos
- [ ] Creación de nuevos registros
- [ ] Edición de registros existentes
- [ ] Eliminación de registros
- [ ] Búsqueda y filtros
- [ ] Paginación
- [ ] Ordenamiento
- [ ] Validación de formularios
- [ ] Notificaciones
- [ ] Responsividad

### Pruebas de Navegadores

- [ ] Chrome (últimas 2 versiones)
- [ ] Firefox (últimas 2 versiones)
- [ ] Safari (última versión)
- [ ] Edge (última versión)

### Pruebas de Dispositivos

- [ ] Desktop (1920x1080)
- [ ] Tablet (768x1024)
- [ ] Móvil (375x667)

---

## Mantenimiento

### Actualizaciones de Dependencias

Revisar periódicamente:

- Bootstrap CSS/JS
- Bootstrap Icons
- Navegadores soportados

### Monitoreo

- Errores de JavaScript en consola
- Tiempo de carga de páginas
- Uso de memoria
- Errores de red/API

### Backup

Respaldar regularmente:

- Código fuente
- Configuraciones
- Documentación
- Assets personalizados

---

## Contacto y Soporte

**Proyecto**: Native Web System  
**Programa**: ADSO-2899747  
**Versión**: 1.0.0  
**Fecha**: 2024

### Desarrollador
- **Nombre**: [Tu Nombre]
- **Email**: [tu.email@ejemplo.com]
- **GitHub**: [tu-usuario]

### Recursos Adicionales

- [Bootstrap Documentation](https://getbootstrap.com/docs/5.3/)
- [Bootstrap Icons](https://icons.getbootstrap.com/)
- [MDN Web Docs](https://developer.mozilla.org/)
- [WCAG Guidelines](https://www.w3.org/WAI/WCAG21/quickref/)

---

**Última actualización**: Diciembre 2024
