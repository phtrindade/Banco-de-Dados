
package Model;

/**
 *
 * @author trindade
 */
public class ModeloCaixa {
    private int etiqueta;
    private float potencia;
    private String tipoCaixa;
    private float latitude;
    private float longitude;

    public int getEtiqueta() {return etiqueta;}

    public void setEtiqueta(int etiqueta) {this.etiqueta = etiqueta;}

    public float getPotencia() {return potencia;}

    public void setPotencia(float potencia) {this.potencia = potencia;}

    public String getTipoCaixa() {return tipoCaixa;}

    public void setTipoCaixa(String tipoCaixa) {this.tipoCaixa = tipoCaixa;}

    public float getLatitude() {return latitude;}

    public void setLatitude(float latitude) {this.latitude = latitude; }

    public float getLongitude() {return longitude;}

    public void setLongitude(float longitude) {this.longitude = longitude;}
}
