# Native Web System

## 🚀 Sistema de Gestión de Infraestructura Aeroportuaria y Geolocalización

### ADSO-2899747 - Proyecto de Aplicación Web Nativa

---

## 📋 Descripción

Native Web System es una aplicación web completa desarrollada con las mejores prácticas de frontend moderno. El sistema permite la gestión integral de datos geográficos (continentes, países, estados, ciudades) e infraestructura aeroportuaria (aeropuertos, terminales, puertas de embarque).

## ✨ Características Principales

- 🎨 **Diseño Responsivo**: Optimizado para dispositivos móviles y desktop
- 🔧 **Arquitectura Modular**: Código organizado y mantenible
- 🌙 **Tema Oscuro/Claro**: Soporte completo para ambos temas
- 📊 **CRUD Completo**: Operaciones de crear, leer, actualizar y eliminar
- 🔍 **Búsqueda y Filtros**: Sistema avanzado de búsqueda y filtrado
- 📄 **Paginación**: Navegación eficiente de grandes conjuntos de datos
- 🔔 **Notificaciones**: Sistema de notificaciones en tiempo real
- ♿ **Accesibilidad**: Cumplimiento de estándares WCAG
- 🚀 **Performance**: Optimizado para carga rápida

## 🛠️ Tecnologías Utilizadas

- **HTML5**: Estructura semántica moderna
- **CSS3**: Variables CSS, Flexbox, Grid
- **Bootstrap 5.3.3**: Framework UI responsivo
- **Bootstrap Icons 1.11.3**: Biblioteca de iconos
- **JavaScript ES6+**: Sintaxis moderna con async/await
- **RESTful API**: Arquitectura de servicios web

## 📁 Estructura del Proyecto

```
native-web/
├── 📁 asset/
│   └── 📁 library/
│       └── 📄 bootstrap-config.html     # Configuración de librerías
├── 📁 css/
│   └── 📄 main.css                      # Estilos principales
├── 📁 doc/
│   └── 📄 documentacion.md              # Documentación técnica
├── 📁 js/
│   ├── 📄 common.js                     # Utilidades compartidas
│   ├── 📄 continent.js                  # Gestión de continentes
│   ├── 📄 country.js                    # Gestión de países
│   ├── 📄 state.js                      # Gestión de estados
│   ├── 📄 city.js                       # Gestión de ciudades
│   ├── 📄 airport.js                    # Gestión de aeropuertos
│   ├── 📄 terminal.js                   # Gestión de terminales
│   └── 📄 boarding-gate.js              # Gestión de puertas
├── 📁 view/
│   ├── 📁 geolocation/
│   │   ├── 📄 continent.html            # Vista de continentes
│   │   ├── 📄 country.html              # Vista de países
│   │   ├── 📄 state.html                # Vista de estados
│   │   └── 📄 city.html                 # Vista de ciudades
│   ├── 📁 infrastructure/
│   │   ├── 📄 airport.html              # Vista de aeropuertos
│   │   ├── 📄 terminal.html             # Vista de terminales
│   │   └── 📄 boarding-gate.html        # Vista de puertas
│   └── 📄 dashboard.html                # Panel de control
├── 📄 index.html                        # Página principal
└── 📄 README.md                         # Este archivo
```

## 🚀 Instalación y Uso

### Prerrequisitos

- Navegador web moderno (Chrome, Firefox, Safari, Edge)
- Servidor web local (opcional para desarrollo)
- Conexión a internet (para CDN de Bootstrap)

### Pasos de Instalación

1. **Descargar/Clonar** el proyecto:
   ```bash
   git clone [URL-del-repositorio]
   cd native-web
   ```

2. **Abrir en navegador**:
   - Opción 1: Abrir `index.html` directamente
   - Opción 2: Usar servidor local (recomendado)

3. **Verificar configuración**:
   - Abrir `asset/library/bootstrap-config.html`
   - Verificar que todas las librerías se carguen correctamente

### Servidor Local (Recomendado)

```bash
# Con Python
python -m http.server 8000

# Con Node.js (si tienes http-server instalado)
npx http-server

# Con PHP
php -S localhost:8000
```

Luego abrir `http://localhost:8000` en el navegador.

## 📖 Módulos del Sistema

### 🌍 Gestión Geográfica

| Módulo | Descripción | Características |
|--------|-------------|----------------|
| **Continentes** | Gestión de continentes | Países, población, área |
| **Países** | Gestión de países | Banderas, códigos ISO, capitales |
| **Estados** | Estados/provincias | Tipos, relaciones jerárquicas |
| **Ciudades** | Gestión de ciudades | Coordenadas, códigos postales |

### ✈️ Infraestructura Aeroportuaria

| Módulo | Descripción | Características |
|--------|-------------|----------------|
| **Aeropuertos** | Gestión de aeropuertos | Códigos IATA/ICAO, terminales |
| **Terminales** | Gestión de terminales | Capacidad, facilidades, puertas |
| **Puertas** | Puertas de embarque | Equipamiento, vuelos, utilización |

## 🎯 Funcionalidades por Módulo

### Operaciones CRUD
- ✅ **Crear**: Formularios validados con modales
- ✅ **Leer**: Tablas paginadas con ordenamiento
- ✅ **Actualizar**: Edición in-line y por modal
- ✅ **Eliminar**: Confirmación de seguridad

