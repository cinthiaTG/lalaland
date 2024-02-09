[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/NuqSoAmQ)
# Práctica 2
## Herencia Simple

**Problema**: Se desea implementar un sistema de gestión de una biblioteca. La biblioteca tiene cuatro tipos de usuarios: estudiantes, profesores, administradores y bibliotecarios. Los estudiantes y los profesores pueden tomar prestados libros, pero los estudiantes solo pueden tomar prestados hasta 3 libros a la vez, mientras que los profesores pueden tomar prestados hasta 5 libros a la vez. Cada libro, revista, periódico y tesis tiene un título, un autor y un número de identificación único. Los estudiantes, los profesores y los bibliotecarios pueden buscar libros por título o autor. Además, los profesores y los administradores pueden agregar nuevos libros, revistas, periódicos y tesis a la biblioteca. Los administradores pueden agregar, editar y eliminar usuarios. Los bibliotecarios pueden prestar y recibir libros, revistas, periódicos y tesis, y mantener una lista de deudores de libros. Los préstamos de libros, revistas, periódicos y tesis tienen una duración de 7 días para estudiantes y 14 días para profesores. Los estudiantes y los profesores pueden renovar sus préstamos una vez por un período adicional de 7 días. Los bibliotecarios pueden renovar los préstamos de los estudiantes y los profesores una vez por un período adicional de 7 días. Los estudiantes y los profesores que no devuelvan los libros, revistas, periódicos y tesis a tiempo se agregarán a la lista de deudores de libros.

Para resolver este problema, se puede utilizar la herencia simple para crear cuatro clases: `Estudiante`, `Profesor`, `Administrador` y `Bibliotecario`. Las cuatro clases heredarán los atributos y métodos de la clase `Usuario`. La clase `Usuario` contendrá los atributos y métodos comunes a todos los tipos de usuarios, como el nombre y el número de identificación. Las clases `Estudiante`, `Profesor`, `Administrador` y `Bibliotecario` agregarán atributos y métodos específicos para cada tipo de usuario, como el número máximo de libros que se pueden tomar prestados o la capacidad de agregar, editar y eliminar usuarios.

Además, se puede utilizar la herencia simple para crear cuatro clases: `Libro`, `Revista`, `Periodico` y `Tesis`. Las cuatro clases heredarán los atributos y métodos de la clase `Material`. La clase `Material` contendrá los atributos y métodos comunes a todos los tipos de materiales, como el título y el número de identificación. Las clases `Libro`, `Revista`, `Periodico` y `Tesis` agregarán atributos y métodos específicos para cada tipo de material, como el autor.

Por último, se puede utilizar la herencia simple para crear dos clases: `Prestamo` y `Deudor`. La clase `Prestamo` contendrá los atributos y métodos comunes a todos los tipos de préstamos, como la fecha de inicio y la fecha de vencimiento. Las clases `Estudiante` y `Profesor` tendrán una lista de objetos `Prestamo` que representan los préstamos de libros, revistas, periódicos y tesis. La clase `Bibliotecario` tendrá una lista de objetos `Deudor` que representan los estudiantes y profesores que no han devuelto los libros, revistas, periódicos y tesis a tiempo.

**Requerimientos funcionales:**

