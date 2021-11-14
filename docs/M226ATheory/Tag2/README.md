# Tag2

## Repetition: Objekte, Methoden und Referenzen

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

## Methoden

Unsere Klasse könnte also mit den Methoden so aussehen:
```java
public class Point
{
    // Attribute - auf private gesetzt 
    private int x_koord;
    private int y_koord;

    // Konstruktor
    public void Point ()
    {
        // Hier kommen Befehle hin, welche beim Erstellen eines Pointes ausgeführt werden sollen
    }

    public void addToX (int wert)
    {
        x_koord += wert;
    }

    public void addToY (int wert)
    {
        y_koord += wert;
    }
}
```
addToX() und addToY() sind also Methode in der Klasse Point. Sie übernehmen je einen Übergabeparameter vom Typ int und haben keinen Rückgabewert (void).

Man wendet die Methode wie folgt an:
```java
Point einPoint = new Point();
einPoint.addToX(30);
einPoint.addToY(30);
```
Um das Beispiel komplett zu machen, gibt es noch die beiden Methoden getX() und getY() - sie sollen die Werte x_koord und y_koord zurückgeben können.
```java
public class Point
{
    // Attribute - auf private gesetzt 
    private int x_koord;
    private int y_koord;

    // Konstruktor
    public void Point (int x, int y)
    {
        x_koord = x;
        y_koord = y;
    }

    public void addToX (int wert)
    {
        x_koord += wert;
    }

    public void addToY (int wert)
    {
        y_koord += wert;
    }

    public void setX (int wert)
    {
        x_koord = wert;
    }

    public void setY (int wert)
    {
        y_koord = wert;
    }

    public int getX ()
    {
        return x_koord;
    }

    public int getY ()
    {
        return y_koord;
    }
}
```
Das Beispiel komplett in Anwendung sieht so aus:
```java
Point einPoint = new Point(2,2);
einPoint.addToY(15);
einPoint.setX(77);

int localX = einPoint.getX(); // 77
int localY = einPoint.getY(); // 17
```
