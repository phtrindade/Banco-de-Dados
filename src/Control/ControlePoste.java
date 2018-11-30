/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ModeloPoste;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author trindade
 */
public class ControlePoste {
    Coneccao conex= new Coneccao();
    Model.ModeloPoste mod= new ModeloPoste();
    
    public void Salvar(ModeloPoste mod){
        conex.coneccao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO poste(etiqueta, altura, material,latitude,longitude,ponto_de_distribuicao_etiqueta) values(?,?,?,?,?,?)");
            pst.setInt   (1, mod.getEtiqueta());
            pst.setFloat (2, mod.getAltura());
            pst.setString(3, mod.getMaterial());
            pst.setFloat (4, mod.getLatitude());
            pst.setFloat (5, mod.getLongitude());
            pst.setFloat (6, mod.getP_D_etiqueta());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO ao inserir os dados\n"+ex);
            Logger.getLogger(ControlePoste.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
    }
}
