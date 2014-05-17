package xmls;

import com.revimedia.testing.beans.auto.LeadDataType;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;

/**
 * Created by Funker on 16.05.14.
 */
public class Xmls {

    public static final String autofinance_zipcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?><LeadData Target=\"Lead.CDSInsert\" RequestTime=\"2014-05-16 00:02:50\" TimeZone=\"+0300\" UserAgent=\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.131 Safari/537.36\" SessionLength=\"124\"><AffiliateData Id=\"1\" OfferId=\"\" SubId=\"\" Sub2Id=\"\" Source=\"\" SurveyPath=\"auto-finance-zipcode\" TransactionId=\"\" LeadId=\"\" TrustedFormCertUrl=\"\" VerifyAddress=\"true\" /><ContactData><FirstName>Rwerw</FirstName><LastName>Erwerwe</LastName><Address>dfgdf 33</Address><City>NEW YORK</City><ZipCode>10101</ZipCode><EmailAddress>sdfsdf@wew.ru</EmailAddress><PhoneNumber>6565656565</PhoneNumber><DayPhoneNumber>6565656565</DayPhoneNumber><IPAddress>192.168.0.1</IPAddress><State>NY</State><YearsAtResidence>4</YearsAtResidence><MonthsAtResidence>7</MonthsAtResidence><ResidenceType>My own house</ResidenceType></ContactData><QuoteRequest QuoteType=\"AutoFinance\"><Persons><Person><FirstName>Rwerw</FirstName><LastName>Erwerwe</LastName><BirthDate>1975-02-03</BirthDate><Gender>Male</Gender><JobTitle>werwerwe</JobTitle><EmployerName>Ewerwerw </EmployerName><GrossMonthlyIncome>6565656</GrossMonthlyIncome><SocialSecurityNumber>656565656</SocialSecurityNumber><YearsAtEmployer>5</YearsAtEmployer><AgreeToPrivacyPolicy>Yes</AgreeToPrivacyPolicy><CosignAvailable>No</CosignAvailable><CreditRating>Some Problems</CreditRating><CreditCheckAuthorization>Yes</CreditCheckAuthorization><MonthlyRentMortgagePayment>2500-2999</MonthlyRentMortgagePayment><MonthsAtEmployer>5</MonthsAtEmployer><OpenBankruptcy>No</OpenBankruptcy></Person></Persons></QuoteRequest></LeadData>";
    public static final String autofinance_multiframe = "<?xml version=\"1.0\" encoding=\"utf-8\"?><LeadData Target=\"Lead.CDSInsert\" RequestTime=\"2014-05-16 00:06:41\" TimeZone=\"+0300\" UserAgent=\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.131 Safari/537.36\" SessionLength=\"362\"><AffiliateData Id=\"1\" OfferId=\"\" SubId=\"\" Sub2Id=\"\" Source=\"\" SurveyPath=\"auto-finance-frame\" TransactionId=\"\" LeadId=\"\" TrustedFormCertUrl=\"\" VerifyAddress=\"true\" /><ContactData><FirstName>Dfgdfg</FirstName><LastName>Dfgdf</LastName><Address>gfgh 656</Address><City>NEW YORK</City><ZipCode>10101</ZipCode><EmailAddress>dfghgfhgf@ere.ru</EmailAddress><PhoneNumber>5656556656</PhoneNumber><DayPhoneNumber>5656556656</DayPhoneNumber><IPAddress>192.168.0.1</IPAddress><State>NY</State><YearsAtResidence>5</YearsAtResidence><MonthsAtResidence>6</MonthsAtResidence><ResidenceType>My own house</ResidenceType></ContactData><QuoteRequest QuoteType=\"AutoFinance\"><Persons><Person><FirstName>Dfgdfg</FirstName><LastName>Dfgdf</LastName><BirthDate>1971-02-06</BirthDate><Gender>Male</Gender><JobTitle>dfgdfgd</JobTitle><EmployerName>Dfgfgdfgdfg</EmployerName><GrossMonthlyIncome>5465656</GrossMonthlyIncome><SocialSecurityNumber>265655656</SocialSecurityNumber><YearsAtEmployer>8</YearsAtEmployer><AgreeToPrivacyPolicy>Yes</AgreeToPrivacyPolicy><CosignAvailable>No</CosignAvailable><CreditRating>Some Problems</CreditRating><CreditCheckAuthorization>Yes</CreditCheckAuthorization><MonthlyRentMortgagePayment>3000-3499</MonthlyRentMortgagePayment><MonthsAtEmployer>7</MonthsAtEmployer><OpenBankruptcy>No</OpenBankruptcy></Person></Persons></QuoteRequest></LeadData>";


