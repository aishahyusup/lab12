package lab12; // Package declaration should come first

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * The RainfallDataCreator class creates a file and writes daily rainfall data for a specific station.
 * The data includes station ID, district ID, station name, district name, date, and rainfall readings for 6 days.
 * The data is written using DataOutputStream.
 */
public class RainfallDataCreator {

    public static void main(String[] args) {
        try {
        	// Create a DataOutputStream object to write the data to a file.
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("rainfall_data.txt"));

            // Write the data to the file.
            dos.writeInt(1); // Station ID
            dos.writeInt(2421003); // District ID
            dos.writeUTF("Simpang Ampat"); // Station Name
            dos.writeUTF("Alor Gajah"); // District Name
            dos.writeUTF("9/6/2023 10:00"); // Date and Time
            dos.writeFloat(4.0f); // Day 1 Rainfall
            dos.writeFloat(1.0f); // Day 2 Rainfall
            dos.writeFloat(0.0f); // Day 3 Rainfall
            dos.writeFloat(6.0f); // Day 4 Rainfall
            dos.writeFloat(19.0f); // Day 5 Rainfall
            dos.writeFloat(1.0f); // Day 6 Rainfall
            dos.writeFloat(0.0f); // Extra data for future use
            dos.writeFloat(0.0f); // Extra data for future use

            // Close the DataOutputStream object.
            dos.close();

         // Display a message indicating that the data has been created.
            System.out.println("Data created successfully.");
        } catch (Exception e) {
            // Display an error message if an error occurs.
            System.out.println("Error while writing rainfall data: " + e.getMessage());
        }
    }
}