1. **Agregar usuario**: Los administradores deben poder agregar nuevos usuarios al sistema. Los usuarios deben ser clasificados como estudiantes, profesores, administradores o bibliotecarios.
2. **Eliminar usuario**: Los administradores deben poder eliminar usuarios del sistema.
3. **Buscar usuario**: Los administradores deben poder buscar usuarios por nombre o número de identificación.
4. **Agregar libro**: Los profesores y los administradores deben poder agregar nuevos libros al sistema.
5. **Eliminar libro**: Los profesores y los administradores deben poder eliminar libros del sistema.
6. **Buscar libro**: Los estudiantes, los profesores y los bibliotecarios deben poder buscar libros por título o autor.
7. **Prestar libro**: Los estudiantes y los profesores deben poder tomar prestados libros del sistema. Los estudiantes solo pueden tomar prestados hasta 3 libros a la vez, mientras que los profesores pueden tomar prestados hasta 5 libros a la vez.
8. **Recibir libro**: Los estudiantes y los profesores deben poder devolver los libros que han tomado prestados.
9. **Renovar préstamo**: Los estudiantes y los profesores deben poder renovar el préstamo de un libro una vez por un período adicional de 7 días.
10. **Agregar revista**: Los profesores y los administradores deben poder agregar nuevas revistas al sistema.
11. **Eliminar revista**: Los profesores y los administradores deben poder eliminar revistas del sistema.
12. **Buscar revista**: Los estudiantes, los profesores y los bibliotecarios deben poder buscar revistas por título o autor.
13. **Prestar revista**: Los estudiantes y los profesores deben poder tomar prestadas revistas del sistema. Los estudiantes solo pueden tomar prestadas hasta 3 revistas a la vez, mientras que los profesores pueden tomar prestadas hasta 5 revistas a la vez.
14. **Recibir revista**: Los estudiantes y los profesores deben poder devolver las revistas que han tomado prestadas.
15. **Renovar préstamo de revista**: Los estudiantes y los profesores deben poder renovar el préstamo de una revista una vez por un período adicional de 7 días.
16. **Agregar periódico**: Los profesores y los administradores deben poder agregar nuevos periódicos al sistema.
17. **Eliminar periódico**: Los profesores y los administradores deben poder eliminar periódicos del sistema.
18. **Buscar periódico**: Los estudiantes, los profesores y los bibliotecarios deben poder buscar periódicos por título o autor.
19. **Prestar periódico**: Los estudiantes y los profesores deben poder tomar prestados periódicos del sistema. Los estudiantes solo pueden tomar prestados hasta 3 periódicos a la vez, mientras que los profesores pueden tomar prestados hasta 5 periódicos a la vez.
20. **Recibir periódico**: Los estudiantes y los profesores deben poder devolver los periódicos que han tomado prestados.
21. **Renovar préstamo de periódico**: Los estudiantes y los profesores deben poder renovar el préstamo de un periódico una vez por un período adicional de 7 días.
22. **Agregar tesis**: Los profesores y los administradores deben poder agregar nuevas tesis al sistema.
23. **Eliminar tesis**: Los profesores y los administradores deben poder eliminar tesis del sistema.
24. **Buscar tesis**: Los estudiantes, los profesores y los bibliotecarios deben poder buscar tesis por título o autor.
25. **Prestar tesis**: Los estudiantes y los profesores deben poder tomar prestadas tesis del sistema. Los estudiantes solo pueden tomar prestadas hasta 3 tesis a la vez, mientras que los profesores pueden tomar prestadas hasta 5 tesis a la vez.
26. **Recibir tesis**: Los estudiantes y los profesores deben poder devolver las tesis que han tomado prestadas.
27. **Renovar préstamo de tesis**: Los estudiantes y los profesores deben poder renovar el préstamo de una tesis una vez por un período adicional de 7 días.

**Requerimientos no funcionales:**

1. **Usabilidad**: La interfaz de línea de comandos debe ser fácil de usar y entender para todos los usuarios.
2. **Precisión**: La información almacenada sobre los libros, revistas, periódicos y tesis y los préstamos de los usuarios debe ser precisa, consistente y confiable.
3. **Disponibilidad**: El sistema debe estar disponible durante el horario de apertura de la biblioteca.
4. **Seguridad**: La información almacenada en el sistema debe estar protegida contra accesos no autorizados.
5. **Escalabilidad**: El sistema debe ser capaz de manejar un gran número de usuarios y materiales.
6. **Mantenibilidad**: El sistema debe ser fácil de mantener y actualizar.
7. **Rendimiento**: El sistema debe ser capaz de manejar un gran número de transacciones simultáneas sin retrasos significativos.
8. **Portabilidad**: El sistema debe ser capaz de ejecutarse en diferentes plataformas y sistemas operativos.


  > **Nota**
  >
  > Se deberá generar el proyecto maven correspondiente. Se deberán generar los test unitarios de cada clase y los test de integración.