    public static final String automotive_compare = "<?xml version=\"1.0\" encoding=\"utf-8\"?><LeadData Target=\"Lead.CDSInsert\" RequestTime=\"2014-05-16 00:10:30\" TimeZone=\"+0300\" UserAgent=\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.131 Safari/537.36\" SessionLength=\"51\"><AffiliateData Id=\"1\" OfferId=\"\" SubId=\"\" Sub2Id=\"\" Source=\"\" SurveyPath=\"COPY_OF_auto-frame2\" TransactionId=\"\" LeadId=\"D6772527-17AA-003B-49C5-B778F29B8CCE\" TrustedFormCertUrl=\"\" VerifyAddress=\"true\" /><ContactData><FirstName>Erwr</FirstName><LastName>Wrewrew</LastName><PhoneNumber>5565656656</PhoneNumber><Address>werw 44</Address><EmailAddress>rtrtrt@fdf.ru</EmailAddress><ZipCode>10102</ZipCode><City>NEW YORK</City><State>NY</State><ContactTime>Morning</ContactTime><ContactMethod>Phone</ContactMethod><IPAddress>192.168.0.1</IPAddress></ContactData><QuoteRequest QuoteType=\"Automotive-New\"><Drivers><Driver><BirthDate>1975-01-01</BirthDate><Gender>Male</Gender></Driver></Drivers><Vehicles><Vehicle><VIN>WAUMFBFM0D0000000</VIN><DecidedPurchase>Ready to buy</DecidedPurchase><InterestedIn>New cars</InterestedIn><Financing>Credit union</Financing><CarBuyTimeFrame>1 week</CarBuyTimeFrame></Vehicle></Vehicles></QuoteRequest></LeadData>";

