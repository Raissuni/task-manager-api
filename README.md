# 📝 Task Manager API

API REST para la gestión de tareas, desarrollada con **Spring Boot**.  
Este proyecto forma parte de mi aprendizaje y portafolio como desarrollador backend.

---

## 🚀 Tecnologías utilizadas

- **Java 21**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## 📂 Estructura del proyecto

src/
└── main/
├── java/
│ └── com/example/Tareas/
│ ├── controllers/
│ │ └── StatusController.java
│ └── TareasApplication.java
└── resources/
├── application.properties
└── static/


---

## ▶️ Cómo ejecutar el proyecto

Asegúrate de tener **Java 21** y **Maven** instalados.

En la raíz del proyecto ejecuta:

mvn spring-boot:run



Cuando la aplicación arranque, prueba los siguientes endpoints:

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/` | Página de bienvenida |
| GET | `/status` | Verifica que la API está funcionando |

---

## 🧠 Próximas funcionalidades

✔ Modelo Tarea  
✔ Base de datos H2  
✔ CRUD completo  
✔ Documentación con Swagger  
⬜ Autenticación con JWT  
⬜ Migración a MySQL  
⬜ Frontend (opcional)

---

## 📌 Estado del proyecto

🟢 **En desarrollo**

---

## 👤 Autor

**Raissuni**  
GitHub: https://github.com/Raissuni
