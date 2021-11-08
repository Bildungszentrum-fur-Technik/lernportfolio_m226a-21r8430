# Praxis-Beispiel Aggregation : Computerbauteil Programming

## Auftrag 2 : Klasse Disk

* Eine Disk darf nicht zweimal eingebaut werden und dies kann man einfach mit einer if-Abfrage abfangen

```java
public class Disk {

    private Boolean eingebaut = false;

    public void eingebau(){
        if(this.eingebaut){
            System.out.println("Diese Disk wurde schon eingebaut");
        }
        else{
            this.eingebaut = true;
        }
    }
    public void ausbau(){
        this.eingebaut = false;
    }
    public Boolean getStatus(){
        return this.eingebaut;
    }

    
}
```

## Auftrag 3 : Klasse Disk

* Ich habe noch eine if-Abfrage hinzugefügt die beim erstellen eines PC's dies nur tut wenn die Disk noch nicht irgendwo eingebaut ist.

```java
public class PC {

    private Disk verweisAufDisk;

    public void diskWechseln(Disk aDisk){
        verweisAufDisk.ausbau();
        aDisk.eingebau();
        verweisAufDisk = aDisk;
    }
    PC(Disk vaufDisk){
        vaufDisk.eingebau();
        if(vaufDisk.getStatus()){
            this.verweisAufDisk = vaufDisk;
        }
    }
}

```