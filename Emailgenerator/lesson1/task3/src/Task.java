import java.util.Locale;

public class Task {
String[] organisations = {"CPHBusiness", "SpaceX", "Brentford"};

    //Method for generating the second part of an email address
    String getOrganisation(int org){

        if(org >= 0 && org <= organisations.length-1) {
            return organisations[org].toLowerCase();
        }
        return null;
    }



}