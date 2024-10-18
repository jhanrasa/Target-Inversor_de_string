import javax.swing.JOptionPane;

public class InverteString {
    public static void main(String[] args) {
        String Original = JOptionPane.showInputDialog("Digit a String : ");
        String Invertido = inverteString(Original);
        JOptionPane.showMessageDialog(null, Original + "\n" + Invertido);
    }

    public static String inverteString(String Original) {
        StringBuilder invertido = new StringBuilder();
        for (int i = Original.length() - 1; i >= 0; i--) {
            invertido.append(Original.charAt(i));
        }
        return invertido.toString();
    }
}