    public static final String life_frame_up = "<?xml version=\"1.0\" encoding=\"utf-8\"?><LeadData Target=\"Lead.CDSInsert\" RequestTime=\"2014-05-16 00:36:45\" TimeZone=\"+0300\" UserAgent=\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.131 Safari/537.36\" SessionLength=\"106\"><AffiliateData Id=\"1\" OfferId=\"\" SubId=\"\" Sub2Id=\"\" Source=\"\" SurveyPath=\"life-frame\" TransactionId=\"\" LeadId=\"D6772527-17AA-003B-49C5-B778F29B8CCE\" TrustedFormCertUrl=\"\" VerifyAddress=\"true\" /><ContactData><FirstName>Dfdf</FirstName><LastName>Dfdfdf</LastName><PhoneNumber>5656556565</PhoneNumber><Address>dfdfdfd 22</Address><EmailAddress>sdds@land.ru</EmailAddress><ZipCode>10101</ZipCode><City>NEW YORK</City><IPAddress>192.168.0.1</IPAddress><State>NY</State><YearsAtResidence></YearsAtResidence><MonthsAtResidence>4</MonthsAtResidence><ResidenceType>My own house</ResidenceType><BirthDate>1942-04-18</BirthDate></ContactData><QuoteRequest QuoteType=\"Life\"><Persons><Person><Id>1</Id><BirthDate>1942-04-18</BirthDate><Gender>Male</Gender><Children>None</Children><LifeStyle><HazardousActivities>No</HazardousActivities><LicenseEverSuspendedRevoked>No</LicenseEverSuspendedRevoked><DUI>Yes</DUI></LifeStyle><CreditRating>Good</CreditRating><Occupation>Student Living w/ Parents</Occupation><DeniedInsurance>No</DeniedInsurance><Education>High school diploma</Education><MaritalStatus>Separated</MaritalStatus><Medication>Yes</Medication><RelationshipToApplicant>Self</RelationshipToApplicant><Height_FT>4</Height_FT><Height_Inch>1</Height_Inch><Weight>110</Weight><PreExistingConditions>Yes</PreExistingConditions><Conditions><AIDSHIV>No</AIDSHIV><Arthritis>Yes</Arthritis><Asthma>Yes</Asthma><Cancer>Yes</Cancer><Depression>No</Depression><Diabetes>Yes</Diabetes><HeartDisease>No</HeartDisease><Hepatitis>Yes</Hepatitis><HighBloodPressure>No</HighBloodPressure><HighCholesterol>No</HighCholesterol><MentalIllness>No</MentalIllness><Stroke>Yes</Stroke><Ulcers>No</Ulcers><VascularDisease>No</VascularDisease></Conditions><MedicalHistory><FamilyHistoryCancer>Yes</FamilyHistoryCancer><FamilyHistoryHeartDisease>No</FamilyHistoryHeartDisease><Hospitalized>No</Hospitalized><Smoker>Yes</Smoker></MedicalHistory></Person></Persons><Insurance><CurrentPolicy><InsuranceCompany>Aviva</InsuranceCompany></CurrentPolicy><RequestedPolicy><CoverageTerm>25 years</CoverageTerm><CoverageAmount>500,000</CoverageAmount><CoverageType>Universal</CoverageType></RequestedPolicy></Insurance></QuoteRequest></LeadData>";
    public static final String life_life_frame = "<?xml version=\"1.0\" encoding=\"utf-8\"?><LeadData Target=\"Lead.CDSInsert\" RequestTime=\"2014-05-16 00:40:05\" TimeZone=\"+0300\" UserAgent=\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.131 Safari/537.36\" SessionLength=\"75\"><AffiliateData Id=\"1\" OfferId=\"\" SubId=\"\" Sub2Id=\"\" Source=\"\" SurveyPath=\"life-frame\" TransactionId=\"\" LeadId=\"D6772527-17AA-003B-49C5-B778F29B8CCE\" TrustedFormCertUrl=\"\" VerifyAddress=\"true\" /><ContactData><FirstName>Sfsddf</FirstName><LastName>Dfdfd</LastName><PhoneNumber>5656565656</PhoneNumber><Address>sdsd 33</Address><EmailAddress>jkjkjkk@hdjhd.ru</EmailAddress><ZipCode>10101</ZipCode><City>NEW YORK</City><IPAddress>192.168.0.1</IPAddress><State>NY</State><YearsAtResidence></YearsAtResidence><MonthsAtResidence>4</MonthsAtResidence><ResidenceType>My own house</ResidenceType><BirthDate>1996-05-05</BirthDate></ContactData><QuoteRequest QuoteType=\"Life\"><Persons><Person><Id>1</Id><BirthDate>1996-05-05</BirthDate><Gender>Female</Gender><Children>None</Children><LifeStyle><HazardousActivities>No</HazardousActivities><LicenseEverSuspendedRevoked>No</LicenseEverSuspendedRevoked><DUI>Yes</DUI></LifeStyle><CreditRating>Major Problems</CreditRating><Occupation>Student</Occupation><DeniedInsurance>No</DeniedInsurance><Education>High school diploma</Education><MaritalStatus>Married</MaritalStatus><Medication>No</Medication><RelationshipToApplicant>Self</RelationshipToApplicant><Height_FT>6</Height_FT><Height_Inch>6</Height_Inch><Weight>120</Weight><PreExistingConditions>None</PreExistingConditions><Conditions><AIDSHIV>No</AIDSHIV><Arthritis>No</Arthritis><Asthma>No</Asthma><Cancer>No</Cancer><Depression>No</Depression><Diabetes>No</Diabetes><HeartDisease>No</HeartDisease><Hepatitis>No</Hepatitis><HighBloodPressure>No</HighBloodPressure><HighCholesterol>No</HighCholesterol><MentalIllness>No</MentalIllness><Stroke>No</Stroke><Ulcers>No</Ulcers><VascularDisease>No</VascularDisease></Conditions><MedicalHistory><FamilyHistoryCancer>No</FamilyHistoryCancer><FamilyHistoryHeartDisease>No</FamilyHistoryHeartDisease><Hospitalized>No</Hospitalized><Smoker>No</Smoker></MedicalHistory></Person></Persons><Insurance><CurrentPolicy><InsuranceCompany>Lincoln National</InsuranceCompany></CurrentPolicy><RequestedPolicy><CoverageTerm>10 years</CoverageTerm><CoverageAmount>100,000</CoverageAmount><CoverageType>Term</CoverageType></RequestedPolicy></Insurance></QuoteRequest></LeadData>";


