package com.revimedia.tests.cds.auto.mfs;


import com.revimedia.testing.cds.auto.staticdata.StaticDataAutoMFS;
import com.revimedia.testing.cds.prepop.PrePop;
import com.revimedia.testing.cds.prepop.PrePopParameters;
import com.revimedia.testing.configuration.dto.Contact;
import com.revimedia.tests.configuration.dataproviders.AutoDataProvider;
import net.lightbody.bmp.proxy.ProxyServer;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Funker on 02.05.14.
 */
public class DummyTest {
    public WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        // driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

/*        @Test
        public void basicTest() throws Exception {

//            BrowserMobProxy bmp = new BrowserMobProxy("http://localhost", 9090);
//            int port = bmp.getPort();
//            bmp.setPort(port);

            int port = 9090;
            ProxyServer server = new ProxyServer(port);
            //server.setPort(9090);
            server.start();

            // get the Selenium proxy object
            String actProxy = "localhost:" + port;
            Proxy seleniumProxy = new Proxy();
            seleniumProxy.setHttpProxy(actProxy).setFtpProxy(actProxy).setSslProxy(actProxy);

            // configure it as a desired capability
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);

            // start the browser up
            WebDriver driver = new FirefoxDriver(capabilities);

            // create a new HAR with the label "agame.com"
            bmp.newHar("agame.com", false, false, false);

            bmp.whitelistRequests("http:/*//*.*.spilcdn.com/.*,http:/*//*.*.agame.com/.*,http:/*//*.*.spilgames.com.*", 200);
            driver.get("http://www.agame.com/game/1001-arabian-nights.html");
            bmp.waitForNetworkTrafficToStop(20000, 45000);

            // get the HAR data
            System.out.println(bmp.getHar().getLog().getEntries().size());
            bmp.getHar().writeTo(new File("har.json"));

            driver.quit();
        }*/


    @Test
    public void testName() throws Exception {
        ProxyServer server = new ProxyServer(4675);
        server.start();


// Get the Selenium proxy object
        Proxy proxy = server.seleniumProxy();


        proxy.setHttpProxy("<grid_hub_hostname>:4675");

        proxy.setSslProxy("<grid_hub_hostname");


        DesiredCapabilities capabilities = DesiredCapabilities.firefox();

        capabilities.setCapability(CapabilityType.PROXY, proxy);


        WebDriver driver = new RemoteWebDriver(new URL("http://<grid_hub_hostname>:8080/wd/hub"), capabilities);

    }


    @Test
    public void testListToURL() throws Exception {

        List<String> autoMfs = new ArrayList<String>();
        autoMfs.add("firstname");
        autoMfs.add("lastname");

        String s1 = "560-405-8013";
        String s2 = "(560) 405-8013";

        String s11 = s1.replaceAll("[^\\d]", "");
        String s22 = s2.replaceAll("[^\\d]", "");


    }

    @Test(dataProvider = "contactAndStaticData", dataProviderClass = AutoDataProvider.class)
    public void testExitTrue(Contact contact, StaticDataAutoMFS staticData) throws Exception {


        //PrePop prePop = new PrePop(contact);
        //Class aClass = classLoader.loadClass("reflection.PrePop");
        Class aClass = PrePop.class;

        Field[] methods = aClass.getFields();

        Class<?> firstname = aClass.getDeclaredField("firstname").getType();

        driver.get("http://development.stagingrevi.com/auto/mfs");

        String url2 = PrePopParameters.getAutoMFS(driver.getCurrentUrl(), contact, staticData);

        driver.get(url2);

    }


}