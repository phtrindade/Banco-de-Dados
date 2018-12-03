/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class ModeloPoste {
    private int etiqueta;
    private float altura;
    private String material;
    private float latitude;
    private float longitude;
    private float P_D_etiqueta;
    private String pesquisaPoste;
            

    
    public int getEtiqueta() {return etiqueta;}
  
    public void setEtiqueta(int etiqueta) {this.etiqueta = etiqueta;  }

    public float getAltura() {return altura;}

    public void setAltura(float altura) {this.altura = altura;}

    public String getMaterial() {return material;}

    public void setMaterial(String material) {this.material = material;}

    public float getLatitude() {return latitude;}

    public void setLatitude(float latitude) {this.latitude = latitude;}

    public float getLongitude() {return longitude;}

    public void setLongitude(float longitude) {this.longitude = longitude;}

    public float getP_D_etiqueta() {return P_D_etiqueta;}

    public void setP_D_etiqueta(float P_D_etiqueta) {this.P_D_etiqueta = P_D_etiqueta;}

    /**
     * @return the PesquisaPoste
     */
    public String getpesquisaPoste() {
        return pesquisaPoste;
    }

    /**
     * @param PesquisaPoste the PesquisaPoste to set
     */
    public void setpesquisaPoste(String PesquisaPoste) {
        this.pesquisaPoste = PesquisaPoste;
    }


}
