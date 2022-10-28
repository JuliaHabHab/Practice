package GUTest.PageTest;

import GUTest.PageObject.AppointmentWithADoctorPage;
import GUTest.PageObject.LoginPageGU;
import GUTest.PageObject.MainPageGU;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppointmentWithADoctorTestGU extends BaseTestGU{

    @Test
    public void doctorAppointment_correct_TicketReceived(){
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410","@Juliana-3103");
        AppointmentWithADoctorPage doctorAppointmentPageGU = new AppointmentWithADoctorPage(driver);
        doctorAppointmentPageGU.navigete(url+"/600204/1/form");
        doctorAppointmentPageGU.appointmentWithADoctor_yourself();
        Assert.assertTrue(doctorAppointmentPageGU.activeButton());
        }
    }

