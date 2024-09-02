import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // da inicio a nuestra app, cuando run() sea llamado la app iniciará
                new WeatherAppGui().setVisible(true);
            }
        });
    }
}
