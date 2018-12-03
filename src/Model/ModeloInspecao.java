
package Model;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author trindade
 */
public class ModeloInspecao {
   // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
    //Date date1 = df.parse(data1);
    private int os;
    private String date;
    private String estado;
    private String prumo;
    private String fiacao;
    private int etiquetaPoste;
   private String pesquisaInspecao;
// private String data1;

    public int getOs() {return os;}

    public void setOs(int os) {this.os = os;}

    public String getDate() {return date;}

    public void setDate(String date) {this.date = date;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}

    public String getPrumo() {return prumo;}

    public void setPrumo(String prumo) {this.prumo = prumo;}

    public String getFiacao() {return fiacao;}

    public void setFiacao(String fiacao) {this.fiacao = fiacao;}

    public int getEtiquetaPoste() {return etiquetaPoste;}

    public void setEtiquetaPoste(int etiquetaPoste) {this.etiquetaPoste = etiquetaPoste;}

    /**
     * @return the pesquisaInspecao
     */
    public String getPesquisaInspecao() {
        return pesquisaInspecao;
    }

    /**
     * @param pesquisaInspecao the pesquisaInspecao to set
     */
    public void setPesquisaInspecao(String pesquisaInspecao) {
        this.pesquisaInspecao = pesquisaInspecao;
    }
}
