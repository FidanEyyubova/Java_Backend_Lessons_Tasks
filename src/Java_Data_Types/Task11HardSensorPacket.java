package Java_Data_Types;

public class Task11HardSensorPacket {
    public static void main(String[] args) {
        int degree = 25;
        int humidity = 60;
        int batery = 10;
        int packet = (degree << 11) | (humidity << 4) | batery;
        System.out.println(packet);

        // 2. Açma (Həmin rəqəmdən məlumatları geri alırıq)
        int newDegree = (packet >> 11) & 63;
        int newHumidity = (packet >> 4) & 127;
        int newBatery = packet & 15;

        System.out.printf("Degree: %d, Humidity: %d, Batery: %d",
                newDegree,newHumidity,newBatery
                );
    }
}
