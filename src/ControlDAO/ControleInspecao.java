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
     
     public ModeloInspecao buscaInspecao(ModeloInspecao mod){
         
         conex.coneccao();
         conex.execultaSQL("select *from inspecao where (os,date,poste_etiqueta)::text like'%"+mod.getPesquisaInspecao().toString()+"%'");
         conex.execultaSQL("select *from inspecao where (estado,prumo,fiacao) like'%"+mod.getPesquisaInspecao()+"%'");
        
        try {
            conex.rs.first();
            conex.rs.first();
            mod.setOs(conex.rs.getInt("os"));
            mod.setDate(conex.rs.getString("data"));
            mod.setEstado(conex.rs.getString("estado"));
            mod.setPrumo(conex.rs.getString("prumo"));
            mod.setFiacao(conex.rs.getString("condicao_de_fiacao"));
            mod.setEtiquetaPoste(conex.rs.getInt("poste_etiqueta"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO PESQUISA INSPEÇAO!!!");
            Logger.getLogger(ControleInspecao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return mod;
     
     
     
     }
}  

