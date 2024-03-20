package jobsheet6;

public class MainHotel26 {
    public static void main(String[] args) {
        HotelService26 listhotels = new HotelService26();

        Hotel26 H1 = new Hotel26("Hotel 1", "Nganjuk", 120000, (byte) 5);
        Hotel26 H2 = new Hotel26("Hotel 2", "Surabaya", 125000, (byte) 4);
        Hotel26 H3 = new Hotel26("Hotel 3", "Malang", 130000, (byte) 3);

        listhotels.tambah(H1);
        listhotels.tambah(H2);
        listhotels.tambah(H3);

        System.out.println("=============================================================");
        System.out.println("                  Data Harga sebelum sorting                 ");
        System.out.println("=============================================================");
        listhotels.tampil();

        System.out.println("=============================================================");
        System.out.println("      Data Harga setelah sorting menggunakan Bubble Sort"     );
        System.out.println("=============================================================");
        listhotels.bubbleSort();
        listhotels.tampil();

        System.out.println("=============================================================");
        System.out.println("    Data Harga setelah sorting menggunakan Selection Sort"    );
        System.out.println("=============================================================");
        listhotels.selectionSort();
        listhotels.tampil();
    }
}