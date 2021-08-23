# Repetition: Objekte, Methoden und Referenzen

## Scanner
Damit Daten über die Konsole eingelesen werden können, muss zuerst ein Scanner-Objekt erstellt werden. Erst dann können auf dem Objekt die Zeilen über eine Methode eingelesen werden.

```java
Scanner s = new Scanner(System.in);
int xy = s.nextInt(); // oder halt eben nextDouble() oder sonst etwas....
```

## Objekte

Um ein Objekt tatsächlich zu erzeugen (zu konstruieren), wird eine bestimmte Funktion innerhalb der Klasse aufgerufen, die man deshalb auch Konstruktor nennt. Man erkennt sie daran, dass sie den gleichen Namen hat wie die Klasse.

Beispiel: Eine Klasse Point wird definiert:
```java
public class Point
{
    // Attribut 
    public int x_koord;
    public int y_koord;

    // Konstruktor
    public void Point ()
    {
        // Hier kommen Befehle hin, welche beim Erstellen eines Pointers ausgeführt werden sollen
    }
}
```
Um aus dieser Klasse nun ein Objekt zu erschaffen, wird sie mit new aufgerufen:
```java
Point einPoint = new Point();
```
Erst wenn wir ein Objekt (man sagt auch Instanz) einer Klasse haben, können wir auf die Attribute zugreifen:
```java
Point einPoint = new Point();
einPoint.x_koord = 4;
```

