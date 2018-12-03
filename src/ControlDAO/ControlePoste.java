/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDAO;

import ControlDAO.ControlePoste;
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
    
    public ModeloPoste buscaPoste(ModeloPoste mod){
        conex.coneccao();
        System.out.println(mod.getpesquisaPoste());
        
        conex.execultaSQL("select *from poste where etiqueta::text like'%"+mod.getpesquisaPoste().toString()+"%'");
        
        
        try {
            conex.rs.first();
            mod.setEtiqueta(conex.rs.getInt("etiqueta"));
            mod.setAltura(conex.rs.getFloat("altura"));
            mod.setMaterial(conex.rs.getString("material"));
            mod.setLatitude(conex.rs.getFloat("latitude"));
            mod.setLongitude(conex.rs.getFloat("longitude"));
            mod.setP_D_etiqueta(conex.rs.getInt("ponto_de_distribuicao_etiqueta"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO PESQUISA POSTE\n"+ex);
            Logger.getLogger(ControlePoste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conex.desconecta();
        return mod;
       
    }

}
