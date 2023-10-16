package mfc.manager.data.execution;

import mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements;
import mfc.properties.entitiesProperties.*;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by user on 29.05.2018.
 */
public class DataProviders {

    static String FirstName= "AutoTest";//"Lena_transferee";
    static By language1;
    static By[] languages;
    static String date;

    public DataProviders(By [] languages, String date) {
        this.languages = languages;
        this.date=date;

    }



    @DataProvider
    public static Iterator<Object[]> changeLanguage() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{UserMenu_WebElements.English_language});
        data.add(new Object[]{UserMenu_WebElements.Franch_language});
        data.add(new Object[]{UserMenu_WebElements.German_language});
        data.add(new Object[]{UserMenu_WebElements.Greek_language});
        data.add(new Object[]{UserMenu_WebElements.Portugal_language});
        data.add(new Object[]{UserMenu_WebElements.Russian_language});
        data.add(new Object[]{UserMenu_WebElements.Spanish_language});
        data.add(new Object[]{UserMenu_WebElements.Italian_Language});
        data.add(new Object[]{UserMenu_WebElements.Dutch_Language});
        data.add(new Object[]{UserMenu_WebElements.Polish_Language});
        data.add(new Object[]{UserMenu_WebElements.Romanian_Language});
        //data.add(new Object[]{UserMenu_WebElements.English_UK_language});

        return data.iterator();
    }
    @DataProvider(name = "NewAddress")
    public static Iterator<Object[]> newAddress(){
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{UserMenu_WebElements.English_language, new Country(UserMenu_WebElements.English_language).Albania, new Country(UserMenu_WebElements.English_language).Bulgaria,"English1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Franch_language, new Country(UserMenu_WebElements.Franch_language).Albania,
                new Country(UserMenu_WebElements.Franch_language).Bulgaria,"Franch1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.German_language, new Country(UserMenu_WebElements.German_language).Albania,
                new Country(UserMenu_WebElements.German_language).Bulgaria,"German1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Greek_language, new Country(UserMenu_WebElements.Greek_language).Albania,
                new Country(UserMenu_WebElements.Greek_language).Bulgaria,"Greek1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Portugal_language, new Country(UserMenu_WebElements.Portugal_language).Albania,
                new Country(UserMenu_WebElements.Portugal_language).Bulgaria,"Portugal1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Spanish_language, new Country(UserMenu_WebElements.Spanish_language).Albania,
                new Country(UserMenu_WebElements.Spanish_language).Bulgaria,"Spanish1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Russian_language, new Country(UserMenu_WebElements.Russian_language).Albania,
                new Country(UserMenu_WebElements.Russian_language).Bulgaria,"Russian1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Italian_Language, new Country(UserMenu_WebElements.Italian_Language).Albania,
                new Country(UserMenu_WebElements.Italian_Language).Bulgaria,"Italian1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Dutch_Language, new Country(UserMenu_WebElements.Dutch_Language).Albania,
                new Country(UserMenu_WebElements.Dutch_Language).Bulgaria,"Dutch1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Polish_Language, new Country(UserMenu_WebElements.Polish_Language).Albania,
                new Country(UserMenu_WebElements.Polish_Language).Bulgaria,"Polish1", "Street1", "12345"});
        data.add(new Object[]{UserMenu_WebElements.Romanian_Language, new Country(UserMenu_WebElements.Romanian_Language).Albania,
                new Country(UserMenu_WebElements.Romanian_Language).Bulgaria,"Romanian1", "Street1", "12345"});

        return data.iterator();
    }

    @DataProvider(name = "EditAddressDetails")
    public static Iterator<Object[]> editAddressDetails(){

        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{UserMenu_WebElements.English_language, new Country(UserMenu_WebElements.English_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.English_language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(UserMenu_WebElements.English_language).Mechanical,new ParkingType(UserMenu_WebElements.English_language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Franch_language, new Country(UserMenu_WebElements.Franch_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Franch_language).Apartment,"residenceTypeDescription",
                "11","elevatorDetails",new CraneType(UserMenu_WebElements.Franch_language).Mechanical,new ParkingType(UserMenu_WebElements.Franch_language).BlueZone,
                "121","124","501","101", "92.97", "102.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.German_language, new Country(UserMenu_WebElements.German_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.German_language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(UserMenu_WebElements.German_language).Mechanical,new ParkingType(UserMenu_WebElements.German_language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Greek_language, new Country(UserMenu_WebElements.Greek_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Greek_language).Apartment,"residenceTypeDescription",
                "13","elevatorDetails",new CraneType(UserMenu_WebElements.Greek_language).Mechanical,new ParkingType(UserMenu_WebElements.Greek_language).BlueZone,
                "123","126","503","103", "94.97", "104.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Portugal_language, new Country(UserMenu_WebElements.Portugal_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Portugal_language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(UserMenu_WebElements.Portugal_language).Mechanical,new ParkingType(UserMenu_WebElements.Portugal_language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Spanish_language, new Country(UserMenu_WebElements.Spanish_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Spanish_language).Apartment,"residenceTypeDescription",
                "13","elevatorDetails",new CraneType(UserMenu_WebElements.Spanish_language).Mechanical,new ParkingType(UserMenu_WebElements.Spanish_language).BlueZone,
                "123","126","503","103", "94.97", "104.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Russian_language, new Country(UserMenu_WebElements.Russian_language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Russian_language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(UserMenu_WebElements.Russian_language).Mechanical,new ParkingType(UserMenu_WebElements.Russian_language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Italian_Language, new Country(UserMenu_WebElements.Italian_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Italian_Language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(UserMenu_WebElements.Italian_Language).Mechanical,new ParkingType(UserMenu_WebElements.Italian_Language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Dutch_Language, new Country(UserMenu_WebElements.Dutch_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Dutch_Language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(UserMenu_WebElements.Dutch_Language).Mechanical,new ParkingType(UserMenu_WebElements.Dutch_Language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Polish_Language, new Country(UserMenu_WebElements.Polish_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Polish_Language).Apartment,"residenceTypeDescription",
                "12","elevatorDetails",new CraneType(UserMenu_WebElements.Polish_Language).Mechanical,new ParkingType(UserMenu_WebElements.Polish_Language).BlueZone,
                "122","125","502","102", "93.97", "103.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        data.add(new Object[]{UserMenu_WebElements.Romanian_Language, new Country(UserMenu_WebElements.Romanian_Language).Israel,"City11", "Street11","Company", "abc45",
                new ResidenceType(UserMenu_WebElements.Romanian_Language).Apartment,"residenceTypeDescription",
                "10","elevatorDetails",new CraneType(UserMenu_WebElements.Romanian_Language).Mechanical,new ParkingType(UserMenu_WebElements.Romanian_Language).BlueZone,
                "120","123","500","100", "91.97", "101.45", "carryDetails",
                "stairsCarryDetails", "additionalStopDetails"});

        return data.iterator();
    }

    @DataProvider(name = "createFileForNewClient")
    public static Iterator<Object[]> createFileForNewClient2() {
        //String date = "23-07";
        List<Object[]> data = new ArrayList<Object[]>();

        data.add(new Object[]{UserMenu_WebElements.English_language, new BookingType(UserMenu_WebElements.English_language).Private  ,new Source(UserMenu_WebElements.English_language).Call, new JobType(UserMenu_WebElements.English_language).Export,
                new Mode(UserMenu_WebElements.English_language).Air_AIR, new ServiceType(UserMenu_WebElements.English_language).DTD,
                new ServiceLevel(UserMenu_WebElements.English_language).Full_Origin_Service,FirstName+"En"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.English_language).Albania, new Country(UserMenu_WebElements.English_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Franch_language, new BookingType(UserMenu_WebElements.Franch_language).Private,new Source(UserMenu_WebElements.Franch_language).Call,
                new JobType(UserMenu_WebElements.Franch_language).Export,
                new Mode(UserMenu_WebElements.Franch_language).Air_AIR, new ServiceType(UserMenu_WebElements.Franch_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Franch_language).Full_Origin_Service,FirstName+"Fr"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Franch_language).Albania, new Country(UserMenu_WebElements.Franch_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.German_language, new BookingType(UserMenu_WebElements.German_language).Private,new Source(UserMenu_WebElements.German_language).Call,
                new JobType(UserMenu_WebElements.German_language).Export,
                new Mode(UserMenu_WebElements.German_language).Air_AIR, new ServiceType(UserMenu_WebElements.German_language).DTD,
                new ServiceLevel(UserMenu_WebElements.German_language).Full_Origin_Service,FirstName+"Gd"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.German_language).Albania, new Country(UserMenu_WebElements.German_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Greek_language, new BookingType(UserMenu_WebElements.Greek_language).Private,new Source(UserMenu_WebElements.Greek_language).Call,
                new JobType(UserMenu_WebElements.Greek_language).Export,
                new Mode(UserMenu_WebElements.Greek_language).Sea_Groupage_20ft_Container, new ServiceType(UserMenu_WebElements.Greek_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Greek_language).Full_Origin_Service,FirstName+"Gr"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Greek_language).Albania, new Country(UserMenu_WebElements.Greek_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Portugal_language, new BookingType(UserMenu_WebElements.Portugal_language).Private,new Source(UserMenu_WebElements.Portugal_language).Call,
                new JobType(UserMenu_WebElements.Portugal_language).Export,
                new Mode(UserMenu_WebElements.Portugal_language).Air_AIR, new ServiceType(UserMenu_WebElements.Portugal_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Portugal_language).Full_Origin_Service,FirstName+"Por"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Portugal_language).Albania, new Country(UserMenu_WebElements.Portugal_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Spanish_language, new BookingType(UserMenu_WebElements.Spanish_language).Private,new Source(UserMenu_WebElements.Spanish_language).Call,
                new JobType(UserMenu_WebElements.Spanish_language).Export,
                new Mode(UserMenu_WebElements.Spanish_language).Air_AIR, new ServiceType(UserMenu_WebElements.Spanish_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Spanish_language).Full_Origin_Service,FirstName+"Sp"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Spanish_language).Albania, new Country(UserMenu_WebElements.Spanish_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Russian_language, new BookingType(UserMenu_WebElements.Russian_language).Private,new Source(UserMenu_WebElements.Russian_language).Call,
                new JobType(UserMenu_WebElements.Russian_language).Export,
                new Mode(UserMenu_WebElements.Russian_language).Air_AIR, new ServiceType(UserMenu_WebElements.Russian_language).DTD,
                 new ServiceLevel(UserMenu_WebElements.Russian_language).Full_Origin_Service,FirstName+"Ru"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Russian_language).Albania, new Country(UserMenu_WebElements.Russian_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Italian_Language, new BookingType(UserMenu_WebElements.Italian_Language).Private,new Source(UserMenu_WebElements.Italian_Language).Google,
                new JobType(UserMenu_WebElements.Italian_Language).Export,
                new Mode(UserMenu_WebElements.Italian_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Italian_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Italian_Language).Full_Origin_Service,FirstName+"It"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Italian_Language).Albania, new Country(UserMenu_WebElements.Italian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Dutch_Language, new BookingType(UserMenu_WebElements.Dutch_Language).Private,new Source(UserMenu_WebElements.Dutch_Language).Google,
                new JobType(UserMenu_WebElements.Dutch_Language).Export,
                new Mode(UserMenu_WebElements.Dutch_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Dutch_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Dutch_Language).Full_Origin_Service,FirstName+"Dut"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Dutch_Language).Albania, new Country(UserMenu_WebElements.Dutch_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Polish_Language, new BookingType(UserMenu_WebElements.Polish_Language).Private,new Source(UserMenu_WebElements.Polish_Language).Google,
                new JobType(UserMenu_WebElements.Polish_Language).Export,
                new Mode(UserMenu_WebElements.Polish_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Polish_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Polish_Language).Full_Origin_Service,FirstName+"Pol"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Polish_Language).Albania, new Country(UserMenu_WebElements.Polish_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{UserMenu_WebElements.Romanian_Language, new BookingType(UserMenu_WebElements.Romanian_Language).Private,new Source(UserMenu_WebElements.Romanian_Language).Google,
                new JobType(UserMenu_WebElements.Romanian_Language).Export,
                new Mode(UserMenu_WebElements.Romanian_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Romanian_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Romanian_Language).Full_Origin_Service,FirstName+"Rom"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Romanian_Language).Albania, new Country(UserMenu_WebElements.Romanian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        return data.iterator();
    }

    @DataProvider(name = "createFileForNewClient_new")
    public static Iterator<Object[]> createFileForNewClient_new() {
        //Object[] languges={UserMenu_WebElements.English_language,UserMenu_WebElements.German_language};
        Object[] languges=languages;
        //String date = "18-07_1";
        List<Object[]> data = new ArrayList<Object[]>();
        List<Object[]> dataResult = new ArrayList<Object[]>();
        data.add(new Object[]{UserMenu_WebElements.English_language, new BookingType(UserMenu_WebElements.English_language).Private  ,new Source(UserMenu_WebElements.English_language).Call, new JobType(UserMenu_WebElements.English_language).Export,
                new Mode(UserMenu_WebElements.English_language).Air_AIR, new ServiceType(UserMenu_WebElements.English_language).DTD,
                new ServiceLevel(UserMenu_WebElements.English_language).Full_Origin_Service,FirstName+"En"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.English_language).Albania, new Country(UserMenu_WebElements.English_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Franch_language, new BookingType(UserMenu_WebElements.Franch_language).Private,new Source(UserMenu_WebElements.Franch_language).Call,
                new JobType(UserMenu_WebElements.Franch_language).Export,
                new Mode(UserMenu_WebElements.Franch_language).Air_AIR, new ServiceType(UserMenu_WebElements.Franch_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Franch_language).Full_Origin_Service,FirstName+"Fr"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Franch_language).Albania, new Country(UserMenu_WebElements.Franch_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.German_language, new BookingType(UserMenu_WebElements.German_language).Private,new Source(UserMenu_WebElements.German_language).Call,
                new JobType(UserMenu_WebElements.German_language).Export,
                new Mode(UserMenu_WebElements.German_language).Air_AIR, new ServiceType(UserMenu_WebElements.German_language).DTD,
                new ServiceLevel(UserMenu_WebElements.German_language).Full_Origin_Service,FirstName+"Gd"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.German_language).Albania, new Country(UserMenu_WebElements.German_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Greek_language, new BookingType(UserMenu_WebElements.Greek_language).Private,new Source(UserMenu_WebElements.Greek_language).Call,
                new JobType(UserMenu_WebElements.Greek_language).Export,
                new Mode(UserMenu_WebElements.Greek_language).Sea_Groupage_20ft_Container, new ServiceType(UserMenu_WebElements.Greek_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Greek_language).Full_Origin_Service,FirstName+"Gr"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Greek_language).Albania, new Country(UserMenu_WebElements.Greek_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Portugal_language, new BookingType(UserMenu_WebElements.Portugal_language).Private,new Source(UserMenu_WebElements.Portugal_language).Call,
                new JobType(UserMenu_WebElements.Portugal_language).Export,
                new Mode(UserMenu_WebElements.Portugal_language).Air_AIR, new ServiceType(UserMenu_WebElements.Portugal_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Portugal_language).Full_Origin_Service,FirstName+"Por"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Portugal_language).Albania, new Country(UserMenu_WebElements.Portugal_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Spanish_language, new BookingType(UserMenu_WebElements.Spanish_language).Private,new Source(UserMenu_WebElements.Spanish_language).Call,
                new JobType(UserMenu_WebElements.Spanish_language).Export,
                new Mode(UserMenu_WebElements.Spanish_language).Air_AIR, new ServiceType(UserMenu_WebElements.Spanish_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Spanish_language).Full_Origin_Service,FirstName+"Sp"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Spanish_language).Albania, new Country(UserMenu_WebElements.Spanish_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Russian_language, new BookingType(UserMenu_WebElements.Russian_language).Private,new Source(UserMenu_WebElements.Russian_language).Call,
                new JobType(UserMenu_WebElements.Russian_language).Export,
                new Mode(UserMenu_WebElements.Russian_language).Air_AIR, new ServiceType(UserMenu_WebElements.Russian_language).DTD,
                new ServiceLevel(UserMenu_WebElements.Russian_language).Full_Origin_Service,FirstName+"Ru"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Russian_language).Albania, new Country(UserMenu_WebElements.Russian_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Italian_Language, new BookingType(UserMenu_WebElements.Italian_Language).Private,new Source(UserMenu_WebElements.Italian_Language).Google,
                new JobType(UserMenu_WebElements.Italian_Language).Export,
                new Mode(UserMenu_WebElements.Italian_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Italian_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Italian_Language).Full_Origin_Service,FirstName+"It"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Italian_Language).Albania, new Country(UserMenu_WebElements.Italian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Dutch_Language, new BookingType(UserMenu_WebElements.Dutch_Language).Private,new Source(UserMenu_WebElements.Dutch_Language).Google,
                new JobType(UserMenu_WebElements.Dutch_Language).Export,
                new Mode(UserMenu_WebElements.Dutch_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Dutch_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Dutch_Language).Full_Origin_Service,FirstName+"Dut"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Dutch_Language).Albania, new Country(UserMenu_WebElements.Dutch_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{UserMenu_WebElements.Polish_Language, new BookingType(UserMenu_WebElements.Polish_Language).Private,new Source(UserMenu_WebElements.Polish_Language).Google,
                new JobType(UserMenu_WebElements.Polish_Language).Export,
                new Mode(UserMenu_WebElements.Polish_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Polish_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Polish_Language).Full_Origin_Service,FirstName+"Pol"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Polish_Language).Albania, new Country(UserMenu_WebElements.Polish_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{UserMenu_WebElements.Romanian_Language, new BookingType(UserMenu_WebElements.Romanian_Language).Private,new Source(UserMenu_WebElements.Romanian_Language).Google,
                new JobType(UserMenu_WebElements.Romanian_Language).Export,
                new Mode(UserMenu_WebElements.Romanian_Language).Air_AIR, new ServiceType(UserMenu_WebElements.Romanian_Language).DTD,
                new ServiceLevel(UserMenu_WebElements.Romanian_Language).Full_Origin_Service,FirstName+"Rom"+date, "check1", "franch@mail.com","9797876",
                new Country(UserMenu_WebElements.Romanian_Language).Albania, new Country(UserMenu_WebElements.Romanian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});




        for (Object[] list:data) {
            for (Object lang : languges){
                if (list[0].equals(lang)) {
                    System.out.println(list[0].toString());
                    dataResult.add(list);
                }
            }
        }

        return dataResult.iterator();
    }
   /* @DataProvider(name = "createFileForNewClient_gblinerstest")
    public static Iterator<Object[]> createFileForNewClient_gblinerstest() {
        String date = "0811";
        List<Object[]> data = new ArrayList<Object[]>();


        data.add(new Object[]{English_language, new BookingType(English_language).Private  ,new Source(English_language).Google, "Combined[Domestic-and-International]",
                new Mode(English_language).Air_AIR, new ServiceType(English_language).DTD,
                new ServiceLevel(English_language).Full_Origin_Service,FirstName+"En"+date, "check", "franch@mail.com","9797876",
                new Country(English_language).Albania, new Country(English_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Franch_language, new BookingType(Franch_language).Private,new Source(Franch_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Franch_language).Air_AIR, new ServiceType(Franch_language).DTD,
                new ServiceLevel(Franch_language).Full_Origin_Service,FirstName+"Fr"+date, "check", "franch@mail.com","9797876",
                new Country(Franch_language).Albania, new Country(Franch_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{German_language, new BookingType(German_language).Private,new Source(German_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(German_language).Air_AIR, new ServiceType(German_language).DTD,
                new ServiceLevel(German_language).Full_Origin_Service,FirstName+"Gd"+date, "check", "franch@mail.com","9797876",
                new Country(German_language).Albania, new Country(German_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Greek_language, new BookingType(Greek_language).Private,new Source(Greek_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Greek_language).Sea_Groupage_20ft_Container, new ServiceType(Greek_language).DTD,
                new ServiceLevel(Greek_language).Full_Origin_Service,FirstName+"Gr"+date, "check", "franch@mail.com","9797876",
                new Country(Greek_language).Albania, new Country(Greek_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Portugal_language, new BookingType(Portugal_language).Private,new Source(Portugal_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Portugal_language).Air_AIR, new ServiceType(Portugal_language).DTD,
                new ServiceLevel(Portugal_language).Full_Origin_Service,FirstName+"Por"+date, "check", "franch@mail.com","9797876",
                new Country(Portugal_language).Albania, new Country(Portugal_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Spanish_language, new BookingType(Spanish_language).Private,new Source(Spanish_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Spanish_language).Air_AIR, new ServiceType(Spanish_language).DTD,
                new ServiceLevel(Spanish_language).Full_Origin_Service,FirstName+"Sp"+date, "check", "franch@mail.com","9797876",
                new Country(Spanish_language).Albania, new Country(Spanish_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Russian_language, new BookingType(Russian_language).Private,new Source(Russian_language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Russian_language).Air_AIR, new ServiceType(Russian_language).DTD,
                new ServiceLevel(Russian_language).Full_Origin_Service,FirstName+"Ru"+date, "check", "franch@mail.com","9797876",
                new Country(Russian_language).Albania, new Country(Russian_language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        data.add(new Object[]{Italian_Language, new BookingType(Italian_Language).Private,new Source(Italian_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Italian_Language).Air_AIR, new ServiceType(Italian_Language).DTD,
                new ServiceLevel(Italian_Language).Full_Origin_Service,FirstName+"It"+date, "check", "franch@mail.com","9797876",
                new Country(Italian_Language).Albania, new Country(Italian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{Dutch_Language, new BookingType(Dutch_Language).Private,new Source(Dutch_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Dutch_Language).Air_AIR, new ServiceType(Dutch_Language).DTD,
                new ServiceLevel(Dutch_Language).Full_Origin_Service,FirstName+"Dut"+date, "check", "franch@mail.com","9797876",
                new Country(Dutch_Language).Albania, new Country(Dutch_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{Polish_Language, new BookingType(Polish_Language).Private,new Source(Polish_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Polish_Language).Air_AIR, new ServiceType(Polish_Language).DTD,
                new ServiceLevel(Polish_Language).Full_Origin_Service,FirstName+"Pol"+date, "check", "franch@mail.com","9797876",
                new Country(Polish_Language).Albania, new Country(Polish_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});

        data.add(new Object[]{Romanian_Language, new BookingType(Romanian_Language).Private,new Source(Romanian_Language).Google,
                "Combined[Domestic-and-International]",
                new Mode(Romanian_Language).Air_AIR, new ServiceType(Romanian_Language).DTD,
                new ServiceLevel(Romanian_Language).Full_Origin_Service,FirstName+"Rom"+date, "check", "franch@mail.com","9797876",
                new Country(Romanian_Language).Albania, new Country(Romanian_Language).Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        return data.iterator();
    }
*/

    @DataProvider(name = "createMaterialsConfig")
    public static Iterator<Object[]> createMaterialsConfig() {
        LocalTime marker = LocalTime.now();
        int marker1 = 320 ;
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{UserMenu_WebElements.English_language, FirstName,
                new Materials("Mtl_PT-"+date,10,12,13,14,100),
                new Materials("Mtl_PT1-"+date,20,22,23,24,200),
                new Materials("MatCrate-"+date,30,32,33,34,300),
                new Materials("MatCrate1-"+date,40,42,43,44,400),
                new Materials("AssMaterials-"+date,5,6,7,8,9, 2)});

        return  data.iterator();
    }

    public static class Materials {
        String materialType;
        float coast;
        float width;
        float length; float height; float volume;
        int quantity;

        public Materials(String materialType,float coast, float width,float length,float height,float volume) {
            this.materialType=materialType;
            this.coast=coast;
            this.width=width;
            this.length=length;
            this.height=height;
            this.volume=volume;
        }
        public Materials(String materialType,float coast, float width,float length,float height,float volume, int quantity) {
            this.materialType=materialType;
            this.coast=coast;
            this.width=width;
            this.length=length;
            this.height=height;
            this.volume=volume;
            this.quantity=quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getMaterialType() {
            return materialType;
        }

        public float getCoast() {
            return coast;
        }

        public float getWidth() {
            return width;
        }

        public float getLength() {
            return length;
        }

        public float getHeight() {
            return height;
        }

        public float getVolume() {
            return volume;
        }
    }
    public static class Item {
        String itemType;
        String itemCategory;
        float volumeItem;
        float widthItem;
        String room;
        String application;
        String useFor;
        int quantity;

        public Item(String itemType, String itemCategory, float volumeItem,
                    float widthItem, String room, String application, String useFor) {
            this.itemType = itemType+date;
            this.itemCategory = itemCategory;
            this.volumeItem = volumeItem;
            this.widthItem = widthItem;
            this.room = room;
            this.application = application;
            this.useFor = useFor;
            this.quantity = quantity;
        }
        /*public Item(String itemType, String itemCategory, float volumeItem,
                    float widthItem, String application, String useFor) {
            this.itemType = itemType+date;
            this.itemCategory = itemCategory;
            this.volumeItem = volumeItem;
            this.widthItem = widthItem;
           // this.room = room;
            this.application = application;
            this.useFor = useFor;
            this.quantity = quantity;
        }*/
        public String getItemType() {
            return itemType;
        }

        public String getItemCategory() {
            return itemCategory;
        }

        public float getVolumeItem() {
            return volumeItem;
        }

        public float getWidthItem() {
            return widthItem;
        }

        public String getRoom() {
            return room;
        }

        public String getApplication() {
            return application;
        }

        public String getUseFor() {
            return useFor;
        }

        public int getQuantity() {
            return quantity;
        }
    }

   /* @DataProvider(name = "createFileForNewClient1")
    public static Iterator<Object[]> createFileForNewClient1() {

        List<Object[]> data = new ArrayList<Object[]>();

        data.add(new Object[][]{{language, Source.Google, JobType.Export, Mode.Sea_LCL, ServiceType.DTD,
                ServiceLevel.Full_Origin_Service,"Test_FR", "Full", "franch@mail.com","9797876"},
                {UserMenu_WebElements.Franch_language}});


        return data.iterator();
    }

    @DataProvider(name = "createFileForNewClient2")
    public static Iterator<Object[]> createFileForNewClient() {
        String date="0109";

        List<Object[]> data = new ArrayList<Object[]>();

        data.add(new Object[]{language, Source.Google, JobType.Export, Mode.Sea_LCL, ServiceType.DTD,
                ServiceLevel.Full_Origin_Service,"test"+date, "check", "franch@mail.com","9797876",
                Country.Albania, Country.Bulgaria,"City1", "City2", "Street1", "Street2","54321","12345"});
        *//*data.add(new Object[]{language,Source.Call, JobType.Fine_Arts, Mode.Air_AIR, ServiceType.DTP,
              ServiceLevel.Full_Destination_Service,"Magda", "Oliver", "rosa@mail.ru","+9729797876"});*//*


        return data.iterator();
    }*/
}
