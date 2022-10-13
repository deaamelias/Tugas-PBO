class pbo {
    public static void main(String args[]) {
        int array[] = new int[5];
        System.out.print("=================================================");
        System.out.print("                   Program C++");
        System.out.print("        Pencarian Data Pada Array 1 Dimensi");  //judul program
        System.out.print("=================================================");
        System.out.print("Inputkan data");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
        System.out.print("Nilai ke : " + (i + 1) + " : ");  //input array 1d
            array[i] = input.next();
        }
        System.out.println("Hasil outputnya");  //output
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai ke : " + (i + 1) + " : " + array[i]);
        }
        System.out.print("=================================================");
        System.out.print("                   Program C++");  //judul program
        System.out.print("  Bilangan Ganjil dan Genap Pada Array 1 Dimensi");
        System.out.print("=================================================");
        for (int i = 0; i < 5; i++) {
            if (array[i] % 2 == 0) {
                System.out.print("Nilai Genap adalah " + array[i]);  //output nilai genap 
            }
        }
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                System.out.print("Nilai Ganjil adalah " + array[i]);  //output nilai ganjil
            }
        }
        System.out.print("=================================================");
        System.out.print("                   Program C++");
        System.out.print("  Bilangan Ganjil dan Genap Pada Array 2 Dimensi");  //judul program
        System.out.print("=================================================");
        int a;
        int b;
        char ulang;
        int ar[][];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah baris :" + a);
        System.out.println("Masukkan jumlah baris :" + b);  //input indeks
        int ar[][];
        System.out.println("Anda akan menggunakan Matrix " + a + "x" + b);
        System.out.print("=================================================");
        for (int i = 0; i <= a - 1; i++) {
            for (int j = 0; j <= b - 1; j++) {
                System.out.print("Masukkan data baris ke-" + i + " kolom ke-" + j + " : ");  //input array
                ar[i][j] = input.next();
            }
            if (i == a - 1) {
                System.out.print("=================================================");
            } else {
                System.out.print("=================================================");
            }
        }
        System.out.println("Model Matrix");
        for (int i = 0; i <= a - 1; i++) {
            for (int j = 0; j <= b - 1; j++) {
                System.out.println(ar[i][j] + " ");  //output array 2d
            }
        }
        int pilih;
        do {
            System.out.print("=================================================");
            System.out.println("                   MENU");
            System.out.print("=================================================");  //menu program
            System.out.println("1. Elemen Genap");
            System.out.println("2. Elemen Ganjil");
            System.out.println("1. Elemen Genap");
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Pilihan Anda : " + pilih);  
            if (pilih == 1) {
                System.out.println("Elemen genapnya : ");
                for (int i = 0; i <= a - 1; i++) {
                    for (int j = 0; j <= b - 1; j++) {
                        if (ar[i][j] % 2 == 0) {
                            System.out.println(ar[i][j] + " ");  //output genap
                            break;
                        }
                    }
                }
            } else if (pilih == 2) {
                System.out.println("Elemen ganjilnya : ");  //output ganjil
                for (int i = 0; i <= a - 1; i++) {
                    for (int j = 0; j <= b - 1; j++) {
                        if (ar[i][j] % 2 != 0) {
                            System.out.println(ar[i][j] + " ");
                            break;
                        }
                    }
                }
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih menu yang lain ? (y/t) : " + ulang);
        }
        while (ulang != 't');
}