    public static final String auto_mfs_3_cars = "<?xml version=\"1.0\" encoding=\"utf-8\"?><LeadData Target=\"Lead.CDSInsert\" RequestTime=\"2014-05-16 20:54:00\" TimeZone=\"+0300\" UserAgent=\"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0\" SessionLength=\"93351\"><AffiliateData Id=\"1\" OfferId=\"\" SubId=\"\" Sub2Id=\"\" Source=\"\" SurveyPath=\"AutoFrameSteps\" TransactionId=\"\" LeadId=\"6B4F83DF-B42D-B84F-68C2-8F33CA0E3502\" VerifyAddress=\"true\"/><QuoteRequest QuoteType=\"Auto\"><Drivers><Driver><FirstName>Dff</FirstName><LastName>Fghfhgf</LastName><Gender>Male</Gender><BirthDate>1962-02-05</BirthDate><LicenseState>NY</LicenseState><AgeLicensed>16</AgeLicensed><YearsAtEmployer>5</YearsAtEmployer><RequiresSR22Filing>No</RequiresSR22Filing><LicenseEverSuspendedRevoked>No</LicenseEverSuspendedRevoked><CreditRating>Good</CreditRating><Occupation>Employeed</Occupation><LicenseStatus>Current</LicenseStatus><Education>Doctorate Degree</Education><MaritalStatus>Married</MaritalStatus><RelationshipToApplicant>self</RelationshipToApplicant></Driver></Drivers><Vehicles><Vehicle><AnnualMiles>12500</AnnualMiles><CollisionDeductible>500</CollisionDeductible><ComphrensiveDeductible>500</ComphrensiveDeductible><Garage>No Cover</Garage><OneWayDistance>10-19</OneWayDistance><PrimaryUse>Commute To/From Work</PrimaryUse><Ownership>Yes</Ownership><WeeklyCommuteDays>5</WeeklyCommuteDays><Year>2012</Year><Make>BUICK</Make><Model>LaCrosse</Model></Vehicle><Vehicle><Year>2011</Year><Make>CADILLAC</Make><Model>DTS Luxury Collection</Model><AnnualMiles>12500</AnnualMiles><CollisionDeductible>500</CollisionDeductible><ComphrensiveDeductible>500</ComphrensiveDeductible><Garage>No Cover</Garage><OneWayDistance>10-19</OneWayDistance><PrimaryUse>Commute To/From Work</PrimaryUse><Ownership>Yes</Ownership><WeeklyCommuteDays>5</WeeklyCommuteDays></Vehicle><Vehicle><Year>1993</Year><Make>BUICK</Make><Model>Park Avenue Ultra Supercharged</Model><AnnualMiles>12500</AnnualMiles><CollisionDeductible>500</CollisionDeductible><ComphrensiveDeductible>500</ComphrensiveDeductible><Garage>No Cover</Garage><OneWayDistance>10-19</OneWayDistance><PrimaryUse>Commute To/From Work</PrimaryUse><Ownership>Yes</Ownership><WeeklyCommuteDays>5</WeeklyCommuteDays></Vehicle></Vehicles><Insurance><CurrentPolicy><ExpirationDate>2014-06-16</ExpirationDate><InsuredSince>2011-05-16</InsuredSince><InsuranceCompany>AFLAC</InsuranceCompany></CurrentPolicy><RequestedPolicy><PropertyDamage/><CoverageType>Standard Protection</CoverageType><BodilyInjury/></RequestedPolicy></Insurance></QuoteRequest><ContactData><FirstName>Dff</FirstName><LastName>Fghfhgf</LastName><PhoneNumber>5656566565</PhoneNumber><Address>fghfghf 454</Address><EmailAddress>cjhj@dfhjh.ru</EmailAddress><ZipCode>10101</ZipCode><City>NEW YORK</City><IPAddress>192.168.0.1</IPAddress><State>NY</State><YearsAtResidence>1</YearsAtResidence><MonthsAtResidence>0</MonthsAtResidence><ResidenceType>My own house</ResidenceType></ContactData></LeadData>";

    @Test
    public void testName() throws Exception {

        LeadDataType mfs_3_cars = from(auto_mfs_3_cars);
        LeadDataType p = from(autofinance_zipcode);
        //com.revimedia.testing.leaddata.beans.health.LeadDataType health = from(health_mf);
        //LeadDataType z = from(homesecurity_z);

    }

    public static LeadDataType from(String xml) throws JAXBException, IOException {
        return unmarshal(LeadDataType.class, xml);
    }


    public static <T> T unmarshal(Class<T> clazz, URL xml) throws JAXBException, IOException {
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller u = jc.createUnmarshaller();
        // U can use IOUtils.toInputStream(xml) if add to deps commons-io and parse String
        // Also, it can be Node, String, etc
        return u.unmarshal(new StreamSource(xml.openStream()), clazz).getValue();
    }

    public static <T> T unmarshal(Class<T> clazz, String xml) throws JAXBException, IOException {
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller u = jc.createUnmarshaller();
        StringBuffer xmlStr = new StringBuffer(xml);
        StreamSource streamSource = new StreamSource(new StringReader(xmlStr.toString()));
        return u.unmarshal(streamSource, clazz).getValue();
    }

}