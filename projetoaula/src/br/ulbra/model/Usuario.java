
package br.ulbra.model;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    private int pkUsuario;
    private String nomeUsu;
    private String emailUsu;
    private String dataNascUsu;
    private int ativoUsu;
    private String senhaUsu;
    
    public int getPkusuario(){
        return pkUsuario;
    }
    
    public void setPkusuario(int pk_usuario){
       this.pkUsuario = pk_usuario;
    }
    
    public String getNomeUsu(){
        return nomeUsu;
    }
    
    public void setnomeUsu(String nome_usu){
       this.nomeUsu = nome_usu;
    }
    
     public String getEmailUsu(){
        return emailUsu;
    }
    
    public void setEmailUsu(String email_usu){
       this.emailUsu = email_usu;
    }
    
     public String getDataNascUsu(){
        return dataNascUsu;
    }
    
    public void setDataNascUsu(String dataNasc_usu){
       this.dataNascUsu = dataNascUsu;
    }
    
     public int isAtivoUsu(){
        return ativoUsu;
    }
    
    public void setAtivoUsu (int ativo_usu){
       this.ativoUsu = ativo_usu;
    }
    
     public String getSenhaUsu(){
        return senhaUsu;
    }
     
      public void setSenhaUsu(String senha_usu){
        this.senhaUsu = senha_usu;
    }
      
    @Override
      public String toString(){
          return "Usuario {" + "pkUsuario-" + pkUsuario + ", nomeUsu-" + nomeUsu + ", emailUsu" +
                  emailUsu + ", dataNascUsu" + dataNascUsu + ", ativoUsu-" + ativoUsu + ", senhaUsu" +
                  senhaUsu + '}';
      }
      
      
}
