# Tag9

## Videothek anmeldeprozess

```java
import java.util.HashMap;

public class Videothek {
    HashMap<Integer, Kunde> kunden = new HashMap<Integer, Kunde>();
    HashMap<String, Film> filme = new HashMap<String, Film>();

    public void ausleihen(Kunde k, String f){
        
    }
    public void anmelden(int kundenNummer, int password){
        for(int i =0;i<3;i++){
            Kunde a = kunden.get(kundenNummer);
            if(a != null){
                if(password == kunden.get(kundenNummer).getpasswort()){
                    System.out.println("Kunde ist angemeldet");
                    break;
                }
            }
        }
    }
}
```