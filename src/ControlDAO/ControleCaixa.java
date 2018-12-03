/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDAO;

import Model.ModeloCaixa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author trindade
 */
public class ControleCaixa {
    Coneccao conex = new Coneccao();
    Model.ModeloCaixa mod = new ModeloCaixa();
    
     public void Salvar(ModeloCaixa mod){
        conex.coneccao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO ponto_de_distribuicao(etiqueta, tipo, capacidade_em_w,latitude,longitude) values(?,?,?,?,?)");
            pst.setInt   (1, mod.getEtiqueta());
            pst.setString(2, mod.getTipoCaixa());
            pst.setFloat (3, mod.getPotencia());
            pst.setFloat (4, mod.getLatitude());
            pst.setFloat (5, mod.getLongitude());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO ao inserir os dados\n"+ex);
            Logger.getLogger(ControlePoste.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
    }
}

