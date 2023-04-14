package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.BaseClass;
import org.example.pages.LoginPages;

public class LoginStepsDef {

    @Before
    public void setup(){
        BaseClass.setDriver();
    }
    @After
//    public void tearDown(){
//        BaseClass.closeDriver();
//    }

    @Given("pengguna menampilkan halaman login website saucedemo")
    public void penggunaMenampilkanHalamanLoginWebsiteSaucedemo() {
        BaseClass.navigateToHome();
    }

    @When("pengguna memasukan username")
    public void penggunaMemasukanUsername() {
        LoginPages.inputUsername();
    }

    @And("pengguna memasukan password")
    public void penggunaMemasukanPassword() {
        LoginPages.inputPassword();
    }

    @And("pengguna memilih button login")
    public void penggunaMemilihButtonLogin() {
        LoginPages.btnLogin();
    }

    @Then("pengguna berhasil login website saucedemo")
    public void penggunaBerhasilLoginWebsiteSaucedemo() {
        BaseClass.threadSleep();
    }
}
