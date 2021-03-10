abstract class AbsMahasiswa(val Name: String, val Nim: Int, val Jurusan: String)

class DataMahasiswa(Name: String, Nim: Int, Jurusan: String): AbsMahasiswa(Name, Nim, Jurusan)
