# Práctica de una Merge Request hacia `dev`

![Merge Request](./image/console-practice-mr.png)

## 1. Crear y cambiarse a la nueva rama
```bash
git checkout chore/prueba-mr
```
Se crea y se cambia a la rama `chore/prueba-mr` desde el entorno local.  
El prefijo `chore/` indica que es una tarea de mantenimiento o cambios menores.

---

## 2. Verificar contenido del directorio
```bash
dir
```
Se listan los archivos y carpetas del proyecto para confirmar la estructura y ubicación actual.

---

## 3. Crear un archivo de prueba
```bash
echo "This a practice to learn about Merge Request" > test/mr-demo.txt
```
Se crea el archivo `mr-demo.txt` dentro de la carpeta `test` con un texto de prueba para simular un cambio.

---

## 4. Agregar el archivo al staging area
```bash
git add test/mr-demo.txt
```
El archivo recién creado se añade al área de preparación (*staging area*) para que forme parte del próximo commit.

---

## 5. Crear un commit con mensaje descriptivo
```bash
git commit -m "chore: add a test file to MR on dev"
```
Se registra el cambio en la rama actual con un mensaje siguiendo la convención **Conventional Commits**.  
`chore:` indica que no es una nueva funcionalidad ni un fix, sino una tarea auxiliar.

---

## 6. Subir la rama al repositorio remoto
```bash
git push origin chore/prueba-mr
```
Se envían los cambios al repositorio remoto en GitHub, creando la rama `chore/prueba-mr` en el servidor.

---

## 7. Crear la Pull Request en GitHub
Una vez subida la rama, GitHub muestra un enlace para abrir una **Pull Request** (PR).  
Se accede al enlace o se entra manualmente al repositorio en GitHub y se selecciona:

- **Base branch (rama base):** `dev`
- **Compare branch (rama de comparación):** `chore/prueba-mr`

Se añade un título y una descripción explicando el propósito del cambio.  
Se crea la PR.

---

## 8. Revisar y aprobar la Pull Request
Se revisan los cambios.  
Si todo está correcto, se aprueba la PR.

---

## 9. Hacer el merge de la rama
En GitHub, dentro de la PR, se pulsa **Merge pull request**.  
Se confirma el merge para integrar los cambios de `chore/prueba-mr` dentro de `dev`.
