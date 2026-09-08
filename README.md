# Real Number Equality Evaluator / Evaluador de Igualdad de Números Reales

## English

### Description
Java program that evaluates whether two real numbers (`double`) are equal given a maximum allowed tolerance margin ($|n_1 - n_2| \le \text{tolerance}$).

### Features
- Reads input using `Scanner` configured with `Locale.US` to support standard dot (`.`) decimal points.
- Implements absolute difference calculation via `Math.abs()`.
- Outputs `equals` or `not equals` based on the tolerance evaluation.

### How to Run
Compile
javac src/com/evaluator/equality/RealEqualityEvaluator.java
Run
java -cp src com.evaluator.equality.RealEqualityEvaluator

### Test Cases
- Input: `2.999 3 0.01` $\rightarrow$ Output: `equals`
- Input: `2.999 3 0.00000001` $\rightarrow$ Output: `not equals`

---

## Español

### Descripción
Programa en Java que evalúa si dos números reales (`double`) son iguales considerando un margen de tolerancia máximo permitido ($|n_1 - n_2| \le \text{tolerancia}$).

### Características
- Utiliza `Scanner` configurado con `Locale.US` para aceptar el formato estándar con punto (`.`).
- Implementa el cálculo de la diferencia absoluta con `Math.abs()`.
- Imprime `equals` o `not equals` según la tolerancia.

### Cómo Ejecutar
Compilar
javac src/com/evaluator/equality/RealEqualityEvaluator.java
Ejecutar
java -cp src com.evaluator.equality.RealEqualityEvaluator

### Casos de Prueba
- Entrada: `2.999 3 0.01` $\rightarrow$ Salida: `equals`
- Entrada: `2.999 3 0.00000001` $\rightarrow$ Salida: `not equals`
