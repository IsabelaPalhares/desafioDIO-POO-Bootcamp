package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConsluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {

    }

    public void progredir() {

    }

    public void calcularTotalXp() {

    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConsluidos() {
        return conteudosConsluidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setConteudosConsluidos(Set<Conteudo> conteudosConsluidos) {
        this.conteudosConsluidos = conteudosConsluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConsluidos, dev.conteudosConsluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConsluidos);
    }
}
