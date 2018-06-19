package pl.codecouple.javapart11.web

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import java.lang.Void as Should

@SpringBootTest
@AutoConfigureMockMvc
class IndexControllerSpec extends Specification {

    @Autowired
    WebDriver webDriver

    Should "return title 'Emails page' on index page ('/')"() {

    }

    Should "show h3 header 'Java part 11' on index page ('/')"() {

    }

    Should "show div with id 'java' on index page ('/')"() {

    }


    Should "return 'emails' page after click on 'Emails'"() {

    }

    Should "return 'add-email' page after click on 'Add email'"() {

    }

}