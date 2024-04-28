
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * Classe para demonstrar principio de ec=ncapsulamento
 *
 * @author 2830482221019
 */
public class Conta {
    private int numeroConta;
    private int senha;
    private float saldo;
    
    // construtor da classe 
    public Conta(int numeroConta, int senha, float saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldo;
    }
    
    public void adionarSaldo(float valor){
        setSaldo(getSaldo() + valor);
    }
    
    
    public void retirarSaldo(float valor){
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
        
        if(pwd == getSenha()){
            setSaldo(getSaldo() - valor);
        }
        else {
            JOptionPane.showInputDialog("Senha errda!!!");
            JOptionPane.showInputDialog(null,"Saldo " + getSaldo());
        }
    }
    
    
    // metodo para trocar a senha
    public void trocarSenha(int senhaNova){
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
        
        if(pwd == getSenha())
            setSenha(senhaNova);
        else
            JOptionPane.showInputDialog("Senha errda!!!");
        }
        
     
    
    
    // metodos assessores (getters & setters)

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    } // fim do main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



