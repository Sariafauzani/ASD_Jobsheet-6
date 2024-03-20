package jobsheet6;

public class HotelService26 {
    Hotel26 listhotels[] = new Hotel26[3];
    int idx;

    void tambah(Hotel26 H){
        if (idx < listhotels.length){
            listhotels[idx] = H;
            idx++;
        } else {
            System.out.println("Kamar sudah penuh!!");
        }
    }

    void tampil(){
        for (Hotel26 H : listhotels){
            H.tampil();
            System.out.println("==================================");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listhotels.length-1; i++){
            for (int j = 1; j < listhotels.length-i; j++){
                if (listhotels[j].harga > listhotels[j-1].harga){
                    //di bawah ini proses swap atau penukaran
                    Hotel26 tmp = listhotels[j];
                    listhotels[j] = listhotels[j-1];
                    listhotels[j-1] = tmp;//tmp menampung sementara listhotels[j]
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listhotels.length-1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listhotels.length; j++){
                if (listhotels[j].bintang < listhotels[idxMin].bintang){
                    idxMin = j;
                }
            }
            //swap
            Hotel26 tmp = listhotels[idxMin];
            listhotels[idxMin] = listhotels[i];
            listhotels[i] = tmp;
        }
    }
}