/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author trindade
 */
public class Coneccao {
    public Statement stm;       // Realiza a pesquisa no BD
    public ResultSet rs;        // Armazena o resultado da pesquisa no BD
    private String Driver  = "org.postgreesql.Driver";      // Identifica o serviço do BD driver será padrão do  Postgree
    private String caminho = "jdbc:postgresql://localhost:5432/M3_BDs";     // identifica o caminha onde esta alocado o BD
    private String usuario = "trindade";
    private String senha   = "Xre300";
    public Connection conec; // variável responsavél pela coneção com BDs
       
    public void coneccao(){
    
        try {
            System.setProperty("jdbc.Drivers", Driver);
            conec=DriverManager.getConnection(caminho, usuario,senha);
            JOptionPane.showMessageDialog(null,"Conecção realizada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na Conecção com BD!\n"+ex.getMessage());
            Logger.getLogger(Coneccao.class.getName()).log(Level.SEVERE, null, ex);
            
        }   
}
    public void desconecta(){
        try{
            conec.close();
            JOptionPane.showMessageDialog(null, "Banco de Dados DESCONECTADO!");
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Não foi possível desconectar o BD!\n"+ex.getMessage());
            
        }
    }
}
