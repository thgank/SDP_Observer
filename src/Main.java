
public class Main {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        MonitoringStation station1 = new MonitoringStation("Fella");
        MonitoringStation station2 = new MonitoringStation("Bellah");

        temperatureSensor.registerObserver(station1);
        temperatureSensor.registerObserver(station2);

        temperatureSensor.setTemperature(19.2f);
        temperatureSensor.setTemperature(9.6f);

        temperatureSensor.removeObserver(station1);

        temperatureSensor.setTemperature(24.1f);
    }
}