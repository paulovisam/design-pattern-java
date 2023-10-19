package org.example.Facade;

import org.example.Facade.SubSystem1.CrmService;
import org.example.Facade.SunSystem2.CepAPI;

public class Facade {

    public void changeClient(String name, String cep) {
        String country = CepAPI.getInstance().getCountry(cep);
        CrmService.registerClient(name,cep,country);
    }
}
