package LogIn;

public class Reg {

    public int run(String passwort) {
        int sicherheitsstufe = 0;

        if (laenge(passwort)) {
            sicherheitsstufe++;
        }

        if(großbuchstaben(passwort)){
            sicherheitsstufe++;
        }

        if(kleinbuchstaben(passwort)){
            sicherheitsstufe++;
        }

        if(sonderzeichen(passwort)){
            sicherheitsstufe++;
        }

        if(zahlen(passwort)){
            sicherheitsstufe++;
        }

        System.out.println("Ihr passwort erreichte " + sicherheitsstufe + " von 5 Sicherheitspunkten");

        return sicherheitsstufe;
    }

    public boolean laenge(String passwort) {
        boolean sicher;

        if (passwort.length() >= 8) {
            sicher = true;
        } else {
            sicher = false;
        }

        return sicher;
    }

    public boolean großbuchstaben(String passwort) {
        boolean sicher;
        int großbuchstaben = 0;

        char[] array = passwort.toCharArray();

        for(int i = 0; i <= passwort.length() - 1; i++){
            if(Character.isUpperCase(array[i])){
                großbuchstaben++;
            }
        }

        if(großbuchstaben >= 2){
            sicher = true;
        }else{
            sicher = false;
        }

        return sicher;
    }

    public boolean kleinbuchstaben(String passwort) {
        boolean sicher;
        int kleinbuchstaben = 0;

        char[] array = passwort.toCharArray();

        for(int i = 0; i <= passwort.length() - 1; i++){
            if(Character.isLowerCase(array[i])){
                kleinbuchstaben++;
            }
        }

        if(kleinbuchstaben >= 2){
            sicher = true;
        }else{
            sicher = false;
        }

        return sicher;
    }

    public boolean sonderzeichen(String passwort) {
        boolean sicher;
        int sonderzeichen = 0;

        char[] array = passwort.toCharArray();

        for(int i = 0; i <= passwort.length() - 1; i++){
            if(!Character.isLetterOrDigit(array[i])){
                sonderzeichen++;
            }
        }

        if(sonderzeichen >= 1){
            sicher = true;
        }else{
            sicher = false;
        }

        return sicher;
    }

    public boolean zahlen(String passwort) {
        boolean sicher;
        int zahlen = 0;

        char[] array = passwort.toCharArray();

        for(int i = 0; i <= passwort.length() - 1; i++){
            if(!Character.isDigit(array[i])){
                zahlen++;
            }
        }

        if(zahlen >= 2){
            sicher = true;
        }else{
            sicher = false;
        }

        return sicher;
    }

}
