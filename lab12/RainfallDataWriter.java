package lab12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RainfallDataWriter {

    public static void main(String[] args) {
        try {
            // Create a DataOutputStream object to write the data to a file.
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("rainfall_data.txt"));

            // Write the data for the first station.
            dos.writeInt(1); // Station ID
            dos.writeUTF("Simpang Ampat"); // Station Name
            dos.writeUTF("Alor Gajah"); // District Name
            dos.writeFloat(4.0f); // Day 1 Rainfall
            dos.writeFloat(1.0f); // Day 2 Rainfall
            dos.writeFloat(0.0f); // Day 3 Rainfall
            dos.writeFloat(6.0f); // Day 4 Rainfall
            dos.writeFloat(19.0f); // Day 5 Rainfall
            dos.writeFloat(1.0f); // Day 6 Rainfall

            // Write the data for the second station.
            dos.writeInt(2); // Station ID
            dos.writeUTF("Sungai Rambai"); // Station Name
            dos.writeUTF("Alor Gajah"); // District Name
            dos.writeFloat(5.0f); // Day 1 Rainfall
            dos.writeFloat(2.0f); // Day 2 Rainfall
            dos.writeFloat(3.0f); // Day 3 Rainfall
            dos.writeFloat(7.0f); // Day 4 Rainfall
            dos.writeFloat(20.0f); // Day 5 Rainfall
            dos.writeFloat(2.0f); // Day 6 Rainfall

            // Close the DataOutputStream object.
            dos.close();

            System.out.println("Data created successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing rainfall data: " + e.getMessage());
        }
    }
}
