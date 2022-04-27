import javax.swing.*;
import java.net.InetAddress;
import java.net.URL;

public class graded_4_{

    public graded_4_() {
        String URL = JOptionPane.showInputDialog(null, "Enter Url below", "Input :- ", JOptionPane.QUESTION_MESSAGE);
        try
        {
            InetAddress inetAddress = InetAddress.getByName(new URL("http://" + URL).getHost());
            JOptionPane.showMessageDialog(null, "Host Name is: " + inetAddress.getHostName() + "\nIP Address is: " + inetAddress.getHostAddress(), "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Unknown Host or IP Address", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new graded_4_();
    }
}
