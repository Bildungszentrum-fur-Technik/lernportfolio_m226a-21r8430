public class App {
    public static void main(String[] args)
    {
        // Es werden konkrete Objekte (Instanzen) erzeugt
        Mutter frauMu = new Mutter();
        Mutter frauMo = new Mutter();
        Kind claudia = new Kind();
        // Setzen des Alters der Instanz frauMu
        frauMu.setAlterMutter(28);
        // frauMu bekommt Claudia zeigt auf Instanz Claudia
        frauMu.setIhrKind(claudia); 
        frauMo.setIhrKind(claudia);
        // Kind Claudia zeigt auf frauMu, also das Kind von frauMu
        claudia.setSeineMutter(frauMu);
        System.out.println("frauMu mit Tochter Claudia");
        System.out.println("Quasi Adresse des Kindes von frauMu: " + frauMu.getIhrKind());

        System.out.println("frauMo mit Tochter Claudia");
        System.out.println("Quasi Adresse des Kindes von frauMo: " + frauMo.getIhrKind());

        System.out.println("Quasi Adresse der Mutter von Claudia: " + claudia.getSeineMutter());

        System.out.println("Alter der Mutter von Claudia: " + frauMu.getAlterMutter());
    }
}

