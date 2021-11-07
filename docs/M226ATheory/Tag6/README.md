# Aggregation (Ganzes-Teile-Assoziation)

* Eine Aggregation ist eine Assoziation, deren beteiligte Klassen ein Ganzes-Teile-Hierarchie darstellen.

## Beispiel

* Gehen Sie durch ein Museum mit Bildern, dann kann man davon ausgehen, dass die Bilder auch anderswo aufgehängt werden. Kurzum: Bilder und Museum können für sich alleine existieren.

## UML-Notation für Aggregationen

* Die Aggregation wird als Linie zwischen zwei Klassen dargestellt, und zusätzlich mit einer Raute versehen. Die Raute steht auf der Seite des Aggregats (des Ganzen) und symbolisiert das Behälterobjekt, in dem die Teile gesammelt sind.

* Die Kardinalitätsangabe auf der Seite des Ganzen ist häufig 1, so dass ein Fehlender Angabe standardmässig als 1 interpretiert wird.

Im Beispiel mit dem Museum ist sofort klar, dass

* das Museum das Ganze,
* die Bilder ein Teil

darstellen.

* Trotzdem kann das Museum für sich alleine bestehen, dasselbe gilt für ein Bild. Man sagt es so: Das Museum HAT EIN Bild, resp. HAT mehrere Bilder.

## Eigene Bespiele

* Ein Beispiel wäre eine Vorlesung und in dieser Vorlesung gibt es Studenten die ein Teil der Vorlesung sind.
* Ein zweites Beispiel wäre eine Fussballmannschaft mit mehreren Spielern die ein Teil der Mannschaft sind.