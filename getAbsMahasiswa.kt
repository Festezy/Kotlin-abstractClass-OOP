import .AbsMahasiswa

fun main() {
    val mahasiswa1 = DataMahasiswa("Andre", 654321, "TIK - Mobile Aplication")

    println("""
                Data Mahasiswa
        Nama Mahasiswa : ${mahasiswa1.Name}
        NIM Mahasiswa  : ${mahasiswa1.Nim}
        Jurusan        : ${mahasiswa1.Jurusan} 
    """.trimIndent().toUpperCase())
}
