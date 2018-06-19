package pl.codecouple.javapart11.web

import org.openqa.selenium.WebDriver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import java.lang.Void as Should

@SpringBootTest
@AutoConfigureMockMvc
class AddEmailControllerSpec extends Specification {

    @Autowired
    WebDriver webDriver

    Should "return 'Add email' title on add-email page"() {

    }

    Should "show 'Add email' h1 header on add-email page"() {

    }

    Should "reset value from form when click reset button"() {

    }

    Should "add new email to DB with title 'java' "() {


    }

}