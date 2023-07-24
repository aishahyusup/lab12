package lab12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class RainfallDataReader {

    public static void main(String[] args) {
        try {
            // Create a DataInputStream object to read the data from the file.
            DataInputStream dis = new DataInputStream(new FileInputStream("rainfall_data.txt"));

            // Read and display the data for the first station.
            int stationId1 = dis.readInt();
            String stationName1 = dis.readUTF();
            String districtName1 = dis.readUTF();
            float day1Rainfall1 = dis.readFloat();
            float day2Rainfall1 = dis.readFloat();
            float day3Rainfall1 = dis.readFloat();
            float day4Rainfall1 = dis.readFloat();
            float day5Rainfall1 = dis.readFloat();
            float day6Rainfall1 = dis.readFloat();
            float averageRainfall1 = (day1Rainfall1 + day2Rainfall1 + day3Rainfall1 + day4Rainfall1 + day5Rainfall1 + day6Rainfall1) / 6;

            // Read and display the data for the second station.
            int stationId2 = dis.readInt();
            String stationName2 = dis.readUTF();
            String districtName2 = dis.readUTF();
            float day1Rainfall2 = dis.readFloat();
            float day2Rainfall2 = dis.readFloat();
            float day3Rainfall2 = dis.readFloat();
            float day4Rainfall2 = dis.readFloat();
            float day5Rainfall2 = dis.readFloat();
            float day6Rainfall2 = dis.readFloat();
            float averageRainfall2 = (day1Rainfall2 + day2Rainfall2 + day3Rainfall2 + day4Rainfall2 + day5Rainfall2 + day6Rainfall2) / 6;

            // Close the DataInputStream object.
            dis.close();

            // Display the data for the first station.
            System.out.println("Station ID: " + stationId1);
            System.out.println("Station Name: " + stationName1);
            System.out.println("District Name: " + districtName1);
            System.out.println("Day 1 Rainfall: " + day1Rainfall1);
            System.out.println("Day 2 Rainfall: " + day2Rainfall1);
            System.out.println("Day 3 Rainfall: " + day3Rainfall1);
            System.out.println("Day 4 Rainfall: " + day4Rainfall1);
            System.out.println("Day 5 Rainfall: " + day5Rainfall1);
            System.out.println("Day 6 Rainfall: " + day6Rainfall1);
            System.out.println("Average Rainfall: " + averageRainfall1);

            // Display the data for the second station.
            System.out.println("\nStation ID: " + stationId2);
            System.out.println("Station Name: " + stationName2);
            System.out.println("District Name: " + districtName2);
            System.out.println("Day 1 Rainfall: " + day1Rainfall2);
            System.out.println("Day 2 Rainfall: " + day2Rainfall2);
            System.out.println("Day 3 Rainfall: " + day3Rainfall2);
            System.out.println("Day 4 Rainfall: " + day4Rainfall2);
            System.out.println("Day 5 Rainfall: " + day5Rainfall2);
            System.out.println("Day 6 Rainfall: " + day6Rainfall2);
            System.out.println("Average Rainfall: " + averageRainfall2);

        } catch (IOException e) {
            System.out.println("Error while reading rainfall data: " + e.getMessage());
        }
    }
}
