# programacion 

Respuestas del Taller de Nivelación PI a PII

Parte Teórica
Markdown
Markdown es un lenguaje sencillo para dar formato a textos. Sirve para escribir documentos con títulos, listas, enlaces o negritas sin necesidad de usar programas complicados. Es muy usado en archivos README en proyectos de programación.
Git
1. Un repositorio en Git es como una carpeta especial que guarda no solo los archivos, sino también el historial de cambios. A diferencia de un proyecto normal, puedes ver cómo estaba en el pasado.
2. Git tiene tres áreas: Working Directory (donde editas), Staging Area (donde seleccionas qué guardar) y Repository (donde se guarda oficialmente el cambio).
3. Internamente, Git guarda los cambios como objetos: blob (contenido del archivo), tree (estructura de carpetas), commit (registro de cambio) y tag (etiqueta).
4. Un commit se crea después de usar git add y git commit. Guarda el autor, fecha, mensaje y referencia a los cambios.
5. git fetch trae los cambios remotos pero no los mezcla, git pull los trae y los combina directo con tu trabajo.
6. Un branch es una rama, es decir, una línea independiente de trabajo. Git usa punteros para saber dónde está cada rama.
7. Merge une ramas. A veces surgen conflictos si se cambió la misma parte de un archivo. Se resuelven editando manualmente y confirmando.
8. git add manda los archivos al área de staging. Si omito este paso, Git no sabrá qué cambios quiero guardar en el commit.
9. .gitignore es un archivo donde indico qué no quiero que Git rastree, por ejemplo archivos temporales.
10. git commit --amend modifica el último commit, mientras que un nuevo commit crea otro registro en el historial.
11. git stash guarda cambios sin comprometerlos, útil cuando debo cambiar de rama rápido sin perder lo que llevo.
12. Para deshacer, Git tiene comandos: git reset (mueve commits), git revert (crea un commit inverso) y git checkout (volver a estado anterior).
13. Los remotos son como direcciones (origin, upstream). Sirven para conectar con repositorios externos. Para forks uso git remote add y git fetch.
14. Para ver historial uso git log (lista), git diff (muestra diferencias) y git show (detalle de un commit).
Programación en Java
15. Tipos primitivos: byte, short, int, long, float, double, char y boolean.
16. if/else sirven para decidir; switch para varias opciones; bucles (for, while, do-while) repiten acciones.
17. Los nombres significativos ayudan a entender el código sin tener que adivinar qué hace cada variable o método.
18. POO es un estilo de programación que organiza el código en clases y objetos.
19. Sus cuatro pilares son: abstracción, encapsulamiento, herencia y polimorfismo.
20. Herencia es cuando una clase puede heredar atributos y métodos de otra. En Java se usa con extends.
21. Modificadores de acceso: public (visible en todas partes), private (solo dentro de la clase), protected (visible en el mismo paquete y subclases).
22. Una variable de entorno es un valor que el sistema guarda para configurar programas, como la ruta de Java.



        
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena invertida: " + textoInvertido);
        
        scanner.close();
    }
}
