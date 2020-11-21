final public class FinalClass {

    public static void main(String[] args) {

        // Membuat object class Anime
        // Anime anime = new Anime();
        // anime.tampilkan();

        System.out.println("Nama : Ibnu Ahmad Fauzi");
        System.out.println("Nim  : 19104410028");

    }

}

/*
class Anime extends FinalClass {

    void tampilkan(){

        System.out.println("Judul   : Naruto Shippuden");
        System.out.println("Episode : 500");

    }

}

Jika class diatas ditampilkan, maka ketika dijalankan muncul eror
"java: cannot inherit from final FinalClass"
karena class FinalClass memiliki keyword final dan tidak bisa diturunkan
*/