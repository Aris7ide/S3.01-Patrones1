## Patró Singleton
### ¿Qué es?
El patrón Singleton es un patrón de diseño creacional que garantiza que una clase tenga una única instancia y proporcione un punto de acceso global a la misma. En Java, esto significa que sólo podremos crear un objeto de esta clase, y siempre obtendremos la misma instancia cada vez que la solicitemos.

En circunstancias normales, una clase Java puede ser instanciada múltiples veces. Sin embargo, existen situaciones en las que sólo necesitamos una única instancia para coordinar acciones en toda la aplicación. Éste es el caso típico del patrón Singleton.

## Utilidad
El patrón Singleton es útil cuando:

🔒 Queremos controlar el acceso a un recurso compartido, como una conexión a una base de datos, un archivo de configuración o un registro centralizado.
🌍 Necesitamos mantener un estado global coherente accesible desde diferentes partes del sistema.
⚠️ Buscamos evitar la creación de múltiples instancias que consuman recursos innecesarios o generen conflictos de sincronización.
Un ejemplo común de uso del patrón Singleton se da en frameworks como Spring, donde los beans se instancian como Singleton por defecto para asegurar que la lógica de negocio no se duplique innecesariamente.

## Propósito
El propósito principal del patrón Singleton es:

🧍‍♂️ Garantizar una única instancia de una clase.
🌐 Proporcionar un punto de acceso global a esta instancia.
## Ejercicio:
Implementación del patrón Singleton con una clase Undo

### Objetivo
Implementar una clase que replique el funcionamiento básico del mando Undo, utilizando el patrón de diseño Singleton para garantizar que sólo exista una única instancia compartida en toda la aplicación.

### Descripción
Crea una clase llamada Undo que sea capaz de:

- Añadir pedidos a su historial.
- Deshacer el último pedido (funcionalidad tipo undo).
- Listar todos los pedidos almacenados (similar a historyLinux).
- La clase Undo debe implementar el patrón Singleton para asegurar que todo el programa comparte el mismo historial.

### Requisitos
- El constructor ha de ser privat.
- El acceso a la instancia se realizará mediante un método estático getInstance().
- La clase debe utilizar una estructura de datos como Stack<String>o List<String>para almacenar los pedidos.
- Implementa los siguientes métodos:
- void addCommand(String command);
- String undoCommand(); Devuelve y elimina el último comando.
- void showHistory(); muestra todos los pedidos almacenados hasta el momento.
- La implementación del código debe ser demostrado mediante tests unitarios.

### Execution
- He creado una clase Undo con constructor privado y una clase public getInstance que crea una instancia solo cuando ya no haya una. 
- ahi todos los metodos pedidos. 
- en las pruebas unitarias he testeado todos los metodos y asegurado que si se crean otras instancias de Undo en realidad responden a la misma ya que añadiendo commands siempre se añaden a la misma lista.