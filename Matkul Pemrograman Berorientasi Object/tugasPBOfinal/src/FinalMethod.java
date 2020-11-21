public class FinalMethod {

    public static String judul = "Naruto Shippuden";
    public static int episode = 500;
    public static String mainCharacter = "Uzumaki Naruto";

    final void menampilkan() {
        System.out.println("Judul       : " + judul);
        System.out.println("Episode     : " + episode);
        System.out.println("Tokoh Utama : " + mainCharacter);
    }

}

class AnakFinal extends FinalMethod {

    /*
    void menampilkan() {
        System.out.println("Judul       : Naruto");
        System.out.println("Episode     : 220");
        System.out.println("Tokoh Utama : Uchiha Sasuke");
    }

    Apabila method diatas ditampilkan maka muncul eror dengan pesan
    "java: menampilkan() in AnakFinal cannot override menampilkan() in FinalMethod overridden method is final"
    karena method menampilkan() pada kelas FinalMethod memiliki keyword final
    */

    public static void main (String args[]){

        // Membuat object anime
        AnakFinal anime = new AnakFinal();
        anime.menampilkan();

        System.out.println("\n\n\n");
        System.out.println("Nama : Ibnu Ahmad Fauzi");
        System.out.println("Nim  : 19104410028");

    }
}