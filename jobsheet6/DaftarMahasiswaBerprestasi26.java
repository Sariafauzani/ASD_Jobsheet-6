package jobsheet6;

public class DaftarMahasiswaBerprestasi26 {
    Mahasiswa26 listMhs[] = new Mahasiswa26[5];
    int idx;

    void tambah(Mahasiswa26 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for (Mahasiswa26 m : listMhs){
            m.tampil();
            System.out.println("==================================");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++){
            for (int j = 1; j < listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa26 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;//tmp menampung sementara listMhs[j]
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa26 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 0; i < listMhs.length; i++){
            Mahasiswa26 tmp = listMhs[i];
            int j = i;
            //while (j > 0 && listMhs[j - 1].ipk > tmp.ipk){
                //listMhs[j] = listMhs[j - 1];
                //j--;
            //}
            while (j > 0 && listMhs[j - 1].ipk < tmp.ipk){
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
}