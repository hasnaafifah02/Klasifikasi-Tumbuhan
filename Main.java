package classOOP_interface;

public class Main {
    public static void main(String[] args) {
        Berbiji mangga = new Berbiji("Mangga Madu", "Mangifera indica l.", "Dikotil");
        mangga.displayDeskripsi();

        Paku paku_pedang = new Paku("Paku Pedang", "Marsilea crenata", "Pteropsida");
        paku_pedang.displayDeskripsi();

        Lumut campylopus = new Lumut("Campylopus", "Leucobryaceae", "Bryopsida");
        campylopus.displayDeskripsi();
    }
}