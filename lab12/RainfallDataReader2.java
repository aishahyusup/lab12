package lab12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class reads the rainfall data from the file "rainfall_data.txt" and displays the information on the console.
 * It calculates the average rainfall for each station and displays the results.
 */
public class RainfallDataReader2 {

    public static void main(String[] args) {
        try {
            // Create a BufferedReader object to read the data from the file.
            BufferedReader bufferedReader = new BufferedReader(new FileReader("rainfall_data.txt"));

            // Create a PrintWriter object to write the output to the console.
            PrintWriter printWriter = new PrintWriter(System.out);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into individual data values.
                String[] data = line.split(" ");
                int stationId = Integer.parseInt(data[0]);
                String stationName = data[1];
                String districtName = data[2];
                float[] rainfallData = new float[6];
                for (int i = 0; i < 6; i++) {
                    rainfallData[i] = Float.parseFloat(data[3 + i]);
                }

                // Calculate the average rainfall for the station.
                float totalRainfall = 0;
                for (float rainfall : rainfallData) {
                    totalRainfall += rainfall;
                }
                float averageRainfall = totalRainfall / 6;

                // Print the station information and average rainfall to the console.
                printWriter.printf("Station ID: %d\n", stationId);
                printWriter.printf("Station Name: %s\n", stationName);
                printWriter.printf("District Name: %s\n", districtName);
                printWriter.printf("Average Rainfall: %.2f\n\n", averageRainfall);
            }

            // Close the BufferedReader and PrintWriter objects.
            bufferedReader.close();
            printWriter.close();
        } catch (IOException e) {
            // Display an error message if an error occurs while reading data.
            System.out.println("Error while reading rainfall data: " + e.getMessage());
        }
    }
}
