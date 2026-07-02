package com.btcag.generated.util;

public class AllureUtils {

    /**
     * Diese Methode simuliert den Aufbau der AllureUtils in der Testautomatisierung. Jeder fachliche Schritt
     * wird mit einem "step" versehen. Der Inhalt dieser Methode wurde auf das Ausführen des Schritts und einer
     * Meldung in der Konsole reduziert.
     */
    public static void step(String description, Runnable runnable) {
        System.out.printf("Simulierter Aufruf mit Allure. Schritt: '%s'%n", description);
        try {
            runnable.run();
            System.out.printf("Schritt '%s' wurde erfolgreich ausgeführt.%n", description);
        } catch (Throwable t) {
            System.out.printf("Beim Schritt '%s' kam es zu einem Fehler: %s%n", description, t.getMessage());
            throw new RuntimeException("Schritt fehlgeschlagen: " + description, t);
        }

    }

}
