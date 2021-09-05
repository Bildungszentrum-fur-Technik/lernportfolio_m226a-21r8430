# Zugriffmodifizierer

## Verschiedene Zugriffsmodifizierer

Attribte (und Methoden) dürfen die folgenden Zugriffsmodifizier haben:

* public: Dieser Modifizierer bedeutet, dass alle (<- alle Klassen in Ihrem Projekt) direkt und ohne Umwege auf das Attribut/Methode zugreifen dürfen

* private: Dieser Modifizierer bedeutet, dass nur innerhalb derselben Klasse auf das Attribut/Methode zugegriffen werden kann

* protected: Dieser Modifizierer bedeutet, dass innerhalb der eigene Klasse und aus Klassen im selben Package darauf zu gegriffen werden

## Spezialfall : static

Es können Methoden und Klassenvariablen als static bezeichnet (deklariert) werden.
Sofern eine statische Klassenvariable erst zur Laufzeit dynamisch einen Wert erhalten soll, können Sie dies mit einem statischen Block erreichen.

Beispiel:

```java
 public class LoadTimer {

   static {
     ladeZeit = System.currentTimeInMillis ();
   }
   private static long ladeZeit;
 }
 ```