package org.example.Facade.SunSystem2;

public class CepAPI {

    private static CepAPI instance;

    private CepAPI() {
        super();
    }

    public static CepAPI getInstance() {
        if (instance == null) {
            instance = new CepAPI();
        }
        return instance;
    }

    public String getCountry(String cep) {
        return "Goiania";
    }
}
