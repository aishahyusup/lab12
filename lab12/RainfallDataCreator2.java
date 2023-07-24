package lab12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class creates a file "rainfall_data.txt" and writes the rainfall data for two stations to the file.
 * The data consists of the station ID, station name, district name, and 6-days reading of daily rainfall.
 */
public class RainfallDataCreator2 {

    public static void main(String[] args) {
        try {
            // Create a PrintWriter object to write the data to a file.
            PrintWriter printWriter = new PrintWriter(new FileWriter("rainfall_data.txt"));

            // Write the data for two stations to the file.
            printWriter.printf("%d %s %s %.1f %.1f %.1f %.1f %.1f %.1f\n", 1, "Simpang Ampat", "Alor Gajah", 4.0, 1.0, 0.0, 6.0, 19.0, 1.0);
            printWriter.printf("%d %s %s %.1f %.1f %.1f %.1f %.1f %.1f\n", 2, "Sungai Rambai", "Alor Gajah", 5.0, 2.0, 3.0, 7.0, 20.0, 2.0);

            // Close the PrintWriter object.
            printWriter.close();

            // Display a success message.
            System.out.println("Data created successfully.");
        } catch (IOException e) {
            // Display an error message if an error occurs while writing data.
            System.out.println("Error while writing rainfall data: " + e.getMessage());
        }
    }
}
