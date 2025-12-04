# Taller Component

Sara Sofia Castro Quiuroga 20231020212

## Requerimientos del Taller 1

### 1. Crear una clase Entity

● Debe permitir:

  ○ Agregar componentes.

  ○ Obtener componentes por tipo.

  ○ Ejecutar acciones generales (update).

### 2. Crear una interfaz Component
Cada componente debe:

● Guardar una referencia a la Entity padre.

● Tener un método update().

### 3. Implementar al menos 3 componentes

## Ejemplos sugeridos:
### ⭐ A) MovementComponent

● Tiene atributos de posición (x, y).

● En update muestra cómo cambia la posición.

### ⭐ B) HealthComponent

● Tiene vida actual y vida máxima.

● En update puede regenerar vida o mostrar estado.

### ⭐ C) AttackComponent
● Usa el HealthComponent de otra entidad para hacer daño.

### 4. Crear una clase principal con un escenario

● Crear varias entidades:

  ○ Un jugador

  ○ Un enemigo

● Añadirles distintos componentes.

● Simular varios "ticks" de actualización con un bucle.
