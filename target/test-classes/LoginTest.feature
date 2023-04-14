Feature: Login
  Scenario: Verifikasi pengguna login menggunakan akun yang sudah terdaftar
    Given pengguna menampilkan halaman login website saucedemo
    When  pengguna memasukan username
    And   pengguna memasukan password
    And  pengguna memilih button login
    Then pengguna berhasil login website saucedemo