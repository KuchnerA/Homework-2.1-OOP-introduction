package transport;

public class Car extends Transport {

    private double engineVolume;
    private String gear;
    private final String typeOfBody;
    private String regNumber;
    private final int capacity;
    private boolean summerTyres;
    private Key key;

    public static class Key {
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun ? "удаленный запуск двигателя, " : "без удаленного запуска двигателя, ") +
                    (withoutAccess ? "бесключевой доступ" : "бесключевой доступ отсутствует");
        }
    }

    public Car(String brand,
               String model,
               Double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed,
               String gear,
               String typeOfBody,
               String regNumber,
               int capacity,
               boolean summerTyres,
               Key key) {
        super(brand, model, productionYear, productionCountry, color,maxSpeed);
        setEngineVolume(engineVolume);
        setGear(gear);
        this.typeOfBody = (typeOfBody == null || typeOfBody.isEmpty() ? "седан" : typeOfBody);
        setRegNumber(regNumber);
        this.capacity = (capacity <= 0 ? 5 : capacity);
        this.summerTyres = summerTyres;
        setKey(key);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null || gear.isEmpty()) {
            gear = "МКПП";
        }
        this.gear = gear;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "x000xx000";
        }
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTyres = false;
        }
        if (month >= 4 && month <= 10) {
            summerTyres = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", объем двигателя=" + engineVolume +
                ", коробка передач= " + gear +
                ", тип кузова= " + typeOfBody +
                ", регистрационный номер= " + regNumber +
                ", колличество мест= " + capacity +
                (summerTyres ? ", летняя" : ", зимняя") +
                " резина, " + key + "}";
    }
}
