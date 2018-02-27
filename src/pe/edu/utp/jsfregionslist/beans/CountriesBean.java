package pe.edu.utp.jsfregionslist.beans;

import pe.edu.utp.jsfregionslist.models.Country;
import pe.edu.utp.jsfregionslist.models.HrService;
import pe.edu.utp.jsfregionslist.models.Region;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class CountriesBean implements Serializable {
    private HrService service;
    private Country country;


    public CountriesBean() {
        service = new HrService();
    }

    public List<Country> getCountries() {
        return service.findAllCountries();
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return this.getCountry().getName();
    }

    public void setName(String name) {
        this.getCountry().setName(name);
    }

    public String newCountry() {
        this.setCountry(new Country());
        return "success";
    }

    /*public String createCountry() {
        service.createCountry(this.getName());
        return "success";
    }*/

    public String editCountry(Country country) {
        this.setCountry(country);
        return "success";
    }

    /*public String updateCountry() {
        service.updateCountry(this.getCountry());
        return "success";
    }

    public String deleteCountry(Country country) {
        service.deleteCountry(country.getId());
        return "success";
    }*/
}
