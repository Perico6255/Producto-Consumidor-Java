# Productor-Consumidor: Implementación en Java

## Objetivos

- Implementación del Búfer Compartido: Desarrollar un búfer compartido que sirva como el almacén en el que el productor deposita datos y el consumidor los retira.

- Sincronización entre Hilos: Garantizar una correcta sincronización entre el hilo productor y el hilo consumidor para evitar condiciones de carrera y asegurar que el búfer se manipule de manera segura.

- Manejo de Capacidad del Búfer: Limitar la capacidad del búfer a 6 caracteres, permitiendo que el productor solo agregue datos cuando haya espacio y que el consumidor solo retire datos cuando el búfer no esté vacío.

## Instrucciones
### Requisitos Previos:
- Tener instalado Java en su sistema.
- Descargar o clonar este repositorio.
#### http: 
```
git clone https://github.com/Perico6255/Producto-Consumidor-Java.git
```
#### ssh: 
```
git clone git@github.com:Perico6255/Producto-Consumidor-Java.git
```
- Ejecución del Programa Main:
Deberia de ver una salida de guardar y consumir caracteres en el buffer
