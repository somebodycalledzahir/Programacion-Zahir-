public class Main {
    public static boolean empiezaConMinuscula(String s) {
        char primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }

    public static String pluralizar(int conteo, String s) {
        return (conteo == 1) ? s : String.format("%d %ss", conteo, s);
    }

    public static boolean esVocal(char letra) {
        char letraMin = Character.toLowerCase(letra);
        return "aeiou".contains(Character.toString(letraMin));
    }

    public static String titleCase(String texto) {
        String primera = texto.substring(0, 1); String resto = texto.substring(1);
        return String.format("%S%s", primera, resto.toLowerCase());
    }

    public static boolean terminaEnS(String texto) {
        char ultimo = texto.charAt(texto.length() - 1);
        return ultimo == 's' || ultimo == 'S';
    }

    public static boolean esPalindrome(String s) {
        if (s.length() != 2) return false;
        return Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(1));
    }

    public static String extension(String ruta) {
        int i = ruta.lastIndexOf('.');
        return (i == -1 || i == ruta.length() - 1) ? "" : ruta.substring(i + 1);
    }

    public static String domain(String url) {
        String sinProtocolo = url.substring("https://".length());
        int fin = sinProtocolo.indexOf('/'); return (fin == -1) ? sinProtocolo : sinProtocolo.substring(0, fin);
    }

    public static String domingoDePascua(int año) {
        int a = año % 19;
        int b = año / 100;
        int c = año % 100;
        int d = b / 4;
        int e = b % 4;
        int g = ((8 * b) + 13) / 25;
        int h = ((19 * a) + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + (2 * e) + (2 * i) - h - k) % 7;
        int m = (a + (11 * h) + (19 * l)) / 433;
        int n = (h + l - (7 * m) + 90) / 25;
        int p = (h + l - (7 * m) + (33 * n) + 19) % 32;
        return String.format("%04d/%02d/%02d", año, n, p);
    }

    public static String hexString(int r, int g, int b) {
        return String.format("%02X%02X%02X", r, g, b);
    }

    public static boolean correoElectronicoValido(String correo) {
        int at = correo.indexOf('@');
        int lastAt = correo.lastIndexOf('@');
        int dot = correo.indexOf('.', at);
        return at > 0 && at == lastAt && dot != -1 && dot < correo.length() - 1 && dot - at >= 2 && correo.lastIndexOf('.') == dot;
    }

    public static String elipsificar(String titulo, int maxLen) {
        int espacio = (titulo.length() <= maxLen) ? -1 : titulo.indexOf(' ', maxLen);
        return (espacio == -1) ? titulo : titulo.substring(0, espacio) + "…";
    }


}
