class Encapsulation {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setBattery(20);                          
        System.out.println(m.getBattery());     
        m.chargePhone(50);               
    }
}

class Mobile {
    private int battery; 

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

   
    public void chargePhone(int amt) {
        battery += amt;
        if (battery > 100) battery = 100;
        System.out.println("Phone Charged!! Battery level: " + battery + "%");
    }
}
