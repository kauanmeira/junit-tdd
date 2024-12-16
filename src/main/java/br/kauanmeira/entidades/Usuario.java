package br.kauanmeira.entidades;

public class Usuario {

    private String nome;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;

        return getNome().equals(usuario.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }
}