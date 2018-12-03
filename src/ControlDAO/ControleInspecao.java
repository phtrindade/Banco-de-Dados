/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.ModeloInspecao;

/**
 *
 * @author trindade
 */
public class ControleInspecao {
  
    Coneccao conex = new Coneccao();
    Model.ModeloInspecao mod = new ModeloInspecao();
    
     public void Salvar(ModeloInspecao mod){
        conex.coneccao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO inspecao(os,data,estado,prumo,condicao_de_fiacao,poste_etiqueta) values(?,?,?,?,?,?)");
            pst.setInt    (1, mod.getOs());
            pst.setString (2, mod.getDate());
            pst.setString (3, mod.getEstado());
            pst.setString (4, mod.getPrumo());
            pst.setString (5, mod.getFiacao());
            pst.setInt    (6, mod.getEtiquetaPoste());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO ao inserir os dados\n"+ex);
            Logger.getLogger(ControlePoste.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        conex.desconecta();
    }
}  

