package lab12; // Package declaration should come first

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * The RainfallDataConsumer class reads daily rainfall data for a specific station from a file.
 * The data includes station ID, district ID, station name, district name, date, and rainfall readings for 6 days.
 * The data is read using DataInputStream.
 */

public class RainfallDataConsumer {

    public static void main(String[] args) {
        try {
            // Create a DataInputStream object to read the data from the file.
            DataInputStream dis = new DataInputStream(new FileInputStream("rainfall_data.txt"));

            // Read and display the data from the file.
            int stationId = dis.readInt();
            int districtId = dis.readInt();
            String stationName = dis.readUTF();
            String districtName = dis.readUTF();
            String dateTime = dis.readUTF();
            float day1Rainfall = dis.readFloat();
            float day2Rainfall = dis.readFloat();
            float day3Rainfall = dis.readFloat();
            float day4Rainfall = dis.readFloat();
            float day5Rainfall = dis.readFloat();
            float day6Rainfall = dis.readFloat();
            float averageRainfall = (day1Rainfall + day2Rainfall + day3Rainfall + day4Rainfall + day5Rainfall + day6Rainfall) / 6;

            System.out.println("Station ID: " + stationId);
            System.out.println("District ID: " + districtId);
            System.out.println("Station Name: " + stationName);
            System.out.println("District Name: " + districtName);
            System.out.println("Date Time: " + dateTime);
            System.out.println("Day 1 Rainfall: " + day1Rainfall);
            System.out.println("Day 2 Rainfall: " + day2Rainfall);
            System.out.println("Day 3 Rainfall: " + day3Rainfall);
            System.out.println("Day 4 Rainfall: " + day4Rainfall);
            System.out.println("Day 5 Rainfall: " + day5Rainfall);
            System.out.println("Day 6 Rainfall: " + day6Rainfall);
            System.out.println("Average Rainfall: " + averageRainfall);

            // Close the DataInputStream object.
            dis.close();
        } catch (Exception e) {
            // Display an error message if an error occurs.
            System.out.println("Error: " + e.getMessage());
        }
    }
}
