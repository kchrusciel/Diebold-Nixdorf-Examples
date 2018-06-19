package pl.codecouple.javapart10.web

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import spock.lang.Specification

import java.lang.Void as Should

@WebMvcTest(WebController)
class WebControllerSpec extends Specification {

    @Autowired
    WebDriver webDriver

    Should "show title on main page"() {
        given:
            webDriver.get("/")
        when:
            def result = webDriver.getTitle()
        then:
            result == "Main page"
    }

    Should "show h3 header 'Java' on main page ('/')"() {
        given:
            webDriver.get("/")
        when:
            def result = webDriver.findElement(By.tagName("h3")).getText()
        then:
            result == 'Java'
    }

    Should "show div with id 'java' on main page"() {
        given:
            webDriver.get("/")
        when:
            def result = webDriver.findElement(By.id("java"))
        then:
            result != null
    }

    Should "show return list from main page"() {
        given:
            webDriver.get("/")
        when:
            def result = webDriver.findElement(By.tagName("li")).getText()
        then:
            result == 'gabrysia'
    }

    Should "return 'About' title after click on <a>"() {
        given:
            webDriver.get("/")
        when:
            webDriver.findElement(By.tagName("a")).click()
        then:
            webDriver.getTitle() == 'About'
    }

}