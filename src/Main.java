public class Main {

    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, " Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранженый", 2016, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Car hyundai2 = new Car("Hyundai2", "", -2.0, null, -15, null);
        System.out.println(hyundai2);

//        Car lada = new Car();
//        lada.brand = "Lada";
//        lada.model = "Granta";
//        lada.engineVolume = 1.7;
//        lada.color = "жёлтый";
//        lada.productionYear = 2015;
//        lada.productionCountry = "Россия";
//        System.out.println(lada);
//
//        Car audi = new Car();
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "чёрный";
//        audi.productionYear = 2020;
//        audi.productionCountry = "Германия";
//        System.out.println(audi);
//
//        Car bmw = new Car();
//        bmw.brand = "BMW";
//        bmw.model = "Z 8";
//        bmw.engineVolume = 3.0;
//        bmw.color = "чёрный";
//        bmw.productionYear = 2021;
//        bmw.productionCountry = "Германия";
//        System.out.println(bmw);
//
//        Car kia = new Car();
//        kia.brand = "Kia";
//        kia.model = "Sportage 4-го поколения";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.productionYear = 2018;
//        kia.productionCountry = "Южная Корея";
//        System.out.println(kia);
//
//        Car hyundai = new Car();
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый";
//        hyundai.productionYear = 2016;
//        hyundai.productionCountry = "Южная Корея";
//        System.out.println(hyundai);
    }
}
