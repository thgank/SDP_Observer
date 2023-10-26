public class MonitoringStation implements Observer{
    private String name;

    public MonitoringStation(String name){
        this.name = name;
    }

    @Override
    public void update(float temperature){
        System.out.println("station " + name + " have an update. temp outside is " + temperature + " celcius");
    }
}
