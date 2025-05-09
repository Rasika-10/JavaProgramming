public class MultipleFunctionalInterface {
    public static void main(String[] args) {

      
        Startable vehicleStart = new Startable() {
            public void start() {
                System.out.println("Vehicle has started.");
            }
        };
        vehicleStart.start();

       
        Stoppable vehicleStop = new Stoppable() {
            public void stop() {
                System.out.println("Vehicle has stopped.");
            }
        };
        vehicleStop.stop();
    }
}


@FunctionalInterface
interface Startable {
    void start();
}


@FunctionalInterface
interface Stoppable {
    void stop();
}
