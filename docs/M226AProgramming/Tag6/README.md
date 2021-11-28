# Tag6

## Praxisbeispiel Komposition Banken

## Bankkunde

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Bankkunde {
    private String nachname;
    private ArrayList<Konto> konten = new ArrayList<Konto>();
    
    Scanner myObj = new Scanner(System.in);

    public Bankkunde(){
        neuesKonto();
    }

    public void neuesKonto(){
        if(konten.size() < 4){

            System.out.println("Enter kontoNummer");
            String kontoNummer = myObj.nextLine();
            if(kontoNummer.length() == 4){
                konten.add(new Konto(Integer.valueOf(kontoNummer)));
            }
            else {
                System.out.print("Die Konto Nummer muss 4 stellig sein!");
            }
        }
    }

    public void ausgabe(){
        System.out.println("Alle Bankkonten anzeigen:");
        for(int i = 0; i<konten.size();i++){
            System.out.println(konten.get(i).getKontoNummer());
        }
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public String getNachname(){
        return nachname;
    }
}
```
## Konto

```java
public class Konto {

    private int kontoNummer;
    
    public Konto(int kontoNummer){
        this.kontoNummer = kontoNummer;
    }

    public void setKontoNummer(int nummer){
        int lengthOfInt = String.valueOf(kontoNummer).length();
        if(lengthOfInt == 4 ){
            kontoNummer = nummer;
        }
        else{
            System.out.println("Ungültige Kontonummer");
        }
    }

    public int getKontoNummer(){
        return kontoNummer;
    }
}
```

## App

```java
public class App {
    public static void main(String[] args) throws Exception {
        Bankkunde testKunde = new Bankkunde();
        testKunde.neuesKonto();
        testKunde.ausgabe();
    }
}
```


