package beans;

public class Sinistro {
    public static String digitoSinistro;
    public static String sinistroEscolhido = "";
    
    public Sinistro() {
    }
    
    public void escolhaSinistro() {
        switch (digitoSinistro) {
            case "1":
                sinistroEscolhido = "Batida";
                break;
            case "2":
                sinistroEscolhido = "Pane Elétrica";
                break;
            case "3":
                sinistroEscolhido = "Desastres Naturais";
                break;
        }
    }

    public static String getDigitoSinistro() {
        return digitoSinistro;
    }

    public void setDigitoSinistro(String digitoSinistro) {
        Sinistro.digitoSinistro = digitoSinistro;
    }

    public static String getSinistroEscolhido() {
        return sinistroEscolhido;
    }

    public void setSinistroEscolhido(String sinistroEscolhido) {
        Sinistro.sinistroEscolhido = sinistroEscolhido;
    }
}
