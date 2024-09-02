import javax.swing.*;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui() {
        // seteamos nuestra aplicación y le añadimos un título
        super("Weather App");

        // configuración para terminar el programa una vez que se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // configuramos el tamaño de nuestra gui en pixeles
        setSize(450, 650);

        // configuración para que nuestra gui esté en el centro de la pantalla
        setLocationRelativeTo(null);

    // hacemos que nuestro adm de diseño sea nulo para posicionar manualmente nuestros componentes
        setLayout(null);

        // configuración que previene que se edite el tamaño de nuestra gui
        setResizable(false);
    }
}