/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihanopsional4

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string dengan panjang karakter 1-100.
 *  - Fungsi harus mengembalikan karakter yang ditengah dari string yang diinput.
 *      - Jika panjang string bernilai genap, maka yang dikembalikan adalah 2 karakter.
 *      - Jika panjang string bernilai ganjil, maka yang dikembalikan adalah 1 karakter.
 *
 *  Contoh:
 *  Input = getMiddleCharacters("dicoding") -> Output = od | Penjelasan: panjang string "dicoding" adalah 8 (genap) dan dua karakter paling tengah adalah "od"
 *  Input = getMiddleCharacters("dicodingindonesia")  -> Output = i | Penjelasan: panjang string "dicodingindonesia" adalah 17 (ganjil) dan satu karakter paling tengah adalah "i"
 *  Input = getMiddleCharacters("A")  -> Output = A | Penjelasan: panjang string "A" adalah 1 (ganjil) dan satu karakter paling tengah adalah "A"
 *
 *  Hint:  Kotlin Fundamental & Collections
 *
 */

fun getMiddleCharacters(string: String): String {

    // panjang string adalah...
    val stringLength = string.length

    // mencari index karakter yang ditengah
    val middleCharacterIndex =stringLength / 2

    val output: String

    if (stringLength == 1) {
        output = string
    } else if (stringLength % 2 != 0) {
        output = string[middleCharacterIndex].toString()
    } else {
        output = buildString{
            append(string[middleCharacterIndex - 1])
            append(string[middleCharacterIndex])
        }
    }

    return output
}

fun main() {
    println(getMiddleCharacters("dicodingindonesia") == "i")
    println(getMiddleCharacters("dicoding") == "od")
    println(getMiddleCharacters("A") == "A")
}
