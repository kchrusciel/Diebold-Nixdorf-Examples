package pl.codecouple.javapart11.web

import org.openqa.selenium.WebDriver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import java.lang.Void as Should

@SpringBootTest
@AutoConfigureMockMvc
class EmailsListControllerSpec extends Specification {

    @Autowired
    WebDriver webDriver

    Should "return 'Email list' title on emails page" () {

    }

    Should "show 'Email list' h1 header on emails page" () {

    }

    Should "show email with title 'java'" () {

    }

}