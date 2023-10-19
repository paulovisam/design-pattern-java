package org.example.Facade.SubSystem1;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void registerClient(String name, String cep, String country) {
        System.out.println("Cliente salvo no sistema!");
    }
}