### Características Avanzadas
- 🔍 **Búsqueda**: Búsqueda en tiempo real con debounce
- 🔽 **Filtros**: Filtros múltiples por categorías
- 📊 **Ordenamiento**: Ordenamiento por cualquier columna
- 📱 **Responsivo**: Adaptación automática a dispositivos
- 🔗 **Relaciones**: Navegación jerárquica entre entidades

## 🎨 Temas y Personalización

### Cambio de Tema
El sistema soporta tema claro y oscuro:
- Botón de cambio en la interfaz
- Persistencia en localStorage
- Transiciones suaves entre temas

### Variables CSS
Personalización fácil mediante variables CSS:
```css
:root {
    --primary-color: #0d6efd;
    --spacing-md: 1rem;
    --border-radius: 0.375rem;
    /* ... más variables */
}
```

## 📱 Diseño Responsivo

### Breakpoints
- **Mobile**: < 576px
- **Tablet**: 576px - 992px  
- **Desktop**: > 992px

### Adaptaciones
- Navegación colapsable en móviles
- Tablas que se convierten en cards
- Formularios en columna única
- Botones y espaciado optimizados

## 🔧 API y Configuración

### Endpoints RESTful
```javascript
// Estructura de endpoints
GET    /api/{resource}              // Listar
POST   /api/{resource}              // Crear
PUT    /api/{resource}/{id}         // Actualizar
DELETE /api/{resource}/{id}         // Eliminar
```

### Configuración de API
Editar en cada módulo JavaScript:
```javascript
const API_CONFIG = {
    baseURL: 'http://localhost:3000/api', // Cambiar según necesidad
    endpoints: {
        list: '/continents',
        create: '/continents',
        update: '/continents',
        delete: '/continents'
    }
};
```

## 📋 Testing y Verificación

### Lista de Verificación por Módulo

- [ ] ✅ Carga inicial de datos
- [ ] ✅ Formulario de creación
- [ ] ✅ Validación de campos
- [ ] ✅ Edición de registros
- [ ] ✅ Eliminación con confirmación
- [ ] ✅ Búsqueda funcional
- [ ] ✅ Filtros aplicables
- [ ] ✅ Paginación correcta
- [ ] ✅ Ordenamiento por columnas
- [ ] ✅ Notificaciones visibles
- [ ] ✅ Responsividad móvil

### Navegadores Soportados
- ✅ Chrome (últimas 2 versiones)
- ✅ Firefox (últimas 2 versiones)
- ✅ Safari (última versión)
- ✅ Edge (última versión)

## 📊 Performance

### Métricas Objetivo
- **First Contentful Paint**: < 1.5s
- **Largest Contentful Paint**: < 2.5s
- **Time to Interactive**: < 3s
- **Cumulative Layout Shift**: < 0.1

### Optimizaciones Implementadas
- CDN para librerías externas
- Compresión de imágenes
- Lazy loading de componentes
- Debounce en búsquedas
- Cache de configuración

## ♿ Accesibilidad

### Características de Accesibilidad
- ✅ Navegación por teclado completa
- ✅ Lectores de pantalla compatibles
- ✅ Contraste suficiente (WCAG AA)
- ✅ Textos alternativos descriptivos
- ✅ Roles ARIA apropiados
- ✅ Focus visible y lógico

## 📚 Documentación

### Archivos de Documentación
- 📄 `README.md`: Este archivo con información general
- 📄 `doc/documentacion.md`: Documentación técnica detallada
- 📄 `asset/library/bootstrap-config.html`: Configuración y pruebas

### Recursos Adicionales
- [Bootstrap 5.3 Documentation](https://getbootstrap.com/docs/5.3/)
- [Bootstrap Icons](https://icons.getbootstrap.com/)
- [MDN Web Docs](https://developer.mozilla.org/)

## 🐛 Solución de Problemas

### Problemas Comunes

**Las librerías no cargan:**
- Verificar conexión a internet
- Revisar console de desarrollador
- Comprobar URLs de CDN

**Las notificaciones no aparecen:**
- Verificar que `common.js` está cargado
- Revisar errores en console

**Los datos no se cargan:**
- Verificar configuración de API
- Revisar CORS si es necesario
- Comprobar network tab en DevTools

## 🤝 Contribución

### Guías de Desarrollo
1. Seguir la estructura modular existente
2. Usar variables CSS para estilos
3. Implementar patrones JavaScript consistentes
4. Mantener accesibilidad en nuevas funciones
5. Documentar cambios importantes

### Estructura de Commits
```
tipo(módulo): descripción breve

- Descripción detallada del cambio
- Razón del cambio
- Efectos esperados
```

## 📝 Licencia

Este proyecto fue desarrollado como parte del programa ADSO-2899747 del SENA.

## 👨‍💻 Autor

**Programa**: Análisis y Desarrollo de Software - ADSO-2899747  
**Institución**: SENA  
**Fecha**: Diciembre 2024

---

## 🚀 ¡Empezar Ahora!

1. Abre `index.html` en tu navegador
2. Explora el dashboard para ver las estadísticas
3. Navega por los diferentes módulos
4. Prueba las funcionalidades CRUD
5. Experimenta con el cambio de tema
6. Revisa la documentación técnica en `doc/documentacion.md`

**¡Disfruta explorando el Native Web System!** 🎉
