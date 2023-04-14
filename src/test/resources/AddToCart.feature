Feature: AddToCart
  Scenario: Verifikasi pengguna berhasil memasukan produk Sauce Labs Backpack kedalam keranjang
    Given pengguna menampilkan halaman login website saucedemo
    When  pengguna memasukan username
    And   pengguna memasukan password
    And  pengguna memilih button login
    And pengguna memilih