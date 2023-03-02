import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(3);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Progrediu!");
        System.out.println("Conteúdos inscritos de Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Camila:" + devCamila.getConteudosConsluidos());
        System.out.println("XP de Camila:" + devCamila.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Progrediu!");
        devJoao.progredir();
        System.out.println("Progrediu!");
        System.out.println("Conteúdos inscritos de João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Camila:" + devJoao.getConteudosConsluidos());
        System.out.println("XP de João:" + devJoao.calcularTotalXp());
    }
}
