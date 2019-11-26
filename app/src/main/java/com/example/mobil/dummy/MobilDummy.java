package com.example.mobil.dummy;

import com.example.mobil.models.Mobil;

import java.util.ArrayList;

public class MobilDummy
{
    /*
    * 0: Nama Mobil
    * 1: Identitas Mobil
    * 2: Deskripsi
    * 3: Photo
     */

    // Data Mobil Resmi: https://www.otomotifo.com/harga-mobil-lamborghini-termahal
    public static String[][] data = new String[][]{
            {
                    "Lamborghini Veneno Roadster",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Harga-Mobila-Lamborgini-Termahal-di-Dunia.jpg",
                    "Hadir dalam jumlah terbatas membuat harga mobil Lamborghini Veneno Roadster dibanderol selangit. Untuk membelinya para kolektor mobil mewah harus mengeluarkan uang mencapai USD$5.6 Juta apabila kita rupiahkan setara Rp. 74.6 Miliar. Harga tersebut akan terus naik seiring berjalannya waktu, karena mobil ini hanya diproduksi 9 unit di dunia dan menjadi incaran kolektor mobil mewah dari seluruh dunia yang penasaran ingin mencicipi performa mesin V12 berkapasitas 6.5 Liter yang diklaim memiliki kemampuan akselerasi 0-100km/jam dalam waktu2.9 detik. Fantastis."
            },
            {
                    "Lamborghini Veneno",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Veneno.jpg",
                    "Harga mobil Lamborghini ini sama mahalnya. Pasalnya kiga harus mengeluarkan uang mencapai USD$5.3 Juta atau setara 70 Miliar Rupiah. Dibalik mahalnya harga Lamborghini Veneno, kita akan mendapatkan sebuah hypercar yang mampu melaju sangat kencang dari 0-100km/jam dalam waktu 2.8 detik. Tersedia transmisi 7 percepatan semi-otomatis yang akan mengoptimalkan performa mesin V12 berkapasitas 6.2 liter, sehingga mampu mengeluarkan tenaga mencapai 740 horsepower. Alhasil Lamborghini Veneno mampu melaju cepat dengan kecepatan maksimal 354 km/jam."
            },
            {
                    "Lamborghini Egoista",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Egoista-Concept.jpg",
                    "Desain Lamborghini Egoista Concept terlihat bagaikan sebuah jet. Pasalnya mobil ini hanya memiliki satu tempat duduk. Bahkan Lamborghini tidak menyediakan pintu bagi pengendaranya. Alhasil kita harus melompat untuk masuk ataupun keluar dari mobil ini. Desain futuritik bagaikan sebuah kokpit jet membuat harga mobil Lamborghini ini sangat mahal. Adapun harganya mencapai USD$3 Juta atau apabila kita rupiahkan mencapai 39 Miliar. Harganya sangat mahal, namun sebanding dengan performa mesin V10 berkapasitas 5.2 liter yang membuatnya mampu melaju cepat dengan tenaga mencapai 441 kw dan torsi 560 Nm. Sedangkan kecepatan maksimumnya adalan 350 km/jam."
            },
            {
                    "Lamborghini Sesto Elemento",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Sesto-Elemento-Concept.jpg",
                    "Harga mobil Lamborghini termahal selanjutnya adalah mencapai USD$2.8 Juta atau setara 37 Miliar. Uang tersebut harus kita keluarkan untuk mendapatkan Lamborghini Sesto Elemento Concept. Sama seperti mobil Lamborghini lainnya, Sesto Elemento Concept memiliki desain futuristik yang sporty dan dibalut material full carbon. Didalamnya juga terpasang mesin V10 bertenaga 570 Horsepower yang membuatnya mampu berakselerasi dari 0-100 km/jam dalam waktu 2.5 detik. Torsi yang dimilikinya juga sangat besar, karena menembus 540 Nm. Sedangkan kecepatan puncaknya mencapai 350 km/jam."
            },
            {
                    "Lamborghini Aventador J",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Aventador-J.jpg",
                    "Mesin V12 berkapasitas 6.5 Liter menjadi andalan Lamborghini Aventador J untuk melaju kencang dari kecepetan 0 sampai 100km/jam dalam waktu 3.1 detik. Mesin tersebut mampu mengeluarkan tenaga sebesar 700 Horsepower, dan memiliki top speed 330 km/jam. Performa mesinnya sangat mengagumkan, namun hal ini membuat harga mobil Lamborghini Aventador J dibanderol sangat mahal. Dimana satu unitnya dibanderol USD$2.8 Juta atau mencapai 37 Miliar. Hanya urang beruntung saja yang bisa memilikinya, karena Aventador J hanya dibuat satu unit dan rincang secara ekslusif oleh Filippo Perini."
            },
            {
                    "Lamborghini Reventon Roadster",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Reventon-Roadster.jpg",
                    "Lamborghini Reventon Roadster diperkenalkan pada ajang Franfurt Motor Show 2017. Walaupun tergolong lama, namun harga mobil Lamborghini ini tetap selangit. Harganya mencapai USD$2.2 Juta atau mencapai 29 Miliar Rupiah. Lamborghini Reventon Roadster juga sempat menjadi mobil tercepat di dunia dengan kecepatan tertinggi mencapai 355 km/jam. Pencapaian ini tak lepas dari mesin V12 berkapasitas 6.5 Liter yang dipadukan dengan trasmisi manual 6 percepatan. Menariknya lagi, Lamborghini Reventon Roadster hanya dibuat 21 Unit dan hanya dipasarkan 20 Unit saja, karena satu unitnya disimpan di museum Lamborghini."
            },
            {
                    "Lamborghini Mansory Carbonado GT",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Mansory-Carbonado-GT.jpg",
                    "Mobil Lamborghini termahal di dunia ini memiliki kecepatan puncak 370 km/jam dan bisa melaju kencang dari 0-60 mph dalam waktu 2.1 detik. Kemampuan ini tak lepas dari mesin V12 berkapasitas 6.5 Liter yang selalu menjadi andalan Lamborghini dalam mempersenjatai jet darat miliknya. Untuk harganya sendiri mencapai USD$2 Juta atau setara 26 Miliar. Harga tersebut sebanding dengan performa mesin yang dimilikinya, karena mesin Mansory Carbonado GT mampu mengeluarkan tenaga mencapai 1.600 horsepower. Selain itu, mobil ini memakai panel bodi yang terbuat dari serat karbon yang membuat bobotnya semakin ringan."
            },
            {
                    "Lamborghini Mansory Carbonado Apertos",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Mansory-Carbonado-Apertos.jpg",
                    "Harga mobil Lamborghini termahal di dunia ini mencapai USD$1.6 Juta atau mencapai 21 Miliar. Eksterior mobil ini menggunakan serat karbot yang membuatnya memiliki bodi lebih ringan, sehingga kemampuan akselerasinya semakin maksimal. Kemudian untuk interiornya, Lamborghini Mansory Carbonado Apertos menggunakan material kulit yang memadukan warna hitam dan kuning. Untuk mesinnya sendiri, menggunakan mesin V12 yang mampu menghasilkan tenaga mencapai 1250 Horsepower dan torsi 900 Nm."
            },
            {
                    "Lamborghini Huracan LP610-4",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Huracan-LP610-4.jpg",
                    "Kita bisa membeli mobil ini di Indonesia. Jangan harap harganya bisa murah, karena untuk tipe Lamborghini Huracan LP610-4 dibanderol mulai 8.7 Miliar sampai 10.5 Miliar. Harganya tergantung dari tahun produksi dan ATMP yang memasukan mobil ini ke Indonesia. Untuk spesifikasinya sendiri, Lamborghini Huracan LP610-4 menggunakan mesin V10 berkapasitas 5.2 Liter yang mampu mengeluarkan torsi sebesar 413 Nm pada 6.500 rpm. Sedangkan tenaganya mencapai 610 Horsepower pada 8.250 rpm. Mesin tersebut begitu bertenaga dan membaut Lamborghini Huracan LP610-4 mampu melaju cepat dalam kecepatan maksimal 211 mph."
            },
            {
                    "Lamborghini Aventador Lp 700-4",
                    "Automobili Lamborghini S.p.A",
                    "https://www.otomotifo.com/wp-content/uploads/2017/07/Lamborghini-Aventador-Lp-700-4.jpg",
                    "Di Indonesia, harga mobil Lamborghini Aventador Lp 700-4 dibanderol mulai 8.2 Miliar sampai 16 Miliar. Bisa diaktakan Lamborghini Aventador Lp 700-4 merupakan mobil termahal di Indonesia, karena harganya melebihi mobil buatan Ferrari, Aston Martin, ataupun merek lainnya.  Untuk spesifikasinya sendiri, Lamborghini Aventador Lp 700-4 menggunakan mesin V12 berkapasitas 6.5 Liter yang sanggup mengeluarkan tenaga sebesar 700 Horsepower pada 8.250 rpm. Sedangkan torsinya menembus 690 lb-ft pada 5.500 rpm. Performanya sangat mengagumkan, sehingga mampu melaju kencang dari 0-62 mph dalam waktu 2.9 detik. Kemudian untuk top speednya mencapai 217 MPH."
            }
    };

    public static ArrayList<Mobil> getData() {
        ArrayList<Mobil> list = new ArrayList<>();
        for (String[] item : data) {
            Mobil mobil = new Mobil();
            mobil.setName(item[0]);
            mobil.setOrigin(item[1]);
            mobil.setPhoto(item[2]);
            mobil.setDescription(item[3]);

            list.add(mobil);
        }

        return list;
    }
}



