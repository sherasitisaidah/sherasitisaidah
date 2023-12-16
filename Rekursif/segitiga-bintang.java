 package Rekursif;

 class segitigabintang {

    public static void main(String[] args) {
        int tinggi = 10; 
        cetakPiramida(tinggi);
    }
    public static void cetakPiramida(int tinggi) {
        piramida(tinggi, 0);
    }
    private static void piramida(int tinggi, int baris) {
        if (baris == tinggi) {
            return; 
        }
        cetakSpasi(tinggi, baris);
        cetakBintang(2 * baris + 1);
        System.out.println(); 
        piramida(tinggi, baris + 1);
    }
    private static void cetakSpasi(int tinggi, int baris) {
        for (int i = 0; i < tinggi - baris - 1; i++) {
            System.out.print(" ");
        }
    }
    private static void cetakBintang(int jumlahBintang) {
        if (jumlahBintang == 0) {
            return; 
        }
        System.out.print("*");
        cetakBintang(jumlahBintang - 1);
    }
}