public class FinalVariabel {

    // Deklarasi variabel dengan keyword final
    public static String anime = "Naruto";
    public static int episode = 220;
    public static final String mainCharacter = "Uzumaki Naruto";

    public static void identitas() {
        System.out.println("Nama : Ibnu Ahmad Fauzi");
        System.out.println("Nim  : 19104410028");
    }

    public static void main(String[] args) {

        anime = "Naruto Shipuden";
        episode = 500;

        /*
        finalvariabel.mainCharacter = "Uchiha Sasuke"; => Mengganti nilai dari variabel dengan keyword final
        java: cannot assign a value to final variable mainCharacter => Pesan eror yang ditampilkan
        */

        System.out.println("Anime   : " + anime);
        System.out.println("Episode : " + episode);
        System.out.println("MC      : " + mainCharacter);

        System.out.println("\n\n\n");

        identitas();

    }

}
