package com.evaluator.equality;

import java.util.Locale;
import java.util.Scanner;

/**
 * Real Number Equality Evaluator / Evaluador de Igualdad de Números Reales.
 * 
 * Spanish:
 * Esta clase evalúa si dos números reales (float/double) son iguales 
 * considerando un margen de tolerancia específico.
 * 
 * English:
 * This class evaluates whether two real numbers (float/double) are equal 
 * considering a specific tolerance margin.
 * 
 * @author LEIDY VANESSA BERNAL MURCIA
 */
public class RealEqualityEvaluator {

    /**
     * Main method that handles input reading and executes the evaluation logic.
     * Método principal que maneja la lectura de datos y ejecuta la lógica de evaluación.
     * 
     * @param args Command line arguments / Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Scanner object configured with US Locale to force dot (.) as decimal separator
        // Objeto Scanner configurado con Locale.US para forzar el punto (.) como separador decimal
        Scanner inputScanner = new Scanner(System.in);
        inputScanner.useLocale(Locale.US);

        // Read the first real number / Lectura del primer número real
        double firstNumber = inputScanner.nextDouble();

        // Read the second real number / Lectura del segundo número real
        double secondNumber = inputScanner.nextDouble();

        // Read the tolerance value / Lectura del valor de tolerancia
        double toleranceValue = inputScanner.nextDouble();

        // Execute evaluation and print result / Ejecutar evaluación e imprimir resultado
        String evaluationResult = evaluateEquality(firstNumber, secondNumber, toleranceValue);
        System.out.println(evaluationResult);

        // Close scanner resource / Cerrar recurso del scanner
        inputScanner.close();
    }

    /**
     * Evaluates if two double numbers are equal given a maximum allowed tolerance.
     * Evalúa si dos números double son iguales dada una tolerancia máxima permitida.
     * 
     * @param numberOne First real number / Primer número real.
     * @param numberTwo Second real number / Segundo número real.
     * @param tolerance Maximum allowed difference / Diferencia máxima permitida.
     * @return "equals" if |numberOne - numberTwo| <= tolerance, otherwise "not equals".
     */
    public static String evaluateEquality(double numberOne, double numberTwo, double tolerance) {
        // Calculate the absolute difference / Calcular la diferencia absoluta
        double absoluteDifference = Math.abs(numberOne - numberTwo);

        // Check if the difference does not exceed the allowed tolerance
        // Verificar si la diferencia no sobrepasa la tolerancia permitida
        if (absoluteDifference <= tolerance) {
            return "equals";
        } else {
            return "not equals";
        }
    }
}
