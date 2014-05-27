package com.revimedia.tests.configuration.dataproviders;

import com.revimedia.testing.cds.auto.staticdata.StaticDataAutoMFS;
import com.revimedia.testing.configuration.dto.Contact;
import com.revimedia.testing.configuration.dto.Contacts;
import com.revimedia.testing.configuration.dto.OfferParameters;
import com.revimedia.testing.configuration.helpers.DataHelper;
import com.revimedia.testing.configuration.utils.PrePopIPHelper;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;

import java.util.Map;

/**
 * Created by stde on 4/28/2014.
 */
public class AutoDataProvider extends DataProviderHelper {

    public static String xmlContactData = "./src/test/resources/data/leads_data_1000.xml";


    @DataProvider
    public static Object[][] contactAndStaticDataAutoMFS() {
        Object contact = unMarshalToObject(xmlContactData, Contacts.class);
        Object[][] result = {
                {contact, new StaticDataAutoMFS()},
        };
        return result;
    }

    @DataProvider
    public static Object[][] contactAndStaticDataAutoMFSForeBureauChecking() {
        Contact contact = unMarshalToContact(xmlContactData, Contacts.class);
        contact.setAddress(DataHelper.generateInvalidAddress());
        contact.setEmailAddress(RandomStringUtils.random(10, true, true) + "_" + contact.getEmailAddress());
        Object[][] result = {
                {contact, new StaticDataAutoMFS()},
        };
        return result;
    }


    @DataProvider
    public static Object[][] contactAndStaticAndOfferParametersDataAutoMFS() {
        Object contact = unMarshalToObject(xmlContactData, Contacts.class);
        Object[][] result = {
                {contact, new StaticDataAutoMFS(), new OfferParameters()},
        };
        return result;
    }


    @DataProvider
    public static Object[][] prePopIPParametersData() throws Exception {
        Map<String, String> response = PrePopIPHelper.getResponse();
        Object[][] result = {
                {"?prepopip=true", response},
        };
        return result;
    }


    @DataProvider
    public static Object[][] contactData() {
        return new Object[][]{
                {unMarshalToObject(xmlContactData, Contacts.class)},
        };
    }

    @DataProvider
    public static Object[][] contactAndStaticDataAutoMFSBoundaryTesting() {
        // firstName, lastName, gender,  birthDate,  phoneNumber,  address, emailAddress, zipCode, city, state
        Contact contact1 = new Contact("Bond", "Dammy", "Male", "Jan 23, 1980", "6467171752", "Avenue I and East 14th Street", "bas@test.com", "11231", "BROOKLYN", "NY");
        Contact contact2 = new Contact("James", "Dammy", "Female", "Mar 30, 1990", "2144993212", "2424 East 38th Street", "nitroquotes@gmail.com", "75201", "DALLAS", "TX");

        Object[][] result = {
                //{contact1, new StaticDataAutoMFS()},
                {contact2, new StaticDataAutoMFS()},
        };
        return result;
    }


}
