/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbasic;

/**
 *
 * @author rodrigo
 */
public class Marca {
    
    private int codigo;
    private String descricao;
    
    public Marca(int codigo, String descricao){
        setCodigo(codigo);
        setDescricao(descricao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Marca{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }
    
    
}
